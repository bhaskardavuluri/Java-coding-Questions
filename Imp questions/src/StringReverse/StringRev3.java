package StringReverse;

public class StringRev3 {
    public static void main(String[] args) {
        String s1="Manisha";
        String s2="";
        for(int i=s1.length()-1;i>=0;i--){
            s2+=s1.charAt(i);   //charAt()- it is used to specify the indexing of every element in the String.
        }
        System.out.println(s1);
        System.out.println(s2);
    }
}
