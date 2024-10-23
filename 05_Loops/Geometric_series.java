import java.lang.*;
import java.util.*;

public class Geometric_series{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // first value of series
        int r = sc.nextInt(); // common ration
        int n = sc.nextInt(); // total values

        int curr = a;
        for(int i = 0; i < n; i++){
            System.out.print(curr + " ");
            curr = curr * r;
        }
    }
}