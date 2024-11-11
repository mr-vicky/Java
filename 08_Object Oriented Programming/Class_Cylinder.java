class Cylinder{
    public double radius;
    public double height;

    public double lid_area(){
        return Math.PI * radius * radius;
    }

    public double total_surface_area(){ 
        return  2*Math.PI*radius*(radius + height);
    }

    public double volume(){
        return lid_area()*height;
    }
    
    public double circumference(){
        return 2*Math.PI*radius;
    }
}

public class Class_Cylinder {
    public static void main(String args[]){
        Cylinder c1 = new Cylinder();
        c1.radius = 7;
        c1.height = 10;

        System.out.println(String.format("%.2f", c1.lid_area()));
        System.out.println(String.format("%.2f", c1.total_surface_area()));
        System.out.println(String.format("%.2f", c1.volume()));
    }
}
