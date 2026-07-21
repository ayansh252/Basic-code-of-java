package streams.terminalOperation.collectingResult.CollectorInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GroupBy {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>(List.of("AA","BB","CC"));
        Map<Integer,List<String>>map;
//       map= list.stream()
//                .collect(Collectors.groupingBy(x->x.length()));
//        System.out.println(map);
//         map=list.stream().collect(Collectors.groupingBy(x->x.length(),
//                 Collectors.mapping(x->
//                         x.toLowerCase(),Collectors.toList())));
//        System.out.println(map);

        String res=list.stream()
                .collect(Collectors.joining("_"));
        System.out.println(res);
    }
}
