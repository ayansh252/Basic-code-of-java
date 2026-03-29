public class ObjectClass {
    public static void main(String[] args)throws CloneNotSupportedException {
      College c=new College("IIT", "Kanpur")  ;
      Student s1=new Student();
      s1.name="Ayansh";
      s1.age=22;
      Student s2=new Student();
      s2.name="Ayansh";
      s2.age=22;
    //   System.out.println(s1.equals(s2));
    //   System.out.println(s1.hashCode());
    //   System.out.println(s2.hashCode());
    // System.out.println(s1 instanceof Student);
    // System.out.println(s1 instanceof Object);
    Student s3=(Student)s1.clone();
    System.out.println(s3.name);
    }
}
 class  Student implements Cloneable{
     String name;
     int age;
  @Override
  public boolean equals(Object obj){
      if(this==obj){
        return true;
      }
      if(obj.getClass()!=this.getClass()){
        return false;
      }
      Student s=(Student)obj;
      return this.name==s.name && this.age==s.age;
  }   
  protected Object clone()throws CloneNotSupportedException{
    return super.clone();
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