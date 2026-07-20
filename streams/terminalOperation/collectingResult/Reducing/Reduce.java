package streams.terminalOperation.collectingResult.Reducing;

import java.util.*;

public class Reduce {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
//      Optional<Integer>sum= list.stream()
//                .reduce((a,b)->a+b);
//        System.out.println(sum.get());
//       Optional<Integer>max= list.stream()
//               .max(Integer::compareTo);
//
//        System.out.println(max.get());
//        Optional<Integer>min=list.stream().min(Integer::compareTo);
//        System.out.println(min.get());
//        OptionalDouble avg = list.stream()
//                .mapToInt(Integer::intValue)
//                .average();
//
//        if (avg.isPresent()) {
//            System.out.println(avg.getAsDouble());
//        }
//      long count=list.stream().count();
//        System.out.println(count);
        int sum=list.stream().mapToInt(x->x).sum();
        System.out.println(sum);
    }
}
