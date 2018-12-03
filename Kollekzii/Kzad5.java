import java.util.ArrayList;
import java.util.Scanner;

public class Kzad5 {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
        ArrayList<String> strLst = new ArrayList<>(10);
        int length = 0 , num = 0;
        for(int i = 0 ; i < 10 ; i++){
            strLst.add(in.nextLine());
            if(strLst.get(i).length() < length && num == 0){ num = i;
            length = strLst.get(i).length();
            }

        }
        if(num > 0 ){
            System.out.println(num);
        }
    }
}
//    Написать программу, которая должна:
//        Считывать с клавиатуры 10 слов в список строк.
//        Определять, является ли список упорядоченным по возрастанию длины строки.
//        В случае отрицательного ответа выводить на экран номер первого элемента, нарушающего такую упорядоченность.
//int length=0, num=0;
//for(int i =0; i<10; i++){
//            allList.add(reader.readLine());
//        if(allList.get(i).length()<length && num==0)
//            num = i;
//        length =   allList.get(i).length();
//        }
//        if (num>0)
//            System.out.println(num);
//}
// }

