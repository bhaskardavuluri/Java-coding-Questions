package StringReverse;

public class StringRev2 {
    public static void main(String[] args) {
        String s1="Jay";
        String s2=new StringBuffer(s1).reverse().toString(); //toString is used to convert the objects into strings.
        System.out.println(s1);
        System.out.println(s2);

    }
}
