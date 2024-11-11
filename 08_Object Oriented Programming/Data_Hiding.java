class Rectangle{
    private int length;
    private int breadth;

    public int getLength(){
        return length;
    }
    
    public int getBreadth(){
        return breadth;
    }

    // Set Methods: are used to validate and set the data
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

public class Data_Hiding {
    public static void main(String args[]){
        Rectangle r = new Rectangle();
        r.setLength(10);
        r.setBreadth(20);
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());
    }
}
