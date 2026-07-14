package ExceptionHandling;

public class Example1Throw {
    public static void main(String[] args) {
        try{
            checkEligibility(17);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
    private static void checkEligibility(int age){
        if(age<18){
            throw new  IllegalArgumentException("Age cannot be under 18");
        }else{
            System.out.println("Eligible");
        }
    }
}
