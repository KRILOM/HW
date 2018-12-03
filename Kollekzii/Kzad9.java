import java.util.*;

public class Kzad9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            hashMap.put("name" + i, i * 100);
        }
        System.out.println(hashMap.toString());
        HashMap<String, Integer> hashMap1 = new HashMap<String, Integer>(hashMap);
        Iterator<HashMap.Entry<String, Integer>> iterator = hashMap1.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pair = iterator.next();
            if (pair.getValue() <= in.nextInt()) {
                hashMap1.remove(pair.getKey());
            }
            System.out.println(hashMap1.toString());
        }
    }

}
//    Создать Map<String, Integer> и внести в него десять записей по принципу: «фамилия» - «зарплата».
//        Удалить из всех людей, у которых зарплата ниже введенного с клавиатуры числа
