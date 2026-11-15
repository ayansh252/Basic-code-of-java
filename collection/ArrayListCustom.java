package collection;

import java.util.Iterator;

class ArrayList<T>{
    private Object[]arr;
    private int size=0;
    public ArrayList(){
        arr= new Object[16];
    }
    public Iterator iterator(){
        return new ArrayListIterator();
    }
   private class ArrayListIterator implements Iterator{
        int pos=0;
        @Override
        public boolean hasNext() {
            if(pos<size){
                return true;
            }
            return false;
        }

        @Override
        public T next() {
           T x=(T)arr[pos];
           pos++;
           return x;
        }
    }
    public void add(T x){
        arr[size++]=x;
    }
}
public class ArrayListCustom {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
