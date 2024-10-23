import java.lang.*;
import java.util.*;

public class Fibonacci_series {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        
        for(int i = 0; i < n; i++){
            int c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }
}
// NOTES ***
// Fibonacci Sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21....