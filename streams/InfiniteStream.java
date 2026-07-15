package streams;

import java.util.stream.Stream;

public class InfiniteStream {
    public static void main(String[] args) {
//        Stream.iterate(1,i->i+1)
//                .limit(10)
//                .forEach(System.out::print);
        Stream.generate(Math::random)
                .map(x->x*10)
                .limit(10)
                .forEach(System.out::print);
    }
}
