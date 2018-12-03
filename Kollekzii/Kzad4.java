import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kzad4 {
    public static void main(String[] args) {
        int k = 0;
        Scanner in = new Scanner(System.in);
        List<String> strings = new ArrayList<>(5);
        while( k < 5 ){
            strings.add(in.nextLine());
            k++;
        }
        System.out.println(strings.toString());
        strings.remove(2);
        System.out.println(strings.toString());
for(int i = strings.size() - 1; i >=0 ; i --){
    System.out.println(strings.get(i) + " ");
            }
        }
}
