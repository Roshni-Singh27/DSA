import java.util.PriorityQueue;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class mergeKsortedLL {
    public ListNode mergeKLists(ListNode[] lists){
        PriorityQueue<ListNode> pq=new PriorityQueue<>(
            (a,b)->a.val-b.val
        );
        for(ListNode node:lists){
            if(node!=null){
                pq.offer(node);
            }
        }
        ListNode dummy=new ListNode(-1);
        ListNode tail=dummy;
        while(!pq.isEmpty()){
            ListNode smallest=pq.poll();
            tail.next=smallest;
            tail=tail.next;
            if(smallest.next!=null){
                pq.offer(smallest.next);
            }
        }
        return dummy.next;
    }
}
/*
if(lists == null || lists.length == 0)
    return null;
     ArrayList<Integer> list=new ArrayList<>();
     ListNode head=lists[0];
     for(int i=1;i<lists.length;i++){
        head=mergeTwoLists(head,lists[i]);
     }
     return head;
    }
     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode t1=list1;
        ListNode t2=list2;
        ListNode dNode=new ListNode(-1);
        ListNode temp=dNode;
        while(t1!=null && t2!=null){
            if(t1.val<t2.val){
                temp.next=t1;
                temp=t1;
                t1=t1.next;
            }
            else{
                temp.next=t2;
                temp=t2;
                t2=t2.next;
            }
        }
            if(t1!=null)
            temp.next=t1;
            else
            temp.next=t2;
            return dNode.next;
 */

/*
   ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < lists.length; i++) {
            ListNode temp = lists[i];

            while(temp != null) {
                arr.add(temp.val);
                temp = temp.next;
            }
        }

        Collections.sort(arr);

        return ConvertArr2LL(arr);
    }

    private ListNode ConvertArr2LL(ArrayList<Integer> arr) {
        if(arr.size() == 0) return null;

        ListNode head = new ListNode(arr.get(0));
        ListNode mover = head;

        for(int i = 1; i < arr.size(); i++) {
            ListNode temp = new ListNode(arr.get(i));
            mover.next = temp;
            mover = temp;
        }

        return head;
 */