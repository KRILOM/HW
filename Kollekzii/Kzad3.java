import java.util.ArrayList;
import java.util.Scanner;
public class Kzad3 {
    public static void main(String[] args) {
        int k = 0;
        Scanner in = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>(10);
        while (k < 10){
            arrayList.add(in.nextLine());
                    k++;
        }
        System.out.println(arrayList.toString());
        ArrayList<String> result = doubleValues(arrayList);
//        System.out.println(result.toString());
        for (String entry: result) {
            System.out.println(entry);
        }
    }
public static ArrayList<String> doubleValues(ArrayList<String> arrayList){
int i = 0;
for(String value : arrayList){
    arrayList.set(i , value + value);
    i++;
}
    return arrayList;
}
}
//    Написать программу со следующим функционалом:
//        Считывание  с клавиатуры 10 слов в список строк.
//        Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
//        Метод printList()  должен выводить результат на экран (каждое значение с новой строки).
