class Super{
    public void display(){
        System.out.println("Super Hello");
    }
}

class Sub extends Super{
    @Override
    public void display(){
        System.out.println("Sub Hello");
    }
}

public class Method_overriding{
    public static void main(String args[]){
        Super sup = new Super();
        sup.display();

        // Method Overriding
        Super sub = new Sub();
        sub.display();
    }
};