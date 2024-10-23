import java.util.*;

public class for_loop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println(i);
        }

        // This is an infinite for loop
        // int i = 1;
        // for(;;){
        //     System.out.println("Running"+ i);
        //     i++;
        // }
    }
}  