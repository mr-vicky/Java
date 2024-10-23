import java.util.*;

public class Display_number_in_words{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        
        // 1. Convert the number into the string 
        // 2. Run the loop from all indexes
        // 3. use charAt()
        // 4. use switch case for printing the values

        // 1
        String str = String.valueOf(n);
        // 2
        for(int i = 0; i < str.length(); i++){
        // 3        
                char curr = str.charAt(i);
        //4      
                switch(curr){
                        case '0': System.out.print("zero ");
                                break;
                        case '1': System.out.print("one ");
                                break;
                        case '2': System.out.print("two ");
                                break;
                        case '3': System.out.print("three ");
                                break;
                        case '4': System.out.print("four ");
                                break;
                        case '5': System.out.print("five ");
                                break;
                        case '6': System.out.print("six ");
                                break;
                        case '7': System.out.print("seven ");
                                break;
                        case '8': System.out.print("eight ");
                                break;
                        case '9': System.out.print("nine ");
                                break;
                }
        }       
    }
}