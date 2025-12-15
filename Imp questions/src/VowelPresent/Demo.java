package VowelPresent;
//Checking by using Regular expression.


public class Demo {
    public static void main(String[] args) {
        System.out.println(stringContainsVowels("Hello")); // true
        System.out.println(stringContainsVowels("Tvs")); // false
    }

    public static boolean stringContainsVowels(String input) {
        return input.toLowerCase().matches(".*[aeiou].*");
    }

}
