// Write a program to check that the year is a leap year or not.
import java.util.*;

public class ConditionalStatementsChallenge3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();

        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println("YES, Its a Leap year");
                }
                else{
                    System.err.println("NOt a Leap year");
                }
            }
            else{
                System.out.println("YES, its a Leap year");
            }
        }
        else{
            System.out.println("Not a Leap year");
        }
    }
}