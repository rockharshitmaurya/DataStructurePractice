public class QueueLinkList{
	Node head;
	public void enqueue(int data){
		Node toadd=new Node(data);
		if(head==null){
			head=toadd;
			return;
		}
		Node temp=head;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=toadd;
	}
	public void dequeue(){
		if(head==null){
			System.out.println("Queue is Empety ");
			return;
		}
		if(head.next==null){
			System.out.println("Element Poped "+head.data);
			head=null;
			return;
		}
		System.out.println("Element Poped "+head.data);
		head=head.next;

	}
	public static void main(String[] args) {
		QueueLinkList ql=new QueueLinkList();
		ql.enqueue(3);
		ql.enqueue(1);
		ql.enqueue(2);
		ql.enqueue(7);
		ql.dequeue();
		ql.dequeue();
		ql.dequeue();
		ql.dequeue();
		ql.dequeue();
	}
	static class Node{
		Node next;
		int data=0;
		Node(int data){
			this.data=data;
			next=null;
		}
	}
}