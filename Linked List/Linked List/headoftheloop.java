
class ListNode {
    int val;
     ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

public class headoftheloop {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                slow=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }

        }
        return null;
    }
}

/*
HashMap<ListNode,Integer> mp=new HashMap<>();
        ListNode temp=head;
        while(temp!=null){
            if(mp.containsKey(temp)){
                return temp;
            }
            mp.put(temp,1);
            temp=temp.next;
        }
        return null;
 */