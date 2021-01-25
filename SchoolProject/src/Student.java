public class Student {
    private String StudentFirstName;
    private String StudentLastName;
    private int grade;
    static int studentNumber=0;
    private int idNumber;

    Student(){


    }

    Student(String studentFirstName, String studentLastName, int grade){
        this.StudentFirstName = studentFirstName;
        this.StudentLastName = studentLastName;
        this.grade = grade;
        this.idNumber = studentNumber;
        studentNumber++;

    }

    public String getStudentFirstName() {
        return StudentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        StudentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return StudentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        StudentLastName = studentLastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
    public String toString(){
        return "Student Name: "+ this.StudentFirstName+" " + this.StudentLastName+", Grade: " +this.grade;
    }
}
