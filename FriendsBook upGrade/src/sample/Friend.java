package sample;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Friend {
    public String name;
    public String job;
    public Double age;

    Friend(String name, String job, Double age) {
        this.name = name;
        this.job = job;
        this.age = age;
    }
    public void writeToFile() throws IOException {
        FileWriter fw = new FileWriter("Friend.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(name+",\r");
        bw.write(job+".\r");
        bw.write(Double.toString(age)+"\r");
        bw.write(";\r");
        bw.close();
        }

    public String getName() {
        return name;
    }
    public String getJob(){
        return job;
    }
    public Double getAge(){
        return age;
    }
    
    public String toString(){
        return name;
    }



}


