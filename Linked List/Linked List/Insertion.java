
class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
};

public class Insertion {
    private static Node Convert2LL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    private static int lengthofLL(Node head) {
        int cnt = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            cnt++;
        }
        return cnt;
    }

    private static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    private static Node insertHead(Node head, int val) {
        return new Node(val, head);
    }

    private static Node insertTail(Node head, int val) {
        if (head == null)
            return new Node(val);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(val);
        return head;
    }

    private static Node insertPosition(Node head, int el, int k) {
        if (head == null) {

            if (k == 1) {
                return new Node(el);
            } else {
                return head;
            }
        }
        if(k==1){
            return new Node(el, head);
        }
        int cnt=0;
        Node temp=head;
        while(temp!=null){
            cnt++;
            if(cnt==(k-1)){
                Node newNode=new Node(el, temp.next);
                temp.next=newNode;
                break;
            }
            temp=temp.next;
        }
        return head;
    }

    private static Node insertBeforeValue(Node head,int el,int val){
        if(head==null){
            return null;
        }
        if(head.data==val){
            return new Node(el, head);
        }
        Node temp=head;
        while(temp.next!=null){
            if(temp.next.data==val){
                Node newNode=new Node(el, temp.next);
                temp.next=newNode;
                break;
            }
            temp=temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        Node head = Convert2LL(arr);
        head = insertTail(head, 3550);
        print(head);
    }

}
