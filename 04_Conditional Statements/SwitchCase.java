import java.util.*;

public class SwitchCase{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number up 5");
        int num = sc.nextInt();

        switch(num){
            case 1: System.err.println("One");
                    break;
            case 2: System.err.println("Two");
                    break;
            case 3: System.err.println("Three");
                    break;
            case 4: System.err.println("Four");
                    break;
            case 5: System.err.println("Five");
                    break;
            default: System.err.println("Invalid Number");
                    break;
        }
    }
};


// NOTES ---> 
// Switch cases are faster than if-else statements - 
// Reason : if-else statements check all the condtions on by one, but swtich cases directly jump on the cases.