abstract class KFC{
    public KFC(){
        System.out.println("KFC Constructor");
    }
    public void menu(){
        System.out.println("KFC Menu");
    }
    abstract public void billing();
    abstract public void offers();
} 

class myKFC extends KFC{
    public myKFC(){
        System.out.println("My KFC");
    }
    public void billing(){
        System.out.println("myKFC billing");
    }
    public void offers(){
        System.out.println("myKFC offers");
    }
    public void festivalOffers(){
        System.out.println("myKFC festivalOffers");
    }
}

public class Abstract_class_example_KFC {
    public static void main(String args[]){
        // KFC k = new KFC(); // error: KFC is abstract; cannot be instantiated

        myKFC k1 = new myKFC();
        k1.menu();
        k1.billing();
        k1.offers();
        k1.festivalOffers();
    }
}

// NOTES ***
// This example shows that how we have decoided standers for myKFC outlets(subclass)