import java.util.Scanner;
public class Method_Overloading_Callege_2 {
    static boolean validate(String age){
        boolean res = age.matches("[a-zA-Z\\s]+");
        return res;
    }

    static boolean validate(int age){
        return (age>=3 && age<=15)?true:false;
    }
    public static void main(String args[]){
        // Challege 3: Validate Name(should contains characters only) & age(should be in between 3 to 15)
        System.out.println("Enter the Name and Age of the Student: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();

        System.out.println(validate(name));
        System.out.println(validate(age));

    }
}
