
public class MyLinkedList
{
	Node head; 
	void add(int data){
		Node toAdd=new Node(data);
		if(head==null)
		{
			head=toAdd;
			return;
		}
		Node temp=head;
		while(temp.next != null)
		{
			temp=temp.next;
		}
		head.next=toAdd;
	}
	void print()
	{
		Node temp=head;
		while(temp != null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	} 
	public static void main(String args[])
	{
		MyLinkedList mll=new MyLinkedList();
		mll.add(67);
		mll.add(98);
		mll.print();
	}
	static class Node{
	int data;
	Node next;
	public Node(int data)
	{
		this.data=data;
		next=null;
	}	
	}

}