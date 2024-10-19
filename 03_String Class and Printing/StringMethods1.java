import java.lang.String;

public class StringMethods1 {
    public static void main(String args[]){
        // Methods of String
        String str = "Welcome";
        System.out.println(str);

        // int length()
        int l = str.length();
        System.out.println("length(): "+l);

        // String toLowerCase(): Create a new String with all lowercase characters
        System.out.println("toLowerCase(): "+str.toLowerCase());

        // String toUpperCase(): Create a new String with all uppercase characters
        System.out.println("toUpperCase(): "+str.toUpperCase());

        // String trim(): create a new String by removing all the blank spaces(Leading or tailing blankspaces only) 
        String s = "   I Love Java       ";
        int s_length = s.length();
        System.out.println("length before using trim(): "+ s_length);
        System.out.println("trim(): "+  s.trim());
        System.out.println("length after using trim(): " + s.trim().length());

        // String substring(int begin): returns a substring starting from begin index
        String sub_str = str.substring(2);
        System.out.println(sub_str);

        // String substring(int begin, int end): returns a substring starting from the beginning index and ending on end index
        String sub_str2 = str.substring(2, 4);
        System.out.println(sub_str2);

        // String replace(char old, char new) : returns a new String by replacing the chracter of the String
        System.out.println("replace(c, k): " + str.replace('c', 'k'));

        // Checking if two string are same or not
        String s1 = "Java";
        String s2 = new String("Java"); // Because One is created in Heap and another is at Pool
        System.out.println(s1 == s2);
    }
}

// Notes: *****
// String objects are immutable they cannot be modified
// Methos cannot modify the string, so they returns new String