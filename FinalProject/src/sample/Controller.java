package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

//these are all my SceneBuilder Containers.
public class Controller {
    public Label lblRating1;
    public Label lblRating2;
    public Label lblRating3;
    public Label lblTeacherName;
    public Label lblStudentFirstName;
    public Label lblStudentLastName;
    public Label lblSubject;
    public TextField txtGetFirstName;
    public TextField txtGetLastName;
    public TextField txtGetGrade;
    public ListView studentList;
    public CheckBox cbPhysical;
    public CheckBox cbWood;
    public CheckBox cbComputer;
    public CheckBox cbHome;
    public CheckBox cbPsychology;
    public CheckBox cbEconomics;
    public CheckBox cbSociology;
    public CheckBox cbBusiness;
    public CheckBox cbChemistry;
    public CheckBox cbBiology;
    public CheckBox cbPhysics;
    public CheckBox cbMath;
    public Label lblGrade;
    public Label lblc2;
    public Label lblc1;
    public Label lblc3;
    public String course1;
    public String course2;
    public String course3;

// in the GUI, if you clicked on a teacher's name in the first tab "List of Teachers" you'll find the name, subject and ratings of the teachers.
    public void showStats1(MouseEvent mouseEvent) {
        lblTeacherName.setText("Jon John");
        lblSubject.setText("Chemistry");
        lblRating1.setText("3");
        lblRating2.setText("3");
        lblRating3.setText("3");


    }public void showStats2(MouseEvent mouseEvent) {
        lblTeacherName.setText("Jan Jane");
        lblSubject.setText("Biology");
        lblRating1.setText("3");
        lblRating2.setText("4");
        lblRating3.setText("3");


    }public void showStats3(MouseEvent mouseEvent) {
        lblTeacherName.setText("Jerry Smith");
        lblSubject.setText("Math");
        lblRating1.setText("1");
        lblRating2.setText("1");
        lblRating3.setText("1");


    }public void showStats4(MouseEvent mouseEvent) {
        lblTeacherName.setText("Rick Sanchez");
        lblSubject.setText("Physics");
        lblRating1.setText("5");
        lblRating2.setText("5");
        lblRating3.setText("5");


    }public void showStats5(MouseEvent mouseEvent) {
        lblTeacherName.setText("Meg Griffin");
        lblSubject.setText("Psychology");
        lblRating1.setText("5");
        lblRating2.setText("5");
        lblRating3.setText("1");


    }public void showStats6(MouseEvent mouseEvent) {
        lblTeacherName.setText("Lisa Simpson");
        lblSubject.setText("Economics");
        lblRating1.setText("5");

    }public void showStats7(MouseEvent mouseEvent) {
        lblTeacherName.setText("Jackie Chan");
        lblSubject.setText("Sociology");
        lblRating1.setText("1");
        lblRating2.setText("1");
        lblRating3.setText("5");


    }public void showStats8(MouseEvent mouseEvent) {
        lblTeacherName.setText("Master Roshi");
        lblSubject.setText("Business Education");
        lblRating1.setText("5");
        lblRating2.setText("5");
        lblRating3.setText("5");


    }public void showStats9(MouseEvent mouseEvent) {
        lblTeacherName.setText("Jim Garrison");
        lblSubject.setText("Physical Education");
        lblRating1.setText("5");
        lblRating2.setText("5");
        lblRating3.setText("5");


    }public void showStats10(MouseEvent mouseEvent) {
        lblTeacherName.setText("Carol Danvers");
        lblSubject.setText("Wood Shop");
        lblRating1.setText("1");
        lblRating2.setText("1");
        lblRating3.setText("3");


    }public void showStats11(MouseEvent mouseEvent) {
        lblTeacherName.setText("Eric Cartman");
        lblSubject.setText("Home Economics ");
        lblRating1.setText("5");
        lblRating2.setText("5");
        lblRating3.setText("1");

    }public void showStats12(MouseEvent mouseEvent) {
        lblTeacherName.setText("Duck Duck Goose");
        lblSubject.setText("Computer Science");
        lblRating1.setText("3");
        lblRating2.setText("3");
        lblRating3.setText("5");
    }
// if one checkbox in the "1st Course" Column is selected, deselect all the other checkboxes.
    @FXML
   public void Chemistry() {
        if (cbChemistry.isSelected()) {
            cbBiology.setSelected(false);
            cbPhysics.setSelected(false);
            cbMath.setSelected(false);
        }
    }
    @FXML
    public void Biology() {
        if (cbBiology.isSelected()) {
            cbChemistry.setSelected(false);
            cbPhysics.setSelected(false);
            cbMath.setSelected(false);
        }
    }
    @FXML
    public void Physics() {
        if (cbPhysics.isSelected()) {
            cbBiology.setSelected(false);
            cbChemistry.setSelected(false);
            cbMath.setSelected(false);
        }
    }
    @FXML
    public void Math() {
        if (cbMath.isSelected()) {
            cbBiology.setSelected(false);
            cbPhysics.setSelected(false);
            cbChemistry.setSelected(false);
        }
    }
    // if one checkbox in the "2nd Course" Column is selected, deselect all the other checkboxes.

