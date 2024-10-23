import java.util.*;

public class Reverse_a_Number {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;

       int res = 0;
       while(n > 0){
            res = res*10 + (n % 10);
            n /= 10;
       }
       System.out.println(m + " " + res);
    }
};
