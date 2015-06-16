Node Insert(Node head,int x) {
    Node temp = head;
Node n = new Node();
    n.data = x;
    n.next = null;
    if(head==null){
        head = n;
        return n;
    } else{
        while(head.next!=null){
            head=head.next;            
        }
        head.next=n;
        return temp;
    }
  
}
