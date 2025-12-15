package StringReverse;

public class StringRev1 {
    public static void main(String[] args) {
        String s1="Bhaskar";
        String s2= new StringBuilder(s1).reverse().toString();
        System.out.println(s1);
        System.out.println(s2);
    }
}
