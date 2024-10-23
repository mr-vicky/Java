// After adding the cubes of the digits of a number, if you are getting the same number then it is called an Armstrong number

import java.util.Scanner; 
import java.lang.*;

public class Finding_a_number_is_Armstrong_or_not {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number = n;

        int res = 0;
        while(n > 0){
            int digit = n % 10;
            res += Math.pow(digit, 3);
            n /= 10;
        }

        System.out.println(res + " " + number);
        if(res == number)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
};
