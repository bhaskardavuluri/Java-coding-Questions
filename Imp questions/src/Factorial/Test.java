public class Test {
    public  static long factorial(long n){
        if(n==1){
            return 1;

        }
        else
            return n*factorial(n-1);
    }

    public static void main(String[] args) {
        long number=10;
        long result=factorial(number);
        System.out.println("factorial of "+number+ ":is"+  result);
    }
}