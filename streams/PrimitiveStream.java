package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitiveStream {
    public static void main(String[] args) {
        LongStream longStream=LongStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        IntStream intStream=longStream.mapToInt(x->(int)x*2);
//        intStream.forEach(System.out::println);
        //longStream is already consumed or read that's why again reading same Stream
        //gives illegalStateException because the stream is currently empty nothingf there
        // to read
//        List<Long> res=longStream
//                .boxed()
//
//                .collect(Collectors.toList());
//  res.forEach(System.out::println); //ERORR OCCURRED
    }
}
