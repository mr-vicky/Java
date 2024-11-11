class Rectangle{
    public double length;
    public double breadth;

    public double area(){
        return length * breadth;
    }

    public double perimeter(){
        return 2 * area();
    }

    public boolean isSquare(){
        return length == breadth;
    }
}

public class Class_Rectangle {
    public static void main(String args[]){
        Rectangle r1 = new Rectangle();
        r1.length = 4;
        r1.breadth = 6;

        System.out.println(r1.area());
        System.out.println(r1.perimeter());
        System.out.println(r1.isSquare());
        
    }
}
