public class HWork6 {
    public static void main(String[] args) {
        int a , b , c  ;
        a = 1;
        b = 4;
        c = 2;
        double d = (double)((b * b) - ( 4 * a * c) );
        double l = Math.sqrt(d);
        System.out.println(d);
        double r = ((( -b ) - l ) / (2 * a));
        double t = ((( -b ) + l ) / (2 * a));
        if (d >= 0){
            System.out.println( r );
            System.out.println( t );
        }
        else {
            System.out.println("Error");
        }


  //System.out.println((double)1/2);
    }
}
