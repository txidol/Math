package Algorithms;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

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

    public static ListNode swapPairs(ListNode head) {
       if(head == null || head.next == null )return head;
        ListNode tempout2 = head.next;
        head.next = swapPairs(tempout2.next);
        tempout2.next = head;
        return tempout2;
    }

    public static ListNode swapPairs2(ListNode head) {
        if(head == null || head.next == null )return head;

        ListNode out = new ListNode(head.val);
        out.next = head;
        ListNode temp = out;

        while (temp.next!=null && temp.next.next!=null){
            ListNode begin = temp.next;
            ListNode end = temp.next.next;

            temp.next = end;
            begin.next = end.next;
            end.next = begin;

            temp = begin;
        }

        return  out.next;
    }

    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null )return false;
        Set<ListNode> last = new HashSet<ListNode>();
        while(head != null){
            last.add(head);
            if( last.contains(head.next) ){
                return true;
            }
            head= head.next;
        }
        return false;
    }

    public boolean hasCycle2(ListNode head) {
        if(head == null  )return false;
        ListNode fast = head,slow = head;
        while(fast.next != null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if( fast == slow ) return true;
        }
        return false;
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
        while (result != null){
            System.out.println(result.val);
            result = result.next;
        }
        System.out.println(result.val);
        System.out.println(result.next);
    }


}
