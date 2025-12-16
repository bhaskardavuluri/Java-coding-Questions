package ArraySorting;
//program to sort an list of array of elements..
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int [] numbers={10,-1,-2,-3,35,22,34,45,109};
        Arrays.sort(numbers);//used to sort the elements in an ascending order.
        System.out.println(Arrays.toString(numbers));//for printing the sorted list of elements in the form of string.
                                                     //if we wont use tostring()- means it will print the address...
    }
}
