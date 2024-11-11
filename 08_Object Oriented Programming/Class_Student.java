class Student{
    public int roll;
    public String name;
    public String course;
    public int m1, m2, m3;

    public int total_marks(){
        return m1 + m2 + m3;
    }

    public float average_marks(){
        return (float)total_marks()/3;
    }

    public String details(){
        return "Roll: " + roll + "\nName: " + name + "\nCourse: " + course;
    }

    public char grade(){
        if(total_marks() >= 60){
            return 'A';
        }
        else{
            return 'B';
        }
    }

}

public class Class_Student {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.roll = 65;
        s1.name = "Vivek Sarade";
        s1.course = "Engineering";
        s1.m1 = 90;
        s1.m2 = 99;
        s1.m3 = 100;

        System.out.println(s1.total_marks());
        System.out.println(s1.average_marks());
        System.out.println(s1.grade());
        System.out.println();
        System.out.println(s1.details());
    }
}
