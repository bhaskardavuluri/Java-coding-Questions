package OnlyoddfromList;

import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> l2 = Arrays.asList(10, 20, 30, 43, 53, 63, 65, 75);
        l2.stream()
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);
    }
}
//by using streams to return the odd elements in the list..


