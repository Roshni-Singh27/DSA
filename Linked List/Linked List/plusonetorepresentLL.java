
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class plusonetorepresentLL {
    public ListNode plusOne(ListNode head){
        head=reverseList(head);
        int carry=1;
        ListNode temp=head;
        while(temp!=null){
            temp.val=temp.val+carry;
            if(temp.val<10){
                carry=0;
                break;
            }
            else{
                carry=1;
                temp.val=0;
            }
            temp=temp.next;
        }
        if(carry==1){
            ListNode newNode=new ListNode(1);
            head=reverseList(head);
            newNode.next=head;
            return newNode;
        }
        head=reverseList(head);
        return head;
    }
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode newHead=reverseList(head.next);
        ListNode front=head.next;
        front.next=head;
        head.next=null;
        return newHead;
    }
}
