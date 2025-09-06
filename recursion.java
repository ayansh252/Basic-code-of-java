public class Recursion {
//    static int i=1;
    public static int pow(int i,int n){

        if(n==0){
            return 0;
        }
        if(n==1){
            return 2;

        }
        return i*pow(i,n-1);
    }
    public static int sqsum(int n){
        if(n==1){
            return 1;
        }
        return n*n+sqsum(n-1);
    }
    public static void print(int num){

        if(num==1){
            System.out.print(num);
         return;
        }
        print(num-1);
        System.out.print(num+" ");
    }
    public static void even(int n){
        if(n==1){
            return ;
        }
        even(n-1);
        if(n%2==0){
            System.out.print(n+" ");
        }



    }

    public static void main(String[] args) {
//        print(10);
//        even(10);
//        System.out.println(pow(2,5));
        System.out.println(sqsum(5));
    }
}
