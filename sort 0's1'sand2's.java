package DSA;
class ListNode {
    int val;
    ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
class sort0s1sand2s {
    public ListNode sort(ListNode head){
       if(head==null || head.next==null)
        return head;
        ListNode zeroHead=new ListNode(-1);
        ListNode oneHead=new ListNode(-1);
        ListNode twoHead=new ListNode(-1);

        ListNode zero=zeroHead;
        ListNode one=oneHead;
        ListNode two=twoHead;
        ListNode temp=head;

        while(temp!=null){
            if(temp.val==0){
                zero.next=temp;
                zero=zero.next;
            }
            else if(temp.val==1){
                one.next=temp;
                one=one.next;
            }
            else{
                two.next=temp;
                two=two.next;
            }
            temp=temp.next;
        }
        zero.next=(oneHead.next!=null)?oneHead.next:twoHead.next;
        one.next=twoHead.next;
        two.next=null;
        ListNode newHead=zeroHead.next;
        return newHead;
        
    }

    
}

/*
 ListNode temp=head;
        int cnt0=0,cnt1=0,cnt2=0;
        while(temp!=null){
            if(temp.val==0) cnt0++;
            else if(temp.val==1) cnt1++;
            else 
                cnt2++;
            temp=temp.next;
        }
        temp=head;
        while (temp!=null) {
            if(cnt0!=0){
                temp.val=0;
                cnt0--;
            }
            else if (cnt1!=0) {
                temp.val=1;
                cnt1--;
            }
            else{
                temp.val=2;
                cnt2--;
            }
            temp=temp.next;
        }
*/