public class Teacher {
    private String teacherFirstName;
    private String teacherLastName;
    private String subject;

    Teacher(String teacherFirstName, String teacherLastName, String subject) {
        this.teacherFirstName = teacherFirstName;
        this.teacherLastName = teacherLastName;
        this.subject = subject;
    }

    public String getTeacherFirstName() {
        return teacherFirstName;
    }

    public void setTeacherFirstName(String teacherFirstName) {
        this.teacherFirstName = teacherFirstName;
    }

    public String getTeacherLastName() {
        return teacherLastName;
    }

    public void setTeacherLastName(String teacherLastName) {
        this.teacherLastName = teacherLastName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSuubject(String suubject) {
        this.subject = suubject;
    }

    public String toString() {
        return "Teacher Name: " + this.teacherFirstName + " " + this.teacherLastName + ", Subject: " + this.subject;
    }
}
