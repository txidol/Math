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


    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.length, (v1, v2) -> v1.val - v2.val);
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;
        for (ListNode node : lists) {
            if (node != null) queue.add(node);
        }
        while (!queue.isEmpty()) {
            p.next = queue.poll();
            p = p.next;
            if (p.next != null) queue.add(p.next);
        }
        return dummy.next;
    }
    public class ListNode {
     int val;
     ListNode next;
        ListNode(int x) {
          val = x;
          next = null;
      }
    }



}
