public class ShallowCopy {
    public static void main(String[] args) {
        College c=new College("KIT", "KANPUR");
        Student s=new Student("Ayansh", 22, c);
        Student st=new Student(null, 0, c);
        c.name="IIT";
        System.out.println(s.getCollege().name);
        System.out.println(s.getClass());
        System.out.println(st.hashCode());
    }
}
 final class  Student{
    private String name;
    private final College  college;
    private int age;
    Student(String name,int age,College college){
         this.name=name;
         this.age=age;
         this.college=college;
    }
    public College getCollege(){
        return college;
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