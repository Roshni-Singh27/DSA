package DSA;
class ListNode {
    int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class Lengthofloop {
    public int lengthofLoop(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                return findLength(slow,fast);
        }
        return 0;
    }
    private int findLength(ListNode slow,ListNode fast){
        int cnt=1;
        fast=fast.next;
        while(slow!=fast){
            cnt++;
            fast=fast.next;
        }
        return cnt;
    }
}

/*
HashMap<ListNode,Integer> mp=new HashMap<>();
ListNode temp=head;
int timer=1;
while(temp!=null){
  if(mp.containsKey(temp)){
  int value=mp.get(temp);
  return (timer-value);
  }
  mp.put(temp,timer++);
  temp=temp.next;
}
  return 0;
*/
