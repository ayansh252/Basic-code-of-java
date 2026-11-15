package collection;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.LinkedList;

public class CustomHashMap {
    static class HashMap<K,V>{
        private class Node{
            K key;
            V value;
            public Node(K key,V value){
                this.key=key;
                this.value=value;
            }
        }
        private int n;
        private int N;
        private LinkedList<Node>[]bucket;
        public HashMap(){
            this.N=4;
            bucket=new LinkedList[N];
            for(int i=0;i<N;i++){
                bucket[i]=new LinkedList<>();
            }
        }
        private int hashFunction(K key){
            int hc= key.hashCode();
            return Math.abs(hc)%N;
        }
        public void reHash(){
            LinkedList<Node>[]oldBucket=bucket;
            bucket=new LinkedList[N*2];
            for(int i=0;i<N*2;i++){
                bucket[i]=new LinkedList<>();
            }
            for(int i=0;i<oldBucket.length;i++){
                LinkedList<Node>ll=oldBucket[i];
                for(int j=0;j<ll.size();j++){
                    Node node=ll.remove();
                    put(node.key,node.value);
                }
            }
        }
        public void put(K key,V value){
            int bi= hashFunction(key);
            int di=searchInLL(key,bi);

            if(di!=-1){
                Node node=bucket[bi].get(di);
                node.value=value;
            }else{
                bucket[bi].add(new Node(key,value));
                n++;
            }
            double lambda=(double)n/N;
            if(lambda>2){
                reHash();
            }
        }
        private int searchInLL(K key,int bi){
            LinkedList<Node>ll=bucket[bi];
            int di=0;
            for (Node node : ll) {
                if (node.key.equals(key)) {
                    return di;
                }
                di++;
            }
            return -1;
        }
        public boolean containsKey(K key){
            int bi= hashFunction(key);
            int di=searchInLL(key,bi);
            if(di!=-1){
                return true;
            }else{
                return false;
            }
        }
        public V remove(K key){
            int bi= hashFunction(key);
            int di=searchInLL(key,bi);
            if(di!=-1){
                Node node=bucket[bi].remove(di);
                n--;
                return node.value;
            }else{
                return null;
            }
        }
        public V get(K key){
            int bi= hashFunction(key);
            int di=searchInLL(key,bi);
            if(di!=-1){
                Node node=bucket[bi].get(di);
                return node.value;
            }
            return null;
        }
        public ArrayList<K> keySet(){
            ArrayList<K> list=new ArrayList<>();
            for(int i=0;i<N;i++){
                LinkedList<Node>ll=bucket[i];
                for(Node node : ll){
                    list.add(node.key);
                }
            }
            return list;
        }
        public boolean isEmpty(){
            return n==0;
        }
    }

    public static void main(String[] args) {
//        HashMap<String ,Integer> map=new HashMap<>();
//        map.put("A",1);
//        map.put("B",2);
//        map.put("C",3);
//        map.put("D",4);
//        System.out.println(map.containsKey("A"));
//        ArrayList<String>keySet=map.keySet();
//        for(String s: keySet){
//            System.out.println(map.get(s));
//        }
        EnumMap<Day ,Integer> enumMap=new EnumMap<>(Day.class);
        enumMap.put(Day.MONDAY,1);
        enumMap.put(Day.TUESDAY,2);
        System.out.println(enumMap.get(Day.MONDAY));
    }
}
class HashMap1<K,V>{
    private class Node{
        K key;
        V value;
        Node(K key,V value){
            this.key=key;
            this.value=value;
        }
    }
    int N=4;
    int n;
    LinkedList<Node>[]bucket;
    public HashMap1(){
        bucket=new LinkedList[N];
        for(int i=0;i<N;i++){
            bucket[i]=new LinkedList<>();
        }
    }
    public int hashFunction(K key){
        int hc= key.hashCode();
        return Math.abs(hc)%N;
    }
    public int searchInLL(K key,int bi){
       LinkedList<Node>ll=bucket[bi];
       int di=0;
        for (Node node : ll) {
            if (node.key.equals(key)) {
                return di;
            }
            di++;
        }
        return -1;
    }
    public void put(K key,V value){
        int bi= hashFunction(key);
        int di=searchInLL(key,bi);
        if(di!=-1){
            Node node =bucket[bi].get(di);
            node.value=value;
        }else{
            bucket[bi].add(new Node(key,value));
            n++;
        }
        double lambda=(double)n/N;
        if(lambda>2){
            reHash();
        }
    }
    public void reHash(){
        LinkedList<Node> []oldBucket=bucket;
        N=N*2;
        bucket=new LinkedList[N*2];
        for(int i=0;i<N*2;i++){
            bucket[i]=new LinkedList<>();
        }
        for(LinkedList<Node> ll: oldBucket){
            for(Node node : ll){
                put(node.key,node.value);
            }
        }
    }
    public V get(K key){
        int bi= hashFunction(key);
        int di=searchInLL(key,bi);
        if(di!=-1){
            Node node=bucket[bi].get(di);
            return node.value;
        }
        return null;
    }
    public ArrayList<K> keySet(){
        ArrayList<K> list=new ArrayList<>();
        for(int i=0;i<N;i++){
            LinkedList<Node>ll=bucket[i];
            for(Node node : ll){
                list.add(node.key);
            }
        }
        return list;
    }
    public boolean isEmpty(){
        return n==0;
    }
    public boolean containsKey(K key){
        int bi= hashFunction(key);
        int di=searchInLL(key,bi);
        if(di!=-1){
            return true;
        }
        return false;
    }
    public V remove(K key){
        int bi= hashFunction(key);
        int di=searchInLL(key,bi);
        if(di!=-1){
            Node node=bucket[bi].remove(di);
            n--;
            return node.value;
        }
        return null;
    }
}
enum Day{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY
}