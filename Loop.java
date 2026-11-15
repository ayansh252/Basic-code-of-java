public class Loop {
    public static void main(String[] args) {
//        outer:for(int i = 0; i < 10; i++){
//        inner:for(int j = 0; j < 10; j++){
//            if(j>=5){
//                break inner;
//            }
//            System.out.println(j +" *");
//        }
//        }
//        first:{
//
//        }
        second:{}
        third:{}
        int [][]marks=new int[10][];
        marks[0]=new int[10];
        marks[1]=new int[5];
        Random r=new Random(4,5);
        A a=new B();
        System.out.println(a.x);
    }
}class Random{
    int x;
    int y;
    Random(int x,int y){
        this.x=x;
        this.y=y;
    }
     Random(Random r){
        this.x=r.x;
        this.y=r.y;

}

}
class A{
    //    private void fun(){
//        System.out.println("hello");
//    }
    int x=10;
}
class B extends A {
    //     void fun(){
//        System.out.println("hello");

    int x = 20;
}
