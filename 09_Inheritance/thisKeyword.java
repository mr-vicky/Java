class Rectangle{
    private int length;
    private int breadth;    

    public Rectangle(int length, int breadth){
        System.out.println(this.length + " " + length);
        System.out.println(this.breadth+ " " + breadth);

        this.length = length;
        this.breadth = breadth;
    }
}

public class thisKeyword {
    public static void main(String args[]){
        Rectangle r = new Rectangle(10, 20);
    }
}
