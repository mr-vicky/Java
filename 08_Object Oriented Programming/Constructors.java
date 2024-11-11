import org.w3c.dom.css.Rect;

class Rectangle{
    private double length;
    private double breadth;

    public Rectangle(){
        length = 1;
        breadth = 1;
    }

    public Rectangle(double l, double b){
        length = l;
        breadth = b;
    }

    public Rectangle(double s){
        length = breadth = s;
    }

    public double getLength(){
        return length;
    }

    public double getBreadth(){
        return breadth;
    }

    public void setLength(int l){
        if(l > 0)
            length = l;
        else 
            length = 0;
    }
    
    public void setBreadth(int b){
        if(b > 0)
            breadth = b;
        else 
            breadth = 0;
    }
}


public class Constructors {
    public static void main(String args[]){
        Rectangle r1 = new Rectangle();
        System.out.println(r1.getLength());
        System.out.println(r1.getBreadth());

        Rectangle r2 = new Rectangle(10, 20);
        System.out.println(r1.getLength());
        System.out.println(r1.getBreadth());
    }
}
