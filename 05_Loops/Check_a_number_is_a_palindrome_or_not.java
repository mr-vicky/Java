import java.util.*;

public class Check_a_number_is_a_palindrome_or_not {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int m = n;
        int rev = 0;
        while(n > 0){
            rev = rev * 10 + (n % 10);
            n = n / 10;
        }

        System.out.println(m + " " + rev);
        if(m == rev) System.out.println("Palindrome");
        else System.out.println("Not a Palindrome");
    }
}
