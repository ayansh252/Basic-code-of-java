package ExceptionHandling;

public class Demo {
    private static void checkEligibility(int age) {
        if(age<=0){
            throw new InvalidAgeException("Invald age",age);
        }else{
            System.out.println("Age is "+age);
        }
    }
    public static void main(String[] args) {
        try{
           checkEligibility(3);
        }catch(InvalidAgeException e){
            System.out.println(e.getMessage()+"       "+ e.getAge());
        }
    }
}
class InvalidAgeException extends RuntimeException{
    private int age;
    public InvalidAgeException(String message,int age){
        super(message);
        this.age=age;
    }
    public int getAge(){
        return age;
    }
}
