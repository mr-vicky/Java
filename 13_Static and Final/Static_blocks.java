class Test{
    static{
        System.out.println("Block 1");
    }
    static{
        System.out.println("Block 2");
    }
}

public class Static_blocks {
    // This block will run first no matter object is created or not
    static{
        System.out.println("Block 0");
    }
    public static void main(String args[]){
        Test t = new Test(); 
        System.out.println("Main");
    }
}

// NOTES ***
// - static blocks are executed when the object is created, 
// - static blocks are directly executed if they are created in the class, with having main function