import java.io.*;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Scanner;

public class Szad1 {

    private int readByte(File fileForRead, File fileForWrite, Charset charset) throws IOException {
       try(
           InputStream in = new FileInputStream(fileForRead);
           ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
           FileOutputStream out = new FileOutputStream(fileForWrite);
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
           byte[] numberOfCopyedBytes = s.getBytes(charset);
           int i = numberOfCopyedBytes.length;
       //запись массива байт в другой файл
           bout.write(buf, 0 , buf.length);
           return i;
       }
    }
    public String fileForm (String s){
        String check = "[^.txt]";
        String giveBack = null;
        if(s.replaceAll(check, "").equals(".txt")){
            giveBack = s;
        }else{
            giveBack = " File must be in txt format";
            //System.out.println(giveBack);
        }
        return giveBack;
    }
    public static void main(String[] args){

        Szad1 szad1 = new Szad1();
        Scanner scanner = new Scanner(System.in);
        System.out.println(" File to copy");
        File fileToCopy = new File(scanner.nextLine());
        System.out.println("EnterFile");
        File fileCopy = new File(scanner.nextLine());
        try {
            System.out.println(szad1.readByte(fileToCopy,fileCopy,Charset.forName("UTF-8")));
        }
            catch (FileNotFoundException e ){
            System.out.println("File whith that name is not founded ");
        }catch (IOException e ){
            e.printStackTrace();
        }
    }

}
