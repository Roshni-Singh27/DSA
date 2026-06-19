
class Node{
    int data;
    Node next;
    Node back;

    Node(int data1,Node next1,Node back1){
        this.data=data1;
        this.next=next1;
        this.back=back1;

    }

    Node(int data1){
        this.data=data1;
        this.next=null;
        this.back=null;
    }
};
public class DeletionDLL {
     public static Node ConvertArray2DLL(int[] arr){
        Node head=new Node(arr[0]);
        Node back=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i], null, back);
            back.next=temp;
            back=temp;
        }
        return head;
    }

   private static void print(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }

    private  static Node DeleteHead(Node head){
        if(head==null || head.next==null)
            return null;
        Node back=head;
        head=head.next;
        head.back=null;
        back.next=null;
        return head;
    }

    private static Node DeleteTail(Node head){
        if(head==null || head.next==null)
            return null;
        Node tail=head;
        while(tail.next!=null){
            tail=tail.next;
        }
        Node prev=tail.back;
        prev=tail.back;
        prev.next=null;
        tail.back=null;
        return head;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,5};
        Node head=ConvertArray2DLL(arr);
        head=DeleteHead(head);
        print(head);
    }
}

