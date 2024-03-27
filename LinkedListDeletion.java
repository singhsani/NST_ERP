class LinkedListDeletion{
    Node head;
    static class Node{
       int d;
       Node next;
       Node(int d){
        d=this.d;
        next=null;
      }
    }
    public static LinkedListDeletion insert(LinkedListDeletion list,int d){
      Node new_node=new Node(d);
      if(list.head==null){
         list.head=new_node;
      }else{
          Node last=list.head;
          while(last.next!=null){
              last=last.next;
          }
          last.next=new_node;
      }
      return list;
      }
      
}
