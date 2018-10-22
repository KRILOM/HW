public class HWork27 {
    public static void main(String[] args) {
        int sum=0;
        for(int i= 1; i <= 2400; i++){
            int num1=i/1000;
            int num2=(i%1000)/100;
            int num3=(i%100)/10;
            int num4=i%10;
            if (num1 + num2 == num3 + num4){
            sum++;
        }
        }
        System.out.println(sum);
    }
}
