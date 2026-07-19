package streams.terminalOperation.collectingResult;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToList {
    public static void main(String[] args) {
        List<String> res=new ArrayList<>(List.of("Ayansh","Rohit","Aditya"));
        List<String>list=res.stream().toList();
         list
                 .stream().map(x-> x.split(""))
                 .forEach(System.out::println);
//        list.stream()
//                .flatMap(x-> Arrays.stream(x).map(
//                        y->y+'$'
//                ))
//                .forEach(System.out::println);
    }
}
