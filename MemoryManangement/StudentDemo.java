package MemoryManangement;

public class StudentDemo {
    public static void main(String[] args) {
        try{
            Student s1=new Student("Ayansh",22);
            Student.setCollegeName("");
        System.out.println(Student.collegeName);
        s1.markAttendance();
        }catch (IllegalStudent e){
            System.out.println(e.getMessage());
        }
    }
}
class IllegalStudent extends RuntimeException{
    public IllegalStudent(String message){
        super(message);
    }
}
class Student {
    String name;
    int age;
    static String collegeName;
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    public static void setCollegeName(String collegeName){
        if(collegeName==null||collegeName.equals("")){
            throw new IllegalStudent("no leave any field empty");
        }
        collegeName=collegeName;
    }
    public void markAttendance(){
        System.out.println(name +" is present");
    }
}
