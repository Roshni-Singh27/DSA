package DSA;
class Node{
    int data;
    Node next;
    Node prev;

    Node(int data1,Node next1,Node prev1){
        this.data=data1;
        this.next=next1;
        this.prev=prev1;

    }

    Node(int data1){
        this.data=data1;
        this.next=null;
        this.prev=null;
    }
};
public class deleteoccurenceinDLL {
    public static Node deleteAllOccurences(Node head,int k){
        Node temp=head;
        while(temp!=null){
            if (temp.data==k) {
              if(temp==head){
                head=temp.next;
              }  
              Node nextNode=temp.next;
              Node prevNode=temp.prev;
              if(nextNode!=null)
                nextNode.prev=prevNode;
            if(prevNode!=null)
                prevNode.next=nextNode;
            temp=nextNode;
            }
            else{
                temp=temp.next;
            }
        }
        return head;
    }
}
