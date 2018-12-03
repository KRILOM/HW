import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Kzad7 {
//    public static void main(String[] args) {
//        int k = 0;
//        HashMap<String, String> map = new HashMap<>();
//        Scanner in = new Scanner(System.in);
//        while (k < 10) {
//            map.put(in.nextLine(), in.nextLine());
//            ++k;
//        }
//        System.out.println(map);
//    }
    public static HashMap<String, String> createMap() {
        int k = 0;
        HashMap<String, String> map = new HashMap<>();
        Scanner in = new Scanner(System.in);
        while (k < 10) {
            map.put(in.nextLine(), in.nextLine());
            ++k;
        }
        return map;
    }
    public  static int getsamefirstname(HashMap<String, String > map, String name){
        int x = 0;
        for(Map.Entry<String, String> pair : map.entrySet()){
            if(pair.getValue().equals(name)){
                x++;
            }
        }
        return x;
    }
    public static int getsamelastname(HashMap<String, String> map , String lastname){
        int x = 0;
        for(Map.Entry<String, String> pair2 : map.entrySet()){
            if(pair2.getKey().equals(lastname)){
                x++;
            }
        }
        return x;
    }
}


