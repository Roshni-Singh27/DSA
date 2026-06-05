package DSA;
class Node{
    int data;
    Node next;

    Node(int data1,Node next1){
        this.data=data1;
        this.next=next1;
    }

    Node(int data1){
        this.data=data1;
        this.next=null;
    }
};
public class delete {
  private static Node Convert2LL(int[] arr){
    Node head=new Node(arr[0]);
    Node mover=head;
    for(int i=1;i<arr.length;i++){
        Node temp=new Node(arr[i]);
        mover.next=temp;
        mover=temp;
    }
    return head;
  }
  
  private static int lengthofLL(Node head){
    int  cnt=0;
    Node temp=head;
    while(temp!=null){
        temp=temp.next;
        cnt++;
    }
    return cnt;
  }

  private static void print(Node head){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
    System.out.println();
  }

  private static Node removesHead(Node head){
    if(head==null)
        return head;
    head=head.next;
    return head;
  }

  private static Node removesTail(Node head){
    if(head==null || head.next==null)
        return null;
    Node temp=head;
    while(temp.next.next!=null){
        temp=temp.next;
    }
    temp.next=null;
    return head;
  }

  private static Node removesK(Node head,int k){
    if(head==null)
        return head;
    if(k==1){
        head=head.next;
    }
    int cnt=0;
    Node temp=head;
    Node prev=null;
    while(temp!=null){
        cnt++;
        if(cnt==k){
            prev.next=prev.next.next;
            break;
    }
        prev=temp;
        temp=temp.next;
    }
    return head;
  }

  private static Node removesEl(Node head,int el){
    if(head==null)
        return head;
    if(head.data==el)
    {
        Node temp=head;
        head=head.next;
    }
    Node temp=head;
    Node prev=null;
    while(temp!=null){
        if(temp.data==el){
            prev.next=prev.next.next;
            break;
        }
        prev=temp;
        temp=temp.next;
    }
    return head;
  }


  public static void main(String[] args) {
    int[] arr={1,2,3,4,5};
    Node head=Convert2LL(arr);
    head=removesEl(head,4);
    print(head);
  }
}
