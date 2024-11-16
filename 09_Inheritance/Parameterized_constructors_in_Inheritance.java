class Rectangle{
    int length;
    int breadth;

    public Rectangle(){
        length = breadth = 1;
    }

    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
}

class Cuboid extends Rectangle{
    int height;
    public Cuboid(){
        height = 1;
    } 

    public Cuboid(int height){
        this.height = height;
    }

    public Cuboid(int length, int breadth, int height){
        super(length, breadth);
        this.height = height;
    }

    public int volume(){
        return length*breadth*height;
    }
}

public class Parameterized_constructors_in_Inheritance {
    public static void main(String args[]){
        Cuboid c = new Cuboid();
        System.out.println(c.volume());

        Cuboid c1 = new Cuboid(2);
        System.out.println(c1.volume());

        Cuboid c3 = new Cuboid(5, 3, 10);
        System.out.println(c3.volume());
    }
}

// NOTE ***
// super() keyword is used to call parameterized constructor of the parent class