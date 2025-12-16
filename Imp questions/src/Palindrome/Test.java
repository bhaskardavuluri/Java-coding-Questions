package Palindrome;
//palindrome check by using StringBuilder.
public class Test {
    public static void main(String[] args) {
        String s="radaj";
        String Reversed=new StringBuilder(s).reverse().toString();
        if (s.equals(Reversed)){
            System.out.println("it is a palindrome");
        }
        else {
            System.out.println("it is not  a palindrome");
        }
    }
}
