import java.util.Scanner;

public class HWorkStroki1 {
    public static void main(String[] args) {
    System.out.println("Введите строку: ");
    Scanner in1 = new Scanner(System.in);
    String str = in1.nextLine();
    System.out.println("Введите подстроку: ");
    String strpod = in1.nextLine();
    System.out.println("Введите новую подстроку: ");
    String strpodnew = in1.nextLine();
    if (str.contains(strpod)){
        str = str.replace(strpod, strpodnew);
        System.out.println(str);
    }
    else {
        System.out.println("False!");
    }

    }
}
