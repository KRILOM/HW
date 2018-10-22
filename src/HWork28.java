import java.util.Scanner;
public class HWork28 {
    public static void main(String[] args) {
        Scanner x1 = new Scanner(System.in);
        Scanner x2 = new Scanner(System.in);
        Scanner y1 = new Scanner(System.in);
        Scanner y2 = new Scanner(System.in);
        Scanner z1 = new Scanner(System.in);
        Scanner z2 = new Scanner(System.in);
        int a1 = x1.nextInt();
        int a2 = x2.nextInt();
        int b1 = y1.nextInt();
        int b2 = y2.nextInt();
        int c1 = z1.nextInt();
        int c2 = z2.nextInt();
        double X,Y,Z,d1,d2,d3;
        X = Math.sqrt((b1-a1)*(b1-a1)+(b2-a2)*(b2-a2));
        Y = Math.sqrt((c1-a1)*(c1-a1)+(c2-a2)*(c2-a2));
        Z = Math.sqrt((c1-b1)*(c1-b1)+(c2-b2)*(c2-b2));
        d1 = X*X;
        d2 = Y*Y;
        d3 = Z*Z;
        if ((d1 == d2 + d3) | (d2 == d1 + d3) | (d3 == d1 + d2)){
            System.out.println("Треугольник прямоугольный");
        }
        else{
            System.out.println("Попробуй еще");
        }
            }
}
