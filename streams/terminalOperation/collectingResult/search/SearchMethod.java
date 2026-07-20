package streams.terminalOperation.collectingResult.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SearchMethod {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));

//        list.stream()
//                .findAny()
//                .ifPresent(System.out::println);
//        list.stream()
//                .findFirst()
//                .ifPresent(System.out::println);

//      boolean t=  list.stream()
//                .anyMatch(x -> x % 2 == 0);
//        System.out.println(t);
        list.add(10);
//        System.out.println(list);
//       boolean t= list.stream()
//                .allMatch(x->x<6);
//        System.out.println(t);
     List<Integer>ts=   list.stream()
                .map(x->x*x)
                .toList();
//     ts.add(5);//stream return list are immutable
     ts.forEach(System.out::println);
        String result = Stream.of("Java", " ", "Stream")
                .reduce("", String::concat);
        System.out.println(result);
    }
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
       String result1= Arrays.stream(word1)
               .reduce("", String::concat);
       String result2= Arrays.stream(word2)
               .reduce("", String::concat);
       if(result1.equals(result2)){
           return true;
       }
       return false;
    }
}
