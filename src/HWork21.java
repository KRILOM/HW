import java.util.Scanner;
public class HWork21 {

    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        Scanner in3 = new Scanner(System.in);
        int a = in1.nextInt();
        int b = in2.nextInt();
        int c = in3.nextInt();
        if (a >= b & a >= c & b >= c) {
            System.out.println("Возрастающая последовательность:" + c + " " + b + " " + a );
        }
        else if(a >= c & a >= b & c >= b){
            System.out.println("Возрастающая последовательность:" + b + " " + c + " " + a );
        }
        else if(a >= c & a == b){
            System.out.println("Возрастающая последовательность:" + c + " " + b + " " + a );
        }
        else if(a >= b & a == c){
            System.out.println("Возрастающая последовательность:" + b + " " + c + " " + a );
        }
        else if(b >= a & b >= c & a >= c){
            System.out.println("Возрастающая последовательность:" + c + " " + a + " " + b );
        }
        else if(b >= c & b >= a & c >= a){
            System.out.println("Возрастающая последовательность:" + a + " " + c + " " + b );
        }
        else if(b >= a & b == c){
            System.out.println("Возрастающая последовательность:" + a + " " + c + " " + b );
        }
        else if(b >= c & b == a){
            System.out.println("Возрастающая последовательность:" + c + " " + a + " " + b );
        }
        else if(c >= a & c >= b & a >= b){
            System.out.println("Возрастающая последовательность:" + b + " " + a + " " + c );
        }
        else if(c >= b & c >= a & b >= a){
            System.out.println("Возрастающая последовательность:" + b + " " + a + " " + c );
        }
        else if(c >= a & c == b){
            System.out.println("Возрастающая последовательность:" + a + " " + b + " " + c );
        }
        else if(c >= b & c == a){
            System.out.println("Возрастающая последовательность:" + b + " " + a + " " + c );
        }
        else if(c == a & a == b){
            System.out.println("Возрастающая последовательность:" + a + " " + b + " " + c );
        }
    }
}
