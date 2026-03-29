import java.io.IOException;

public class InputStream {
    public static void main(String[] args) throws IOException{
        // int x=System.in.read();
        // System.out.println(x);
        String s="";
        int c;
        while ((c = System.in.read())!='\n') {
          
            s+=(char)c;
        }
        System.out.println(s);
    }
}
