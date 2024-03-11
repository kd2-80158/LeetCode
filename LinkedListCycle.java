package LinkedList;
/*
Author: Saurabh Chhimwal
Date: 11/March/2024

 * Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by 
continuously following the next pointer. Internally, pos is used to denote the index of the node 
that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.
 */

class ListNode {
        int val;
         ListNode next;
         ListNode(int x) {
             val = x;
             next = null;     }
         }
public class LinkedListCycle {

    /**
 * Definition for singly-linked list.
 * }
 */
 //using two-pointers approach to solve this problem:
 //taking first pointer as slow and second pointer as fast means slow pointer moves 1 ahead while fast pointer
 //moves 2 at a time.
    public boolean hasCycle(ListNode head) {

        ListNode first=head, second=head;

        //when first==second -- return true
        if(first==second)
        //when second==null or second.next==null -- return false
        while(second!=null && second.next!=null)
        {
            first = first.next;
            second = second.next.next;
            if(first==second)
              return true;
        }
     return false;
    }
}