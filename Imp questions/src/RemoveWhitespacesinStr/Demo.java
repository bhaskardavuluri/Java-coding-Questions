package RemoveWhitespacesinStr;
//program to remove whitespaces from a String.
public class Demo {
    public static void main(String[] args) {
        String Str="hello im \t harish";
        String result=Str.replaceAll("\\s+" ,"");  //for removing whitespaces we need to use method called replacAll().
        System.out.println(Str);
        System.out.println(result);
    }
}
