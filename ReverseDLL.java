package DSA;
  import java.util.*;
  class ListNode {
     int val;
     ListNode next;
     ListNode prev;
     ListNode() {}
    ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
    public ListNode reverseList(ListNode head) {
       /*  Stack<Integer> st=new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            st.push(temp.val);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            temp.val=st.peek();
            st.pop();
            temp=temp.next;
        }
        return head;
        */

        if(head==null || head.next==null)
            return head;
        ListNode prev=null;
        ListNode current=head;
        while(current!=null){
            prev=current.prev;
            current.prev=current.next;
            current.next=prev;
            current=current.prev;
        }
        return prev.prev;
    }
}
