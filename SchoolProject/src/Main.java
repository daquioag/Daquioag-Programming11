public class Main {
    public static void main(String[] args) {

        School studentList = new School(); //the studentList calls to the school class, and is where we will store our student list.
        School teacherList = new School(); // the teacher list calls to the school class and is where we will  store our teacher list

        //below  are 10 possible students you can add to the school. THey have the parameters students Firstname, last name and grade.

        studentList.getStudents().add(new Student("Helena", "Bertinelli", 12));
        studentList.getStudents().add(new Student("Hal", "Jordan", 11));
        studentList.getStudents().add(new Student("Jessica", "Cruz", 10));
        studentList.getStudents().add(new Student("Jessica", "Cruz", 10));
        studentList.getStudents().add(new Student("Billy", "Batson", 8));
        studentList.getStudents().add(new Student("Bruce", "Wayne", 12));
        studentList.getStudents().add(new Student("Clark", "Kent", 11));
        studentList.getStudents().add(new Student("Clark", "Kent", 11));
        studentList.getStudents().add(new Student("Oliver", "Queen", 8));
        studentList.getStudents().add(new Student("Diana", "Prince", 12));

        // Below are the 3 teachers that we are going to add to the school.
        // They have the parameters teacher first name, last name and their subject.
        // I implemented the parameters from the Teacher class into a method coming from the School class.
        // This was how I was able to make a method to add to the teacher list.
        teacherList.addLex();
        teacherList.addHarley();
        teacherList.addSlade();

        // this will print out each student according to the size of the current student array list.
        System.out.println("\nThere are "+studentList.getStudents().size()+" students enrolled in the school.\nCurrent List of Students: ");        for (int i=0; i< studentList.getStudents().size();i++) {
            System.out.println(studentList.getStudents().get(i));
        }

        System.out.println("\nThere are "+teacherList.getTeachers().size()+" teachers working at the school. \nCurrent List of teachers: ");
        for (int i=0; i< teacherList.getTeachers().size();i++) {
            System.out.println(teacherList.getTeachers().get(i));
        }

        System.out.println("\n2 students dropped out of school, and one of the teachers was arrested!");

        // We are going to remove two students
        studentList.deleteStudent(); // this calls to the delete student method in the School Class, where it removes the last student from the list
        studentList.deleteStudent();

        // We are going to remove 1 teacher
        teacherList.deleteTeacher(); // this calls to the delete teacher method in the school class, where it removes the last student from the list.

        System.out.println("\nThere are "+studentList.getStudents().size()+" students enrolled in the school.\nCurrent List of Students: ");
        for (int i=0; i< studentList.getStudents().size();i++) {
            System.out.println(studentList.getStudents().get(i));
        }

        System.out.println("\nThere are "+teacherList.getTeachers().size()+" teachers working at the school. \nCurrent List of teachers: ");
        for (int i=0; i< teacherList.getTeachers().size();i++) {
            System.out.println(teacherList.getTeachers().get(i));
        }

        }
    }

