package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntermediateStream2ex {
    public static void main(String[] args) {
        List<String>words=new ArrayList<>();
        words.add("Hello");
        words.add("World");
        words.stream()
                .flatMap(word-> Arrays.stream(word.split("")))
                .forEach(System.out::print);
        System.out.println();
       List<String[]>s= words.stream()
                .map(word->word.split(""))
                .toList();
       s.stream()
               .flatMap(Arrays ::stream)
               .forEach(System.out::print);

    }
}
