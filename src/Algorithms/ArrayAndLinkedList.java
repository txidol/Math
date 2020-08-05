package Algorithms;

import java.util.ArrayList;

public class ArrayAndLinkedList {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ListNode temp = head, cur = head.next, rnext;
        head.next = null;
        while (cur != null){
            rnext = cur.next;
            cur.next = temp;
            temp = cur;
            cur = rnext;
        }
        return temp;
    }

    public ListNode swapPairs(ListNode head) {
        return null;
    }

    public static void main(String[] args) {
        int[] val={1,2,3,4,5};
        ListNode demo1 = new ListNode(val[0]);
        ListNode demo2 = new ListNode(val[1]);
        ListNode demo3 = new ListNode(val[2]);
        ListNode demo4 = new ListNode(val[3]);
        ListNode demo5 = new ListNode(val[4]);
        demo4.next = demo5;
        demo3.next = demo4;
        demo2.next = demo3;
        demo1.next = demo2;
        ListNode result = reverseList(demo1);
        while (result.next != null){
            System.out.println(result.val);
            result = result.next;
        }
        System.out.println(result.val);
        System.out.println(result.next);
    }


}
