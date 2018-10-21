//import java.util.Scanner;
public class HWork4 {
    public static void main(String[] args) {
//Scanner n = new Scanner(System.in);
        double m , n ;
        m = 8;
        n = 1;
double resM = Math.abs(10-m);
double resN = Math.abs(10-n);
double answer = (resM > resN) ? n : m;
       System.out.println("ближайшее к десяти "+ answer);
    }
}
