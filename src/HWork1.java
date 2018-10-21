import java.util.Scanner;
public class HWork1 {

    public static void main(String[] args) {
        //int a, b, c;
Scanner a = new Scanner(System.in);//ВЫСОТА
Scanner b = new Scanner(System.in);//ДЛИННА
Scanner c = new Scanner(System.in);//ШИРИНА
//int l;
System.out.println( 2*((a.nextInt() * b.nextInt()) + (b.nextInt() * c.nextInt()) + (a.nextInt()*c.nextInt())));
        /*a = 5;//ВЫСОТА
        b = 4;//ДЛИННА
        c = 2;//ШИРИНА
        System.out.println(2 * ((a * b) + (b * c) + (a * c)));*/
        if (a.nextInt() > c.nextInt()) {
            System.out.println(a.nextInt());
        } else if (a == c ){
            System.out.println(c.nextInt());
        }
        else {
            System.out.println(c.nextInt());
        }
    }
}
