import java.util.*;

class KeyboardRead{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        // int a, b, c;
        // System.out.println("Enter tow integers: ");
        // a = s.nextInt();
        // b = s.nextInt();
        // c = a + b;

        // System.out.println("Sum is " + c);

        // part-2
        String name;
        System.out.println("Enter your Name: ");
        name = s.nextLine();
        System.out.println("Welcome"+ name);
    }
}

// Notes ======================
/*
- nextInt(): get the integer value
- nextFloat(): Get the floating value
- nextDouble(): Get the next double value
- next(): If you want to read the string or set of characters (Reads one word)
- nextLine(): If you want to read a sentence (Reads multiple words)
- nextByte():...
- nextShort():...
- nextLong():...
- nextBoolean():...

- hasNextInt(): returns true/false if number is INT or not
- hasNextFlaot(): returns true/false if number is Float or not

*/ 