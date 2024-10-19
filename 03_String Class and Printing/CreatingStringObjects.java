import java.lang.*;

public class CreatingStringObjects{
    public static void main(String args[]){
        String str1 = "Java program"; // String created in pool
        System.out.println(str1);

        String str2 = new String("Java program"); // String created in Heap
        System.out.println(str2);

        char c[] = {'h', 'e', 'l', 'l', 'o'};
        String str3 = new String(c); // String using character array
        System.out.println(str3);

        byte b[] = {65, 66, 67, 68, 69, 70};
        String str4 = new String(b); // String using byte array 
        System.out.println(str4);

        String str5 = new String(b, 1, 3); // string starting from the 1st index and of length 3 of Byte array b
        System.out.println(str5);
    }
}

// Notes -> 
// Command to see all the methods of String in terminal --> Command: javap java.lang.String