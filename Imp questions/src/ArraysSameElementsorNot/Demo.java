package ArraysSameElementsorNot;

import java.util.Arrays;

//program to check wheather the arrays contains same elements or not if it consists of different  Array Sizes.
public class Demo {
    public static void main(String[] args) {
        int [] a={10,20,30,40,50};
        int [] b={50,20,30,40,10,60};
        if (a.length!=b.length){
            System.out.println("Arrays does not contains same elements");
            return;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        if (Arrays.equals(a,b)){
            System.out.println("same elements");
        }
        else {
            System.out.println("not same elements");

        }

    }
}
