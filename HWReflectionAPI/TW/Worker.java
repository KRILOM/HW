package TW;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

public class Worker implements Runnable{

private BlockingQueue<String> strings;
private BlockingQueue<Map<String, Integer>> stringIntegerBlockingQueue;
private Map<String, Integer> map = new HashMap<>();

    public Worker(BlockingQueue<String> strings, BlockingQueue<Map<String, Integer>> stringIntegerBlockingQueue) {
        this.strings = strings;
        this.stringIntegerBlockingQueue = stringIntegerBlockingQueue;
       }

    @Override
    public void run() {

        String string = null;
        try{
            while (!(string = strings.take()).equals("finish")){
                String[] symbols = string.toLowerCase().replaceAll("\\p{P}", "").trim().split("\\s");

                for(String symbol: symbols){
                    if(map.containsKey(symbol)){
                        map.put(symbol, map.get(symbol)+1);
                    }
                    else{
                        map.put(symbol, 1);
                    }

                }
            }
            stringIntegerBlockingQueue.put(map);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
