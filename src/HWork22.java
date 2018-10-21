public class HWork22 {
    public static void main(String[] args) {
int sum = 0;
        for (int i = 000001; i <= 999999; i++){
    int num1 = i / 100000;
    int num2 = (i % 100000) / 10000;
    int num3 = (i % 10000) / 1000;
    int num4 = (i % 1000) / 100;
    int num5 = (i % 100) / 10;
    int num6 = i % 10;
        if (num1 + num2 + num3 == num4 + num5 + num6){
            sum++;
    }
}
        System.out.println("lucky tickets:" + sum);
    }
}



