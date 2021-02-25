public class MyLinkedList2{
	Node head;
	void add(int data)
	{
		Node toadd=new Node(data);
		if(head==null)
		{
			head=toadd;
			return;
		}
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		head.next=toadd;
	}
	static void revPrint(Node head)
	{
		if (head != null) {
   revPrint(head.next);
   System.out.println(head.data); 
}
	}
	public static void main(String[] args) {
	MyLinkedList2 mll2=new MyLinkedList2();
	mll2.add(34);
	mll2.add(23);	
	revPrint(mll2.head);
	}


	static class Node{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
}