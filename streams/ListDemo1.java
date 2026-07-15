package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListDemo1 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));

//        list.stream()
//                .filter(e->e%2==0)
//                .map(e->e*10)
//                .forEach(System.out::println);
        int []arr={1,2,2,3,4,5,6};
        Arrays.stream(arr)
                .skip(2)
                .distinct()
                .filter(e->e%2==0)
                .map(e->e*10)
                .limit(2)
                .forEach(System.out::println);
    }
}
