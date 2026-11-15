package chaining;

public class Student {
    private String name;
    private int age;
    private int rollNo;
    private String college;
    public Student(){
        this("Ayansh");
    }
    public Student(String name){
        this(name,0);
    }
    public Student(String name,int age){
        this(name,22,0);
    }
    public Student(String name,int age,String rollNo){
        this(name,age,58,rollNo);
    }
    public Student(String name,int age,int rollNo,String college){
        this.name=name;
        this.age=age;
        this.rollNo=rollNo;
        this.college=college;
    }
    public Student(String name,int age,int rollNo){
        this(name ,age,rollNo,"kit");
    }

    public static void main(String[] args) {
        A a=new B();
        System.out.println(a.x);
    }
}
class A{
    int x=10;
}
class B extends A{
    int x=20;
}
class Student1{

    Student1() {
        this(101);
        System.out.println("Default constructor");
    }

    Student1(int id) {
        this(id, "Ayansh");
        System.out.println("ID constructor");
    }

    Student1(int id, String name) {
        System.out.println("ID + Name constructor");
    }
}