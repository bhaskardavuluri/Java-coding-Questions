package RemoveWhitespacesinStr;

//program which is used to remove spaces in a string.

public class Test {
    public static void main(String[] args) {
        String Str="hello world java";//for removing only spaces we need to use the method called replace()..
       String result=Str.replace(" ",""); //space must be given for the target then only it can be able to remove the spaces.
        System.out.println(Str);
        System.out.println(result);
    }
}
