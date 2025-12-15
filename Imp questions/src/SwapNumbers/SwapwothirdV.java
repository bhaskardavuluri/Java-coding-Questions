package SwapNumbers;

public class SwapwothirdV {
    public static void main(String[] args) {
        int a=10;
        int b=100;
        System.out.println("Before  swapping "+a);
        System.out.println("Before swapping "+b);
        b=b+a;
        a=b-a;
        b=b-a;
        System.out.println("After swapping "+a);
        System.out.println("After swapping "+b);

    }
}
