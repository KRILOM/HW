//        Скопировать файл (имена файлов задаются с клавиатуры).
//        Программа должна выводить количество скопированных байт.

import java.io.*;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Scanner;


public class Szad1 {

    private int readByte(File ReadFile, File WriteFile, Charset charset) throws IOException {
       try(
           InputStream in = new FileInputStream(ReadFile);
           ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
           FileOutputStream out = new FileOutputStream(WriteFile);
           BufferedOutputStream bout = new BufferedOutputStream(out))
       {
           byte[] buf = new byte[1024];
           int len;
           while ((len = in.read(buf)) > 0) {
              System.out.println(Arrays.toString(buf));
               byteArrayOutputStream.write(buf, 0, len);
           }
           System.out.println(len);
           String s = new String(byteArrayOutputStream.toByteArray());
           byte[] CopyBytesNum = s.getBytes(charset);
           int i = CopyBytesNum.length;

           bout.write(buf, 0 , buf.length);
           return i;
       }
    }
    public String fileForm (String s){
        String c = "[^.txt]";
        String back = null;
        if(s.replaceAll(c, "").equals(".txt")){
            back = s;
        }else{
            back = " File must be in txt format";
        }
        return back;
    }
    public static void main(String[] args){

        Szad1 szad1 = new Szad1();
        Scanner scanner = new Scanner(System.in);
        System.out.println(" File to copy");
        File a = new File(scanner.nextLine());
        System.out.println("EnterFile");
        File b = new File(scanner.nextLine());
        try {
            System.out.println(szad1.readByte(a,b,Charset.forName("UTF-8")));
        }
            catch (FileNotFoundException e ){
            System.out.println("File with that name is not founded ");
        }catch (IOException e ){
            e.printStackTrace();
        }
    }
}
