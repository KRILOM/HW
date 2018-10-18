public class HWork1 {

    public static void main(String[] args) {
        int a, b, c;

        a = 5;//ВЫСОТА
        b = 4;//ДЛИННА
        c = 2;//ШИРИНА
        System.out.println(2 * ((a * b) + (b * c) + (a * c)));
        if (a > c) {
            System.out.println(a);
        } else {
            System.out.println(c);
        }
    }
}
