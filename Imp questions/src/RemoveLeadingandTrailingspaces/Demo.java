package RemoveLeadingandTrailingspaces;
//program to remove the spaces before the first character which is known as Leadingspaces..
public class Demo {
    public static void main(String[] args) {
        String Str="    Rahul gandhi";
        String result=Str.stripLeading();
        System.out.println(Str);
        System.out.println(result);
    }
}
