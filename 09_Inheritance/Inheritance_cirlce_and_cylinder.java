class Circle{
    public double radius;

    public Circle(){
        radius = 0;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getCircumference(){
        return 2 * Math.PI * radius;
    }
}

class Cylinder extends Circle{
    public double height;

    public Cylinder(){
        height = 0;
    }

    public double getVolume(){
        return getArea() * height;
    }
    
}

public class Inheritance_cirlce_and_cylinder {
    public static void main(String args[]){
        Circle circle = new Circle();
        Cylinder cylinder = new Cylinder();

        cylinder.height = 10;
        cylinder.radius = 4;

        System.out.println(String.format("%.2f", cylinder.getVolume()));
    }
}
