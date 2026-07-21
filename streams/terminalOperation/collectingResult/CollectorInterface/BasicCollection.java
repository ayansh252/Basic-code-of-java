package streams.terminalOperation.collectingResult.CollectorInterface;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BasicCollection {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(1, 2, 3, 4, 5));
    List<Integer> list=   arr.stream()
                .map(x->x+1)
                .collect(Collectors.toList());
    Set<Integer> set=list.stream()
            .map(x->x+1)
            .collect(Collectors.toSet());
//    set.forEach(System.out::println);
//List<String> str=new ArrayList<>(List.of("aaa","bbbb","ccccc"));
//
//        Map<Integer,String> map=str.stream()
//                .collect(Collectors.toMap(x->x.length(),x->x));
//        System.out.println(map);
        List<String> str=new ArrayList<>(List.of("aaa","bbb","ccc"));
        Map<Integer,String> map= IntStream.range(0,str.size())
                .boxed().collect(Collectors.toMap(i->i,i->
                        str.get(i)));
        map.forEach((k,v)->{
            System.out.println("Key  "+k+" value "+v);});
    }
}
