import java.util.HashSet;
import java.util.Iterator;

public class Kzad10 {
    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<>();
        for(int i = 1; i <= 30; i+=2){
            hashSet.add(i);
        }
        System.out.println(hashSet.toString());
        //HashSet<Integer> hashSet1 = new HashSet<Integer>(hashSet);
        Iterator<Integer> iterator = hashSet.iterator();
        while(iterator.hasNext()){
            if(iterator.next() > 10){
                iterator.remove();
            }
        }
        System.out.println(hashSet.toString());
    }
}
//    Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
//        Удалить из множества все числа больше 10.
//
