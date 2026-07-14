package MemoryManangement;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1=new Student("Ayansh",22);
        s1.markAttendance();
        Student.setCollegeName("KIT");
        System.out.println(Student.collegeName);
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
        collegeName=collegeName;
    }
    public void markAttendance(){
        System.out.println(name +" is present");
    }
}
