package DSA;

import java.util.ArrayList;

class ListNode {
    int val;
    ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
public class evenandoddLL {
    public ListNode oddEvenList(ListNode head){
        //Optimal solution with time complexity O(n) and space complexity O(1)
         if(head==null || head.next==null)
        return head;
        
        ListNode odd=head;
        ListNode even=head.next;
        ListNode evenHead=head.next;
        
        while(even!=null && even.next!=null){
            odd.next=odd.next.next;
            even.next=even.next.next;

            odd=odd.next;
            even=even.next;
        }
        odd.next=evenHead;
        /*ArrayList<Integer> arr =new ArrayList<>();
        ListNode temp=head;
        if(head==null || head.next==null)
            return head;
        while(temp!=null && temp.next!=null){
            arr.add(temp.val);
            temp=temp.next.next;
        }
        if(temp!=null)
            arr.add(temp.val);
        temp=head.next;
        while(temp!=null && temp.next!=null){
            arr.add(temp.val);
            temp=temp.next.next;
        }
        if(temp!=null)
            arr.add(temp.val);
        int i=0;
        temp=head;
        while(temp!=null){
            temp.val=arr.get(i++);
            temp=temp.next;
        }
            */
        return head;
    }
}
