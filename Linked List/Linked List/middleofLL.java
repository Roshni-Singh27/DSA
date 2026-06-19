
class ListNode {
    int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class middleofLL {
    public ListNode middleNode(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
/*
int cnt=0;
         ListNode temp=head;
    while(temp!=null){
        temp=temp.next;
        cnt++;
    }
    int mid=cnt/2;
    ListNode move=head;
    for(int i=0;i<mid;i++){
        move=move.next;
    }
    return move;
 */