import java.lang.String;

public class StringMethods2{
    public static void main(String args[]){
        // String Methods part 2

        // bool startsWith(String s): returns true/false if the String starts with or not "s"
        String str = "www.google.com";
        System.out.println("startsWith(\"www\"): " + str.startsWith("www"));

        // bool endsWith(String s): returns true/false if the String ends with or not "s"
        System.out.println("endsWith(\".com\"): "+ str.endsWith(".com"));

        // char charAt(int index): returns the character at index
        System.out.println("charAt(4): "+ str.charAt(4));

        // int indexOf(String s): returns the index of string in a given string
        System.out.println("indexOf(\".com\"): "+ str.indexOf(".com"));
        // int indexOf(String s, int index): returns the index of string in a given string, starting after the given index
        System.out.println("indexOf(\"g\"): "+ str.indexOf("g", 5));
        // returns - 1 if not found the given string
        System.out.println("indexOf(\"CODE\"): "+ str.indexOf("CODE"));
        
        // int lastIndexOf(String s): Starts searching from right hand side 
        System.out.println("lastIndexOf(\".\"): "+ str.lastIndexOf("."));

        // int lastIndexOf(String s, int index): Starts searching from right hand side from index
        System.out.println("lastIndexOf(\".\", 9): "+ str.lastIndexOf(".", 9));

        // bool equals(Strig s): Equals true if the strings are equal or else fasle
        String s1 = "JAVA";
        String s2 = "Java";
        String s3 = "python";
        String s4 = "python";

        System.out.println("s1.equals(s2): "+ s1.equals(s2));
        System.out.println("s3.equals(s4): "+ s3.equals(s4));

        // bool equalsIgnoreCase(String s): returns true if both Strings are equal or not by ignoring the cases.
        System.out.println("equalsIgnoreCase(): "+ s1.equalsIgnoreCase(s2));

        // int s1.comapreTo(s2): Check the order of the Strings alphabetically, result will be +ve if s1 > s2, -ve if s1 < s2 and 0 if s1 == s2
        System.out.println("s1.compareTo(s2): "+ s1.compareTo(s2));

        // Difference between "==" and equals()
        String str2 = new String("JAVA");
        System.out.println(s1 == str2); // Comapares the references of the given two Strings
        System.out.println(s1.equals(str2)); // It compares the values of the given two string

        // bool contains(): contains method will find out that a string is present inside or not
        String str3 = "The great wall of China";
        System.out.println("str2.contains(\"China\"): "+ str3.contains("China"));

        // String concat(): String can concat two strings
        System.out.println("s1.concat(s2): "+ s1.concat(s2));
        System.out.println("s1 + s2: "+ s1 + s2); // "+" can be used to concatinate the Strings

        // String valueOf(): Converts the value of other data types into the String data type
        int num = 100;
        String str4 = String.valueOf(num); //"100"
        System.out.println(str4);   
    }  
};

// Note: ******
// bool equals() is different from "==", both gives different results
//  - To compare two strings you must be usign equals() method not "=="
//  - equals() to compares the String value, 
//  - "==" Comapres the compares the String references