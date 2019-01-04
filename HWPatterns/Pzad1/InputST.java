package Pzad1;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;


public class InputST extends FilterInputStream{

    private byte[] pass;
    private int num = 0;

    public InputST(byte[] pass,InputStream inputStream) {
        super(inputStream);
        this.pass = pass;
    }
    @Override
    public int read() throws IOException{
        int a = super.read();
        a = a ^ pass[num % pass.length];
        num++;
        return a;
    }
}


