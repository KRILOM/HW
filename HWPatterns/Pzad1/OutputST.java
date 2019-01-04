package Pzad1;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputST extends FilterOutputStream {
    private byte[] pass;
    private int num = 0;

    public OutputST(OutputStream outputStream, byte[] pass) {
        super(outputStream);
        this.pass = pass;
    }
    @Override
    public void write(int b) throws IOException {
        b = b ^ pass[num % pass.length];
        num++;
        super.write(b);
    }
}
