package streams.terminalOperation.collectingResult.collecting;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Collect {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        List<Integer>ls= list.stream()
                 .collect(Collectors.toList());
       ls.forEach(System.out::println);
    }
}
