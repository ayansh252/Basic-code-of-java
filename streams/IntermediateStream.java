package streams;

import java.util.Arrays;

public class IntermediateStream {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};

      double []arr2=  Arrays.stream(arr)
                .mapToDouble(x->x)
              .toArray();
        System.out.println(Arrays.toString(arr2));
    }
}
