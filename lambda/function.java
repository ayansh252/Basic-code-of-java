package lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class function {
    public static void main(String[] args) {
        Function<Integer,Integer>square=x->x*x;
        System.out.println(square.apply(10));
        Consumer<Integer>consumer=x->System.out.println(x);
        consumer.accept(5);
        Supplier<Double>supplier=()->Math.random();
        System.out.println(supplier.get()*10);
        Predicate<Integer>predicate=x->x>5;
        System.out.println(predicate.test(5));
    }
}
