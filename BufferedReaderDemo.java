import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String str = br.readLine();
        System.out.println(str);
    }
}