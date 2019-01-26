package TW;

//Используя блокирующие очереди сосчитать топ слов как из предыдущего задания. Вариантом решения может быть:
//        main создает потоки Worker, которые ждут строки из очереди на методе take(). Далее main читает с диска и добавляет строки в очереди, последними строками будут стоп-строки.
//        Worker'ы при получении стоп-строки добавляют свою внутреннюю мапу в следующую очередь и завершают свою работу.
//        main же ждет мапы со всех воркеров на второй очереди и результат собирает в результирующую мапу.
//        В итоге, не должно быть нигде явной синхронизации и использованы две блокирующие очереди

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {

    public static void main(String[] args) {
        ArrayList<Thread> threadArrayList = new ArrayList<>();
        int countProces = Runtime.getRuntime().availableProcessors();

        BlockingQueue<String> stringBlockingQueue = new ArrayBlockingQueue<>(10, true);
        BlockingQueue<Map<String, Integer>> stringIntegerBlockingQueue = new ArrayBlockingQueue<>(countProces, true);
        Map<String, Integer> finishMap = new HashMap<>();

        for(int i = 0; i < countProces; i++){
            threadArrayList.add(new Thread(new Worker(stringBlockingQueue, stringIntegerBlockingQueue)));
        }
        for(Thread thread:threadArrayList){
            thread.start();
        }
        try{
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("wp.txt")));

            String string;

            while((string = bufferedReader.readLine()) != null){
                stringBlockingQueue.put(string);
            }
            for(int i = 0; i < countProces; i++){
                stringBlockingQueue.put("finish");
            }
            for(Thread thread:threadArrayList){
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(Map<String, Integer> map: stringIntegerBlockingQueue){
            for(Map.Entry entry: map.entrySet()){
                finishMap.merge(entry.getKey().toString(), (Integer) entry.getValue(),(v1, v2) -> v1 + v2);
            }
        }
        finishMap.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).limit(100).forEach(System.out::println);
    }
}
