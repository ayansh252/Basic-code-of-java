package streams;

import java.util.stream.Stream;

public class StreamOf {
    public static void main(String[] args) {
      Stream<Integer>stream1=Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
       Stream<Integer>stream2=Stream.empty();
       stream1.forEach(System.out::println);
        System.out.println(stream2.count());
    }
}
