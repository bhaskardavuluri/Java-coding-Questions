package ArrayShuffle;
//program to shuffle the elements in an array..
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Integer [] arr={10,20,80,1,2,3,4,5};
        List<Integer> list= Arrays.asList(arr);
        Collections.shuffle(list);
        System.out.println(Arrays.toString(arr));
        System.out.println(list);  //try running 3 to 4 times the position of the elements will change ...
    }
}
