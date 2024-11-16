class Super{
    public void display(){
        System.out.println("Super Hello");
    }
}

class Sub extends Super{
    public void display(){
        System.out.println("Sub Hello");
    }
}

public class Dynamic_method_dispatch {
    public static void main(String args[]){
        // Dynamic method dispatch: is used to achieve the runtime plymorphism
        Super s = new Sub();
        s.display();
    }
}
