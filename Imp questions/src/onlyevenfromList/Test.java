package onlyevenfromList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Integer> l3= Arrays.asList(10,20,30,40,50,60,70,80,99);
        List <Integer> evennumbers=l3.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toList());
        System.out.println(evennumbers);//to return in the list...


    }
}
