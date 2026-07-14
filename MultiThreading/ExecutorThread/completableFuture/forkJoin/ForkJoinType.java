package MultiThreading.ExecutorThread.completableFuture.forkJoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinType {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8};
        ForkJoinPool pool=new ForkJoinPool();
        SumTask task=new SumTask(0,arr.length-1,arr);
        int result=pool.invoke(task);
        System.out.println(result);
        pool.shutdown();
    }
}
class SumTask extends RecursiveTask<Integer> {
    private int start;
    private int end;
    private int []arr;
    public SumTask(int start, int end, int []arr) {
        this.start = start;
        this.end = end;
        this.arr = arr;
    }
    @Override
    protected Integer compute() {
        if(end-start<=2){
            int sum=0;
            for (int i = start; i <= end; i++) {
                sum+=arr[i];
            }
            return sum;
        }
        int mid=(start+end)/2;
        SumTask leftTask=new SumTask(start,mid,arr);
        SumTask rightTask=new SumTask(mid+1,end,arr);
        leftTask.fork();
        int sum2=rightTask.compute();
        int sum1=leftTask.join();
        return sum1+sum2;
    }
}
