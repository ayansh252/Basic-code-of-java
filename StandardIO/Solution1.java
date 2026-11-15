package StandardIO;

import java.util.Iterator;

public class Solution1 {
    public static void main(String[] args) {
//        College college=new College("KIT","Kanpur");
//        Student student=new Student(22,"Ayansh",college);
//        Student student1=new Student(22,"Ayansh",college);
//        System.out.println(student.equals(student1));
//        System.out.println(student.getAge());
//        System.out.println(student.getName());
//      Test1 test=new Test1();
//      test.name="Aditya";
//      Test1 test2=new Test1();
//      test2.name="Aditya";
//        System.out.println(test2.equals(test));
      String s1="Hello";
      s1.concat("world");
//        System.out.println(s1);
        print(2,"Ayansh");
    }
    public static <T,U> void print(T t,U u){
        System.out.println(t);
        System.out.println(u);
    }
}
class Student{
    private final int age;
    private final String name;
    private final College college;
    public Student(int age,String name,College college){
        this.age=age;
        this.name=name;
        this.college=new College(college.name, college.address);
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public College getCollege(){
        return new College(college.name, college.address);
    }
}
class College{
    String name;
    String address;
    public College(String name,String address){
        this.name=name;
        this.address=address;
    }
}
class Test1{
    String name;
    @Override
    public boolean equals(Object o) {
        if(o==null)return false;
        if(this==o)return true;
        if(o.getClass()!=this.getClass())return false;
        Test1 test=(Test1)o;
        return test.name.equals(this.name);
    }
}
class ArrayList{
    private Integer arr[];
    private int size;
    
    public Iterator iterator(){
        return new ArrayListIterator();
    }
class ArrayListIterator implements Iterator {
    int pos = 0;

    public boolean hasNext() {
        if (pos < size){
            return true;
        }
        return false;
    }
    public Object next() {
        int x=arr[pos];
        pos++;
        return x;
    }
}
}
