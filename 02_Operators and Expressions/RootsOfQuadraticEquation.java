import java.lang.*;
import java.util.Scanner;
// import java.lang.Math;

public class RootsOfQuadraticEquation {
    public static void main(String args[]){
        int a, b, c;
        System.out.println("Enter the value of a, b and c");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        double r1 = (-b + (Math.sqrt((b*b) - (4*a*c))))/2f*a;
        double r2 = (-b - (Math.sqrt((b*b) - (4*a*c))))/2f*a;
        
        System.out.println("Roots of the quadratic equation "+a+"x^2 + "+b+"x + "+c+" = 0, are:");
        System.out.println("r1 = "+ r1);
        System.out.println("r2 = "+ r2);
    
    }
};