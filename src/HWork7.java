public class HWork7 {
    public static void main(String[] args) {
        int initiaNumber = 613;
        int first = initiaNumber % 10;
        System.out.println(first);
        int second = (initiaNumber%100 - first)/10;
        System.out.println(second);
        System.out.println(initiaNumber%100);
        int third = (initiaNumber%1000 - second)/100;
        System.out.println(third);
        System.out.println(initiaNumber%1000);
                int largest = (first > second) ? first:second;
        System.out.println("наибольшая цифра числа:"+ largest);
  /*int max = 0, s =208;
  max = (s%100/10 >= s%10) ? s%100/10 :s%10;
  max = (s/100 >  max) ? s%100 : max;
        System.out.println(max);
*/
    }
}
