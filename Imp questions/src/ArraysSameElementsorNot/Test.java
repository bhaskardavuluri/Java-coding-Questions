package ArraysSameElementsorNot;
//program to check wheather the two arrays contains same elements are bot which are in same size and order does not matter..
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int [] a={10,20,30,40,50};
        int [] b={50,20,10,40,30};
      Arrays.sort(a);  //first we need to do sorting for both the arrays then only we can able to
        Arrays.sort(b);  //compare the arrays...
        if (Arrays.equals(a,b)){
            System.out.println("arrays contains same elements");
        }
        else {
            System.out.println("arrays does not contains same elements");
        }
    }
}
