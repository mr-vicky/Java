// Display name of the day based on the number
// -> 1: Monday 
// -> 2: Tuesday
// ...
import java.util.*;

public class ConditionalStatementChallenge4{
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int remainder = num % 7;

        if(remainder == 1){
            System.out.println("Monday");
        }
        else if(remainder == 2){
            System.err.println("Tuesday");
        }
        else if(remainder == 3){
            System.err.println("Wednesday");
        }
        else if(remainder == 4){
            System.err.println("Thursday");
        }
        else if(remainder == 5){
            System.err.println("Friday");
        }
        else if(remainder == 6){
            System.err.println("Saturday");
        }
        else if(remainder == 0){
            System.err.println("Sunday");
        }
    }
}
