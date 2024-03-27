class LinkedList{
  Node head;
  static class Node{
    int data;
    Node next;
    Node(int d){
       data=d;
       next=null;
    }
  }
  public static LinkedList insert(LinkedList list,int d){
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
  public static void print(LinkedList list,Node currNode){
     if(currNode==null){
        return;
     }
     System.out.print(currNode.data+"  ");
     print(list,currNode.next);
      System.out.println("Hello");
  }
  public static void main(String[] args){
    LinkedList list=new LinkedList();
    list=insert(list,1);
    list=insert(list,2);
    list=insert(list,4);
    print(list,list.head);
  }
}
