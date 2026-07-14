package MemoryManangement;

import java.util.ArrayList;
import java.util.List;

public class HeapMemory {
    public static void main(String[] args) {
        List<int []> list=new ArrayList<>();
        while(true){
            list.add(new int[250000]);
        }
//        java -Xms2m -Xmx4m MemoryManangement.HeapMemory
    }
}
