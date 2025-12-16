package OnlyoddfromList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args) {
        List <Integer> n= Arrays.asList(22,33,44,55,66,77,88,99);
        List <Integer> oddnumbers=n.stream()
                .filter(x->x%2!=0)
                .collect(Collectors.toList());
        System.out.println(oddnumbers);
    }
}
