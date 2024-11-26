class Test{
    int a = 10; // Default
    private int b = 20; // private
    protected int c = 30; // protected
    public int d = 40; // public
}

public class Access_modifiers {
    public static void main(String args[]){
        
    }
}

// NOTES ***
// Outer class can only be default or public, it should not be private or protected
// Private Access Modifier : is only accessible in the same class only, outside that class, they are not accessible
// Public Access Modifier: They are accessible everywhere
// Default Access Modifier: They are accessible within the same package, not accessible outside the package
// Protected Access Modifier: They are accessible everywhere except in the different package non sub-class