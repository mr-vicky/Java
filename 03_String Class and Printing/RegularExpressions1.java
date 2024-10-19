import java.lang.*;

public class RegularExpressions1{
    public static void main(String args[]){
        // Method ->  boolean java.lang.String.matches(String regex)
        //  - Tells whether or not this string matches the given regular expression.

        // MATCHING CHARACTERS --->
        String str = "XZ";

        // . => Any single character, digit, symbol
        System.out.println(str.matches("."));

        // [abc] => Exactly given letters, single letter from the given letters
        System.out.println(str.matches("[abc]"));
        
        // [abc][vz] => one letter from firt bracket, and second leeter from the second bracket, two alphabets are compulsory 
        System.out.println(str.matches("[abc][yz]"));

        // [^abc] => Expect abc, anything other than abc
        System.out.println(str.matches("[^abc]"));

        // [a-z1-9] => a to z or 1 to 7, Single character form a-z or 1-9
        System.out.println(str.matches("[a-z1-9]"));

        // A | B => A or B, Either A or B only
        System.out.println(str.matches("A|B"));

        // XZ => Exactly XZ
        System.out.println(str.matches("XZ"));
    }
};