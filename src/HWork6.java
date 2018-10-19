public class HWork6 {
    public static void main(String[] args) {
        int a , b , c , d ;
        a = 1;
        b = 2;
        c = 1;
        d = (((b ^ 2) - ( 4 * a * c) )^(1/2));
        if (d >= 0){
            System.out.println((( - b ) - d ) / ( 2 * a) );
            System.out.println((( -b )+ d ) / ( 2 * a ) );
        }
        else {
            System.out.println("Error");
        }

    }
}
