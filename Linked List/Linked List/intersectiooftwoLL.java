

import java.util.HashMap;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
public class intersectiooftwoLL {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
       if(headA==null || headB==null)
        return null;
    ListNode temp1=headA;
    ListNode temp2=headB;
    while(temp1!=temp2){
        temp1=temp1.next;
        temp2=temp2.next;
        if(temp1==temp2)
            return temp1;
        if(temp1==null)
            temp1=headB;
        if(temp2==null)
            temp2=headA;
    }
    return temp1;
    }
}
/*
  ListNode t1=headA;
        int n1=0,n2=0;
        ListNode t2=headB;
        while(t1!=null){
            n1++;
            t1=t1.next;
        }
        while(t2!=null){
            n2++;
            t2=t2.next;
        }
        if(n1<n2)
            return collisionPoint(headA,headB,n2-n1);
        else
            return collisionPoint(headB,headA,n1-n2);
    }
    private static ListNode collisionPoint(ListNode t1,ListNode t2, int d){
        while(d!=0){
            d--;
            t2=t2.next;
        }
        while(t1!=t2){
            t1=t1.next;
            t2=t2.next;
        }
        return t1;
*/




/*
HashMap<ListNode,Integer> mp=new HashMap<>();
        ListNode temp=headA;
        while(temp!=null){
            mp.put(temp,1);
            temp=temp.next;
        }
        temp=headB;
        while (temp!=null) {
            if(mp.containsKey(temp))
                return temp;
            temp=temp.next;
        }
        return null;
*/