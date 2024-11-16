class Car{
    public void start(){
        System.out.println("start Car");
    }
    public void accelerate(){
        System.out.println("accelerate Car");
    }
    public void changeGear(){
        System.out.println("Change Gear");
    }
}

class LuxaryCar extends Car{
    public void changeGear(){
        System.out.println("Change Gear Automatically");
    }
    public void openRoof(){
        System.out.println("Open roof");
    }
}

public class Method_overriding_example_cars {
    public static void main(String args[]){
        LuxaryCar c = new LuxaryCar();
        c.start();
        c.accelerate();
        c.changeGear();
        c.openRoof();
    }
}