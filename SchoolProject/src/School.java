import java.util.ArrayList;

public class School {

    private ArrayList<Teacher> teachers = new ArrayList<>();{
    }

    private ArrayList<Student> students = new ArrayList<>();{
    }

    ArrayList<String> courses = new ArrayList<>();
    {
        courses.add("Physics");
        courses.add("Psychology");
        courses.add("Physical Education");
    }

    private  String City = "Metropolis";

    public String getSchoolName() {
        return SchoolName;
    }

    public void setSchoolName(String schoolName) {
        SchoolName = schoolName;
    }

    private  String SchoolName = "Justice League Secondary School";

    public int getNumberOfStudents() {
        return NumberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        NumberOfStudents = numberOfStudents;
    }

    private int NumberOfStudents = 10;

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }


// I used the remove method to delete the last position in the student array list
    public void deleteStudent() {
        students.remove(students.size() - 1);

    }
//I used the remove method to delete the last position in the teacher array list.
    public void deleteTeacher() {
        teachers.remove(teachers.size() - 1);
    }

    public void addStudent() {
    }
    /* I am not sure how to add a student using a method that is not from the main page.
     // as seen below,
     // I could have added all the students and teachers individually using their own methods, with their specific parameters.

 examples:
     public void addHelena() {
     students.add(new Student("Helena", "Bertinelli", 12));
    }

    public void addJessica() {
        students.add(new Student("Jessica", "Cruz", 10));

*/

    public void addLex() { //the lines below are how I added the teachers to the teacher list.
        teachers.add(new Teacher("Lex", "Luthor", "Physics"));
    }
    public void addHarley() {
        teachers.add(new Teacher("Harley", "Quinn", "Psychology"));
    }
    public void addSlade(){
        teachers.add(new Teacher("Slade", "Wilson", "Physical Education"));

    }

}

