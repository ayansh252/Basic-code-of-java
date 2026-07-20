package streams.terminalOperation.collectingResult.CollectorInterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Demo {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>(List.of("Ayansh yadav","Rohit","Aditya"));

//        Map<Integer,String >map=list.stream()
//                .collect(Collectors.toMap(x->x.length(),x->x));
//        System.out.println(map);
        Map<String,Integer> map= IntStream.range(0,list.size())
                .boxed()
                .collect(Collectors
                        .toMap(i->list.get(i),i->i));
        System.out.println(map);
    }
}
