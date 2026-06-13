package DSA;
class ListNode {
    int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class DeletemiddleofLL {
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null)
        return null;
        ListNode slow=head;
        ListNode fast=head;
        fast=fast.next.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}
/*
if(head==null || head.next==null)
        return null;
ListNode temp=head;
int cnt=0;
while(temp!=null){
cnt++;
temp=temp.next;
}
int middle=cnt/2;
temp=head;
while(temp!=null){
middle--;
if(middle==0){
temp.next=temp.next.next;
break;
}

temp=temp.next;

*/
