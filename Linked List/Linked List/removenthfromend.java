package DSA;
 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class removenthfromend {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast=head;
        ListNode slow=head;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        if(fast==null)
        return head.next;
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;

        return head;
    }
}
/*brute force
if(head==null)
        return head;
        if(head.next==null)
        return null;
        ListNode temp=head;
        int cnt=0;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        int remove=cnt-n;
        if(cnt==n)
        head=head.next;
        temp=head;
        cnt=0;
        while(temp!=null){
            cnt++;
            if(cnt==remove){
                temp.next=temp.next.next;
            }
            temp=temp.next;
        }

*/
