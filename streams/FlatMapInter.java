package streams;

import java.util.List;

public class FlatMapInter {
    public static void main(String[] args) {
        List<List<Integer>>list=List.of(
                List.of(1,2),
                List.of(3,4)
        );
        list.stream()
                .flatMap(List::stream)
                .map(i->i*2)
                .forEach(System.out::print);
    }
}
