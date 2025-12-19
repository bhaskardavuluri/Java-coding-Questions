package SumofAllElementsinanArray;
//sum of all elements in an Integer array..
public class Test {
    public static void main(String[] args) {
        int [] l={1,2,3,4,5,6};
        int sum=0;
        for (int i:l){
            sum+=i;
        }
        System.out.println(sum);
    }
}
