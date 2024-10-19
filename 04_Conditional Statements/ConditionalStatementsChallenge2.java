import java.util.Scanner;

public class ConditionalStatementsChallenge2 {
    public static void main(String args[]){
        // Find radix of a number given in a String
        // Binary, Octlal, Hexadecimal
        Scanner sc = new Scanner(System.in);
        String num = "";
        num = sc.nextLine();

        int size = num.length();

        if(num.matches("[01]+")){
            System.out.println("Number is Bianary Radix=2");
        }
        else if(num.matches("[0-7]+")){
            System.out.println("Number is Octal Number Radix=8");
        }
        else if(num.matches("[0-9]+")){
            System.out.println("Number is Decimal Number Radix=10");
        }
        else if(num.matches("[0-9A-F]+")){
            System.out.println("Number is Hexadecimal Number Radix=16");
        }
        else{
            System.out.println("Not a number");
        }
        // Find a given year is leap year or not
    }
};
