package LamdaExpression;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionInterface {
    public static void main(String[] args) {
        ToIntFunction<Integer> t=x->x+1;
        System.out.println(t.applyAsInt(5));
        Function<Integer,Integer> add=x->x+1;
        Function<Integer,Integer> mul=x->x*4;

        int ans=add.andThen(mul).apply(5);
        System.out.println(ans);
        Function<String,String> upper=x->x.toUpperCase();
        Function<String,Integer> len=x->x.length();
        Function<String,Integer>res=upper.andThen(len);
        System.out.println(res.apply("java"));
        List<Integer>list= List.of(5,4,3,2,1);

        Optional<Integer> sum=list.stream()

                .max((x,y)->x.compareTo(x-y));
//                .reduce((a,b)->a+b);
        System.out.println(sum.get());
    }
}
