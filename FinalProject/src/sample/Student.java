package sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Student {

    public String firstName;
    public String lastName;
    public int grade;
    public String course1;
    public String course2;
    public String course3;



    public String getStudentFirstName() {
        return firstName;
    }

    public int getGrade() {
        return grade;
    }

    public Student(String fN, String lN, int grade, String course1, String course2, String course3) {
        firstName = fN;
        lastName = lN;
        this.grade = grade;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
    }


    public String toString() {
        return "Name: "+firstName+" Grade: "+grade;
    }

    public boolean compare(Student H){
        if (this.firstName.equals(H.firstName)){
            return true;
        }
        else return  false;
    }

    public void writeToFile() throws IOException {
        FileWriter fw = new FileWriter("student.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(firstName+",\r");
        bw.write(lastName+"+\r");
        bw.write(Integer.toString(grade)+".\r");
        bw.write(course1+"-\r");
        bw.write(course2+":\r");
        bw.write(course3+"\r");
        bw.write(";\r");
        bw.close();


    }
}

