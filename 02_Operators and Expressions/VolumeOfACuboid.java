import java.lang.*;
import java.util.Scanner;

class VolumeOfACuboid{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length, breadth and height of a Cuboid:");
        int height, length, breadth, volume, totalArea;
        length = sc.nextInt();
        breadth = sc.nextInt();
        height = sc.nextInt();

        volume = length * breadth * height;
        totalArea = 2 * (length*height + length*breadth + length*breadth);
        System.out.println("Area of Cuboid: "+ totalArea);
        System.out.println("Volume of a Cuboid: "+ volume);
    }
}