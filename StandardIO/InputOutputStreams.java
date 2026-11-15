package StandardIO;

import java.io.IOException;

public class InputOutputStreams {
    public static void main(String[] args) throws IOException {
//        int x=System.in.read();
//        int y=System.in.read();
//        System.out.println(x+" hello");
//        System.out.println(y+" world");
        String s = "";
        int c = 0;
        while (c != '\n') {
            c = System.in.read();
            s += (char)c;
        }
        System.out.println(s);
    }
}
