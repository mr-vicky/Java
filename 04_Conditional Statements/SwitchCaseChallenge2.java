// Menu drievn program for Arithmetic operations

import java.util.*;

public class SwitchCaseChallenge2{
    public static void main(String args[]){
        // Input
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");
        System.err.println();

        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.nextLine();
        System.err.println("Enter the operation Name");
        String operation = sc.nextLine();

        switch(operation){
            case "ADD": System.err.println(num1 + num2);
                        break;
            case "SUB": System.err.println(num1 - num2);
                        break;
            case "MUL": System.err.println(num1 * num2);
                        break;
            case "DIV": System.err.println(num1 / num2);
                        break;
            default: System.err.println("Invalid Option");
        }
    }
}