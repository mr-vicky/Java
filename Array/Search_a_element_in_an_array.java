import java.lang.*;
import java.util.*;

public class Search_a_element_in_an_array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        int arr[] = {10, 22, 31, 44, 62, 75, 36, 93, 90};

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                System.out.println(i);
                System.exit(0); // this will stop the program at here
            }
        }
        System.out.println("Element not found!");
    }    
}
