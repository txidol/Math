package Algorithms;

import java.util.PriorityQueue;

public class HeapKthLargestEInStream {
    final PriorityQueue<Integer> q;
    final int k;
    public HeapKthLargestEInStream(int k,int[]a){
        this.k = k;
        q=new PriorityQueue<>(k);
        for(int n:a)
           add(n);
    }

    public int add(int n){
        if(q.size()<k){
            q.offer(n);
        }else if (q.peek()<n){
            q.poll();
            q.offer(n);
        }
        return q.peek();
    }
}