    @FXML
    public void Psychology(){
        if(cbPsychology.isSelected()){
            cbEconomics.setSelected(false);
            cbSociology.setSelected(false);
            cbBusiness.setSelected(false);
        }
    }
    @FXML
    public void Economics(){
        if(cbEconomics.isSelected()){
            cbPsychology.setSelected(false);
            cbSociology.setSelected(false);
            cbBusiness.setSelected(false);
        }
    }
    @FXML
    public void Sociology(){
        if(cbSociology.isSelected()){
            cbEconomics.setSelected(false);
            cbPsychology.setSelected(false);
            cbBusiness.setSelected(false);
        }
    }
    @FXML
    public void Business(){
        if(cbBusiness.isSelected()){
            cbEconomics.setSelected(false);
            cbPsychology.setSelected(false);
            cbSociology.setSelected(false);
        }

    }
    // if one checkbox in the "3rd Course" Column is selected, deselect all the other checkboxes.

    @FXML
    public void PhysicalEducation(){
        if(cbPhysical.isSelected()){
            cbWood.setSelected(false);
            cbComputer.setSelected(false);
            cbHome.setSelected(false);
        }
    }
    @FXML
    public void WoodShop(){
        if(cbWood.isSelected()){
            cbPhysical.setSelected(false);
            cbComputer.setSelected(false);
            cbHome.setSelected(false);
        }
    }
    @FXML
    public void ComputerScience(){
        if(cbComputer.isSelected()){
            cbHome.setSelected(false);
            cbWood.setSelected(false);
            cbPhysical.setSelected(false);
        }
    }
    @FXML
    public void HomeEc() {
        if (cbHome.isSelected()) {
            cbPhysical.setSelected(false);
            cbWood.setSelected(false);
            cbComputer.setSelected(false);
        }
    }

    // want to use the add courses button to add a student, along with his grade and 3 courses.
    public void AddCourses(ActionEvent event) {
        String firstName = txtGetFirstName.getText();
        String lastName= txtGetLastName.getText();
        int grade = Integer.parseInt(txtGetGrade.getText());
        // if and else statements to correspond with what 1st course the user has selected.
        if (cbChemistry.isSelected()) {
            course1 = "Chemistry";
        }
        else if (cbBiology.isSelected()){
                course1 ="biology";
            } else if (cbPhysics.isSelected()) {
            course1 = "Physics";
        } else{
                course1="Math";
            }
        // if and else statements to correspond with what 2nd course the user has selected.

        if (cbPsychology.isSelected()) {
            course2 = "Psychology";
        }
        else if (cbEconomics.isSelected()){
            course2 ="Economics";
        } else if (cbSociology.isSelected()) {
            course2 = "Sociology";
        } else{
            course2="Business Education";
        }
        // if and else statements to correspond with what 3rd course the user has selected.

        if (cbPhysical.isSelected()) {
            course3 = "Physical Education";
        }
        else if (cbWood.isSelected()){
            course3 ="Wood Working";
        } else if (cbComputer.isSelected()) {
            course3 = "Computer Science";
        } else{
            course3="Home Economics";
        }
        Student Temp = new Student(firstName, lastName, grade, course1,course2,course3);
        studentList.getItems().add(Temp);

       /* if (cbChemistry.isSelected()&& cbPsychology.isSelected()&&cbPhysical.isSelected()) {
            String course1 = "Chemistry";
            String course2 ="Psychology";


            Student Temp = new Student(name, grade, course1,course2,course3);
            studentList.getItems().add(Temp);
        } else if (cbBiology.isSelected()) {
            String course1 = "Biology";
            Student Temp = new Student(name, grade, course1course2,course3);
            studentList.getItems().add(Temp);
        } else if (cbPhysics.isSelected()) {
            String course1 = "Physics";
            Student Temp = new Student(name, grade, course1course2,course3;
            studentList.getItems().add(Temp);
        } else {
        */
// this clears all the buttons and check boxes after pressing add student button
        txtGetFirstName.clear();
        txtGetLastName.clear();
        txtGetGrade.clear();
        cbChemistry.setSelected(false);
        cbBiology.setSelected(false);
        cbPhysics.setSelected(false);
        cbMath.setSelected(false);
        cbSociology.setSelected(false);
        cbComputer.setSelected(false);
        cbHome.setSelected(false);
        cbWood.setSelected(false);
        cbPhysical.setSelected(false);
        cbEconomics.setSelected(false);
        cbPsychology.setSelected(false);
        cbBusiness.setSelected(false);
    }

    public void displayStudent(MouseEvent event){
        Student temp;
        temp =(Student) studentList.getSelectionModel().getSelectedItem();
        lblStudentFirstName.setText(temp.firstName);
        lblStudentLastName.setText(temp.lastName);
        lblGrade.setText(Integer.toString(temp.getGrade()));
        lblc1.setText(temp.course1);
        lblc2.setText(temp.course2);
        lblc3.setText(temp.course3);
    }

    public void saveStudent(ActionEvent actionEvent) throws IOException {
        ObservableList<Student> myList = studentList.getItems();
        Set<Student> set1 = new LinkedHashSet<>(myList);
        for(Student s: set1){
            s.writeToFile();
        }
        studentList.getItems().clear();

    }
    public void loadStudent(ActionEvent actionEvent) throws IOException {
        studentList.getItems().clear();
        ArrayList<Student> students = makeStudent.makeAllStudents("student.txt");

        Set<Student> set = new LinkedHashSet<>(students);
        students.clear();
        students.addAll(set);

        for (Student s: set){
            studentList.getItems().add(s);
        }

    }
}
