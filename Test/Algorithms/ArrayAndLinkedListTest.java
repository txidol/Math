package Algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayAndLinkedListTest {

    @Test
    public void reverseList() {
        int[] val={1,2,3,4,5};
        ArrayAndLinkedList.ListNode demo1 = new ArrayAndLinkedList.ListNode(val[0]);
        ArrayAndLinkedList.ListNode demo2 = new ArrayAndLinkedList.ListNode(val[1]);
        ArrayAndLinkedList.ListNode demo3 = new ArrayAndLinkedList.ListNode(val[2]);
        ArrayAndLinkedList.ListNode demo4 = new ArrayAndLinkedList.ListNode(val[3]);
        ArrayAndLinkedList.ListNode demo5 = new ArrayAndLinkedList.ListNode(val[4]);
        demo4.next = demo5;
        demo3.next = demo4;
        demo2.next = demo3;
        demo1.next = demo2;
        ArrayAndLinkedList.ListNode result = new ArrayAndLinkedList().reverseList(demo1);
        while (result.next != null){
            System.out.println(result.val);
            result = result.next;
        }
        System.out.println(result.val);
        System.out.println(result.next);
    }

    @Test
    public void swapPairs() {
        int[] val={1,2,3,4,5};
        ArrayAndLinkedList.ListNode demo1 = new ArrayAndLinkedList.ListNode(val[0]);
        ArrayAndLinkedList.ListNode demo2 = new ArrayAndLinkedList.ListNode(val[1]);
        ArrayAndLinkedList.ListNode demo3 = new ArrayAndLinkedList.ListNode(val[2]);
        ArrayAndLinkedList.ListNode demo4 = new ArrayAndLinkedList.ListNode(val[3]);
        ArrayAndLinkedList.ListNode demo5 = new ArrayAndLinkedList.ListNode(val[4]);
        demo4.next = demo5;
        demo3.next = demo4;
        demo2.next = demo3;
        demo1.next = demo2;
        ArrayAndLinkedList.ListNode result = new ArrayAndLinkedList().swapPairs(demo1);
        while (result != null){
            System.out.println(result.val);
            result = result.next;
        }

    }

    @Test
    public void swapPairs2() {
        int[] val={1,2,3,4,5};
        ArrayAndLinkedList.ListNode demo1 = new ArrayAndLinkedList.ListNode(val[0]);
        ArrayAndLinkedList.ListNode demo2 = new ArrayAndLinkedList.ListNode(val[1]);
        ArrayAndLinkedList.ListNode demo3 = new ArrayAndLinkedList.ListNode(val[2]);
        ArrayAndLinkedList.ListNode demo4 = new ArrayAndLinkedList.ListNode(val[3]);
        ArrayAndLinkedList.ListNode demo5 = new ArrayAndLinkedList.ListNode(val[4]);
        demo4.next = demo5;
        demo3.next = demo4;
        demo2.next = demo3;
        demo1.next = demo2;
        ArrayAndLinkedList.ListNode result = new ArrayAndLinkedList().swapPairs2(demo1);
        while (result != null){
            System.out.println(result.val);
            result = result.next;
        }

    }

    @Test
    public void hasCycle() {
        int[] val={3,2,0,4};
        ArrayAndLinkedList.ListNode demo1 = new ArrayAndLinkedList.ListNode(val[0]);
        ArrayAndLinkedList.ListNode demo2 = new ArrayAndLinkedList.ListNode(val[1]);
        ArrayAndLinkedList.ListNode demo3 = new ArrayAndLinkedList.ListNode(val[2]);
        ArrayAndLinkedList.ListNode demo4 = new ArrayAndLinkedList.ListNode(val[3]);
        demo4.next = demo2;
        demo3.next = demo4;
        demo2.next = demo3;
        demo1.next = demo2;
        System.out.println(new ArrayAndLinkedList().hasCycle(demo1));
    }

    @Test
    public void hasCycle2() {
        int[] val={3,2,0,4};
        ArrayAndLinkedList.ListNode demo1 = new ArrayAndLinkedList.ListNode(val[0]);
        ArrayAndLinkedList.ListNode demo2 = new ArrayAndLinkedList.ListNode(val[1]);
        ArrayAndLinkedList.ListNode demo3 = new ArrayAndLinkedList.ListNode(val[2]);
        ArrayAndLinkedList.ListNode demo4 = new ArrayAndLinkedList.ListNode(val[3]);
        demo4.next = demo2;
        demo3.next = demo4;
        demo2.next = demo3;
        demo1.next = demo2;
        System.out.println(new ArrayAndLinkedList().hasCycle2(demo1));
    }
}