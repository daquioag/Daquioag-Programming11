package sample;

public class Friend {
    public String name;
    public String job;
    public int age;

    Friend(String n, String j, int age) {
        name = n;
        job = j;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public String getJob(){
        return job;
    }
    public int getAge(){
        return age;
    }
    
    public String toString(){
        return name;
    }



}


