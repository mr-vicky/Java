class CoffeeMachine{
    private float coffeeQty;
    private float waterQty;
    private float milkQty;
    private float sugerQty;

    static private CoffeeMachine my = null;

    private CoffeeMachine(){
        coffeeQty = 1;
        waterQty = 1;
        milkQty = 1;
        sugerQty = 1;
    }

    public void fillWater(float qty){
        waterQty = qty;
    }
    public void fillSuger(float qty){
        waterQty = qty;
    }
    
    public float getlCoffee(){
        return 0.23f;
    }

    static CoffeeMachine getInstance(){
        if(my == null){
            my = new CoffeeMachine();
        }
        return my;
    }
}


public class Singleton_class {  
    public static void main(String args[]){
        CoffeeMachine c1 = CoffeeMachine.getInstance();
        CoffeeMachine c2 = CoffeeMachine.getInstance();
        CoffeeMachine c3 = CoffeeMachine.getInstance();

        if(c1 == c2 && c2 == c3)
            System.out.println("c1, c2 and c3 are SAME");
    }
}

// NOTES ***
// Singletop class: Only one object of a singletop class can be created