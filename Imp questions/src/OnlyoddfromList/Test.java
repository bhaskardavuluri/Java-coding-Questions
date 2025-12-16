package OnlyoddfromList;

import java.util.Arrays;
import java.util.List;

public class Test{
    public static void main(String[] args) {
        List <Integer> l1=Arrays.asList(111,23,33,41,55,25) ;
        boolean result =onlyoddnumbers(l1);
        System.out.println(result);
    }
    public static  boolean onlyoddnumbers(List<Integer> l1){
        for (int i:l1) {
            if (i % 2 == 0) {
                return false;
            }
        }
            return true;
        }

    }
//this is just by using normal for-loop and if condition in only list and to return a boolean value



