package MultiThreading.ExecutorThread.completableFuture.forkJoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class ForkJoinRecursiveAction {
    public static void main(String[] args) {
        PrintTask task=new PrintTask(1,10);
        ForkJoinPool pool=new ForkJoinPool();
        pool.invoke(task);
    }
}
class PrintTask extends RecursiveAction {
    private int start;
    private int end;
    public PrintTask(int start, int end) {
        this.start = start;
        this.end = end;
    }
    @Override
    protected void compute() {
        if(start-end<=2){
            for(int i=start;i<=end;i++){
                System.out.println(i);
            }
            return;
        }
        int mid=(start+end)/2;
        invokeAll(
                new PrintTask(start, mid),
                new PrintTask(mid + 1, end)
        );
    }
}
