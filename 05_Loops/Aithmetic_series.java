import java.lang.*;
import java.util.*;

public class Aithmetic_series{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a, d, and n: ");
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();

        int curr = a;
        for(int i = 0; i < n; i++){
            System.out.print(curr + " ");
            curr = curr + d;
        }
    }
}

// NOTES ***
// Arithmetic series: 1, 2, 3, 4, 5, ... 
// Arithmetic series: a = 1, d = 2-1 = 1