package streams;

import java.util.ArrayList;
import java.util.List;

public class ListStream {
    public static void main(String[] args) {
        List<Employee> employees=new ArrayList<Employee>();
        employees.add(new Employee("Ayansh",22,50000));
        employees.add(new Employee("Aditya",28,100000));
        employees.add(new Employee("Rohit",29,150000));
        employees.add(new Employee("Rohan",22,10000));
        employees.add(new Employee("Raman",22,5000));
        employees.add(new Employee("Shubman",24,500));
        employees.add(new Employee("Ram",21,55000));

        List<Employee> res=employees.stream()
                .filter(x->x.salary>5000)
                .sorted((a,b)->a.compareTo(b))
                .toList();
     for(Employee e:res){
         System.out.println("name: "+e.name +
                 "salary: "+e.salary+"age: "+e.age);
     }
    }
}
class Employee implements Comparable<Employee>{
    String name;
    int age;
    int salary;
    public Employee(String name,int age,int salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    public String getName(){
       return name;
    }
    public int compareTo(Employee e){
        return this.salary-e.salary;
    }
}