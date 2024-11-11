class Subject{
    private String subjectId;
    private String name;
    private int maxMarks;
    private int marksObtain;

    // constructors
    public Subject(String subjectId, String name, int maxMarks){
        this.subjectId = subjectId;
        this.name = name;
        this.maxMarks = maxMarks;
    }

    public String getSubjectId(){
        return subjectId;
    }
    public String getSubjectName(){
        return name;
    }
    public int getMaxMarks(){
        return maxMarks;
    }
    public int getMaxObtain(){
        return marksObtain;
    }

    // Setters
    public void setMaxMarks(int maxMarks){
        this.maxMarks = maxMarks;
    }
    public void setMaxMarksObtain(int marks){
        marksObtain = marks;
    }
    public String toString(){
        return "\nsubjectId: " + subjectId + "\nName: " + name + "\nmaxMarks: " + maxMarks + "\nobtainedMarks: " + marksObtain;
    }
}

public class Array_of_objects_challenge {
    public static void main(String args[]){
        Subject subject[] = new Subject[3];
        subject[0] = new Subject("A001", "DS",  100);
        subject[1] = new Subject("A002", "Algorithms", 100);
        subject[2] = new Subject("A003", "OS", 100);

        for(Subject s: subject){
            System.out.println(s);
        }
    }
}
