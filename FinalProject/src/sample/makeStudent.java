package sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class makeStudent {
    private static String firstName;
    private static String lastName;
    private static int grade;
    private static String course1;
    private static String course2;
    private static String course3;
    private static FileReader fr;
    private static BufferedReader br;
    private static ArrayList<Student> students = new ArrayList<>();

    public static ArrayList makeAllStudents(String fileName) throws IOException{
        fr = new FileReader(fileName);
        br = new BufferedReader(fr);
        String line;
        String studentString ="";
        while((line = br.readLine()) != null){
            if(!line.equals(";")){
                studentString+=line;
            }else{
                parseStudent(studentString);
                studentString ="";
            }
        }
        return students;
    }
    private static void parseStudent(String string){
        int pos =0;
        String firstName ="";
        String lastName ="";
        int grade =0;
        String course1 ="";
        String course2 ="";
        String course3 ="";
        for (int i =0; i<string.length();i++){
            if(string.substring(i,i+1).equals(",")){
                pos =i;
                firstName = string.substring(0,pos);
                lastName = string.substring(pos+1, string.indexOf("+"));
                grade = Integer.parseInt(string.substring(string.indexOf("+")+1, string.indexOf(".")));
                course1 = string.substring(string.indexOf(".") + 1, string.indexOf("-"));
                course2 = string.substring(string.indexOf("-") + 1, string.indexOf(":"));
                course3 = string.substring(string.indexOf(":") + 1);

            }
        }

        if(!students.contains(firstName)) {
            students.add(new Student(firstName, lastName, grade, course1, course2, course3));
        }

    }
}
