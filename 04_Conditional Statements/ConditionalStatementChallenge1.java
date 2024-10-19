import java.util.Scanner;

public class ConditionalStatementChallenge1 {
    public static void main(String args[]){
        // number is odd or not
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int age = sc.nextInt();
           
        if(number % 2 == 0){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is Odd");
        }

        // The person's age is 18 year or lesser than 18 years 
        if(age > 18){
            System.out.println("age is greater than 18");
        }
        else if(age < 18){
            System.out.println("Age is less than 18");
        }
        else{
            System.out.println("Age is exactly 18");
        }

        System.out.printf("\n\n");
        System.out.println("Enter the marks of 3 subjects");
        float m1, m2, m3;
        m1 = sc.nextFloat();
        m2 = sc.nextFloat();
        m3 = sc.nextFloat();

        float avg = (float)(m1+ m2 + m3)/3;

        // Find grades for given marks
        if(avg > 90){
            System.out.println("A grade and average: "+ avg);
        }
        else if(avg > 80){
            System.out.println("B grade and  average: "+ avg);
        }
        else if(avg > 60){
            System.out.println("C grade and  average: "+ avg);
        }
        else if(avg >= 50){
            System.out.println("D grade and average: "+avg);
        }
        else if(avg >= 35){
            System.out.println("E grade and average: "+ avg);
        }
        else if(avg < 35){
            System.out.println("F grade, You are failed!");
        }
    }
};






