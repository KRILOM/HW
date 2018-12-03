import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Kzad2 {
    public static void main(String[] args) {
        int schetchik = 0;
        Scanner in = new Scanner(System.in);
       // ArrayList<Integer> strList = new ArrayList<>(20);
//        while(schetchik < 20) {
//            strList.add(in.nextInt());
//        schetchik++;
//        }
//        System.out.println(strList.toString());
        HashSet<Integer> hashSet = new HashSet<>(20);
        while(schetchik < 20) {
            hashSet.add(in.nextInt());
            schetchik++;
        }
        System.out.println(hashSet.toString());

    }
}
//    Написать программу со следующим функционалом:
//        сортировка по трём другим спискам:
//        число нацело делится на 3,
//        нацело делится на 2 и
//        все остальные.
//        Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
//
//        Метод printList() должен выводить на экран все элементы всех списков с новой строки.
//        Метод printList(String listName) должен выводить на экран все элементы указанного списка
//LinkedList<String> strLinkedList = new LinkedList<>();// создаем объект
//        strLinkedList.add("String 1 ");
//                strLinkedList.add("String 2 ");
//                strLinkedList.add("String 3 ");
//                strLinkedList.add(1, "String 4");//добавляем на указанную позицию
//                for(String str:strLinkedList){
//                System.out.println(str.toString());
//                }
//
//    Integer[] integers = {23 , 67 , 12, 90};
//    ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(integers));//создаем из масиива список(лист)
//        System.out.println(intList.toString());
//
//                for(Integer i: intList ){//перебор значений списка intList
//                System.out.println(i);
//                }
//

//                TreeSet<String> treeSet = new TreeSet<>();
//        treeSet.add("Element 2");
//        treeSet.add("Element 1");
//        treeSet.add("Element 3");
//        System.out.println(treeSet.toString());//лементы сортируются по возрастанию
//
//        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
//
//        linkedHashSet.add("Element 2 ");
//        linkedHashSet.add("Element 1 ");
//        linkedHashSet.add("Element 3 ");
//        System.out.println(linkedHashSet.toString());