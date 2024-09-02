import java.util.Scanner;
import java.lang.Math;
import java.lang.*;

public class AreaOfTriangle {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        // Area of triangle Method : 1
        /*
        System.out.println("Enter the Height: ");
        float height = obj.nextFloat();
        System.out.println("Enter the base: ");
        float base = obj.nextFloat();
        
        double area = 0.5f*(base*height);
        System.out.println("Area of a Triangle: "+ area);
        */ 


        // Area of triangle method : 2
        int a, b, c;
        float s;
        System.out.println("Entet the sides of a triangle a, b and c: ");
        a = obj.nextInt();
        b = obj.nextInt();
        c = obj.nextInt();

        s = (a + b + c)/2f;
        double area2 = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area2: "+String.format("%.5f", area2));
        
    }
}
