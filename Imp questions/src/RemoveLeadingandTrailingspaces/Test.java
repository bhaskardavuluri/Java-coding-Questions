package RemoveLeadingandTrailingspaces;
//program to remove spaces from both before and after first characters.
public class Test {
    public static void main(String[] args) {
        String Str="  hello World   ";
        String result=Str.trim();  //trim()-method used to perform both the actions
        System.out.println(Str);
        System.out.println(result);
    }
}
