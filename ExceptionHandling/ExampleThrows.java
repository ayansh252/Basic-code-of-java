package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExampleThrows {
    public static void main(String[] args) {
        try{
           readFile();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    private static void readFile() throws FileNotFoundException {
        FileReader fileReader=new FileReader("abc.txt");
    }
}
