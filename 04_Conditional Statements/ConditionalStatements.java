
public class ConditionalStatements {
    public static void main(String args[]){
        int a = 15, b = 0, c = 6;

        if(a > b && a > c){
            System.out.println("Largest is a: "+a);
        }
        else if(b > a && b > c){
            System.out.println("Largest is b: "+b);
        }
        else{
            System.out.println("Largest is c: "+ c);
        }
    }
       
}

// NOTES --> 
// Relational Operators
// <
// <=
// >
// >=
// ==
// !=

// Logical Operators 
// &&
// ||
// !