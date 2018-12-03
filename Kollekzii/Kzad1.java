import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Kzad1 {
    public static void main(String[] args) {
        int k = 0;
        Scanner in2 = new Scanner(System.in);
        String userChoise = in2.nextLine();
        Scanner in = new Scanner(System.in);
        ArrayList<String> strList = new ArrayList<>();
        strList.ensureCapacity(5);
        while(k < 5 ){
            strList.add(in.nextLine());
            k++;
        }
        System.out.println(strList.toString());

    if(userChoise.equals("short string")){
        String min = Collections.min(strList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
        System.out.println(min);
    }
    }
}
//    Написать программу со следующим функционалом:
//        Считывание максимум 5 строк с клавиатуры,
//        занесение строк в список,
//        поиск самой короткой строки,
//        вывод самой короткой строки на экран по запросу пользователя (команда в консоле /short string)
//        Если одинаково коротких строк несколько, выводить каждую с новой строки.

