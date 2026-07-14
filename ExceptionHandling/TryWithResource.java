package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {
    public static void main(String[] args) {
        try(FileReader fileReader = new FileReader("file.txt")){

        }catch (IOException e){}
    }
}
