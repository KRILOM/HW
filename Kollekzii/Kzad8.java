import java.util.*;

public class Kzad8 {
    public static void main(String[] args) {
        HashMap<String, String> linkedHashmap = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int k = 0;

        while (k < 3) {
            linkedHashmap.put(in.nextLine(), in.nextLine());
            k++;
        }
        for (Map.Entry entry : linkedHashmap.entrySet()) {
            System.out.println(" Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }
}

//    public static void removeAllSummerPeople(Map<String, Date> linkedHashmap) {
//        //делаем итератор
//        Iterator<Map.Entry<String, Date>> iterator = linkedHashmap.entrySet().iterator();
//        while (iterator.hasNext()) {
//            //записываем для краткости значение месяца в переменную
//            int mounth = iterator.next().getValue().getMonth();
//            //проверяется месяц, начиная с 0
//            if ((mounth >= 5) && (mounth <= 7)) {
//                iterator.remove();
//            }
//        }
//    }
//}

//    Создать словарь (Map<String, String>) и внести в него десять записей
// по принципу: «фамилия» - «дата рождения».
//        Удалить из словаря всех людей, родившихся летом.
//public static void main(String[] args) {
//    removeAllSummerPeople(createMap());
//}
//    public static HashMap<String, Date> createMap()
//    {
//        //конструктор устаревший, но валидатор принял тольк такой код. С GregorianCalender компилируется, но не проходит проверку.
//        HashMap<String, Date> map = new HashMap<String, Date>();
//        map.put("Сталлоне0", new Date(1987, 0, 31));
//        map.put("Сталлоне1", new Date(1987, 0, 31));
//        map.put("Сталлоне2", new Date(1987, 0, 31));
//        map.put("Сталлоне3", new Date(1987, 0, 31));
//        map.put("Сталлоне4", new Date(1987, 0, 31));
//        map.put("Сталлоне5", new Date(1987, 0, 31));
//        map.put("Сталлоне6", new Date(1987, 0, 31));
//        map.put("Сталлоне7", new Date(1987, 0, 31));
//        map.put("Сталлоне8", new Date(1987, 0, 31));
//        map.put("Сталлоне9", new Date(1987, 0, 31));
//        return (HashMap<String, Date>)map;
//               /* HashMap<String, GregorianCalendar> map = new HashMap<String, GregorianCalendar>();
//        map.put("Сталлоне0", new GregorianCalendar(1987, 0, 31));
//        map.put("Сталлоне1", new GregorianCalendar(1987, 0, 31));
//        map.put("Сталлоне2", new GregorianCalendar(1987, 0, 31));
//        map.put("Сталлоне3", new GregorianCalendar(1987, 0, 31));
//        map.put("Сталлоне4", new GregorianCalendar(1987, 4, 28));
//        map.put("Сталлоне5", new GregorianCalendar(1987, 6, 26));
//        map.put("Сталлоне6", new GregorianCalendar(1987, 5, 24));
//        map.put("Сталлоне7", new GregorianCalendar(1987, 7, 12));
//        map.put("Сталлоне8", new GregorianCalendar(1987, 0, 1));
//        map.put("Сталлоне9", new GregorianCalendar(1988, 2, 3));
//        //Напишите тут ваш код
//        return (HashMap<String, GregorianCalendar>) map;*/
//    }
//    public static void removeAllSummerPeople(HashMap<String, Date> map)
//    {
//        //делаем итератор
//        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
//        while (iterator.hasNext())
//        {
//            //записываем для краткости значение месяца в переменную
//            int mounth = iterator.next().getValue().getMonth();
//            //проверяется месяц, начиная с 0
//            if ((mounth >= 5) && (mounth <= 7))
//            {
//                iterator.remove();
//            }
//            //Напишите тут ваш код
//            //Создается цикл перебора коллекции с итератором
//       /* for (Iterator<Map.Entry<String, GregorianCalendar>> iterator = map.entrySet().iterator(); iterator.hasNext();)
//        {
//            //в переменную pair присваиваются пары ключ + значение
//            Map.Entry<String, GregorianCalendar> pair = iterator.next();
//            //проверяется месяц
//            if (pair.getValue().get(Calendar.MONTH) >= 5 && pair.getValue().get(Calendar.MONTH) <= 7)
//            {
//            iterator.remove();
//            }
//        }*/
//        }
//    }
//}
