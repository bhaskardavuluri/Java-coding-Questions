package SecondHighestValueinArray;

public class Test {
    public static void main(String[] args) {
        int [] arr={10,20,30,40,100,50};
        int result=findsecondhighest(arr); //first create this method and use it..
        System.out.println("second highest is: "+result);
    }
    public static  int findsecondhighest(int[] arr){
        int highest= Integer.MIN_VALUE;
        int secondhighest= Integer.MIN_VALUE;
        for (int i:arr){
            if(i>highest){
                secondhighest=highest;
                highest=i;
            } else if (i>secondhighest) {
                secondhighest=i;
            }
        }
        return secondhighest;

    }

}
