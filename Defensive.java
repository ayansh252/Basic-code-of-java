public class Defensive{
    public static void main(String[]args){
        College college=new College("IIT Guwahati", "Assam");
        Student s=new Student("Ayansh", 22, college);
        college.name = "Changed College";
        System.out.println(s.getCollege().name);
        System.out.println(s.getCollege().address);
    }
}
final class Student{
private String name;
private int age;
private final College college;

Student(String name,int age,College college){
    this.name=name;
    this.age=age;
     this.college = new College(college.name, college.address);
}

public College getCollege(){
    return new College(college.name,college.address);
}

}

class College{
 String name;
 String address;
 College(String name,String address){
    this.name=name;
    this.address=address;
 }
}