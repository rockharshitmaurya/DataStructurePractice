class DoublyLinkedList{
	Node head,tail;
	int size=0;

	void add(int data){
		Node toadd=new Node(data);
		if(head==null){
			head=tail=toadd;
		}else{
		tail.next=toadd;
		toadd.prev=tail;
		tail=toadd;	
		size++;
		}
	}
	void add(int pos,int data){
			Node temp=head;
			int count=1;
		Node toadd=new Node(data);
		if(pos==0){
			toadd.next=head;
			head.prev=toadd;
			head=toadd;
			size++;
		}else if(size+1==pos){
			System.out.println("inside");
			tail.next=toadd;
			toadd.prev=tail;
			tail=toadd;
			size++;
			}else{
				while(count<pos){
			temp=temp.next;
			count++;
		}
		toadd.next=temp.next;
		temp.next=toadd;
		toadd.prev=temp;
		// tail=toadd;
		// System.out.println(tail.next);
		size++;		
		}
	}
	void remove(int pos){
		int count=0;
		Node temp=head;
		Node nextNode;
		if(pos==0){
			head=head.next;
			head.prev=null;
			return;
		}else if(head==null){
			return;
		}else if(pos==size){
			nextNode=tail.prev;
			nextNode.next=null;
			tail=nextNode;
			size--;
			}else{
			while(count<pos-1){
				temp=temp.next;
				count++;
			}
			nextNode=temp.next;
			temp.next=nextNode.next;
			nextNode.prev=temp;
			size--;


		}
		return;
	}
	void reverse(){
		Node currenet,nextNode;
		currenet=nextNode=head;
		while(nextNode!=null){
			
		nextNode=nextNode.next;
		currenet.next=currenet.prev;
		currenet.prev=nextNode;
		currenet=nextNode;
		}
		currenet=head;
		head=tail;
		tail=currenet;
	

	}

	void print(){
		Node temp=head;
			if(head==null){
				System.out.println("[ ]");
				return;
			}
		while(temp!=null){
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println("size() "+size);
		System.out.println("tail() "+tail.data);
		System.out.println("tail->next "+tail.next);
	}
	public static void main(String[] args) {
			DoublyLinkedList dll=new DoublyLinkedList();
			dll.add(1);
			dll.add(3);
			dll.add(4);
			dll.add(5);
			dll.add(6);
			dll.add(1);
			dll.add(9);
			// dll.add(7,8);
			// dll.remove(7);
			  dll.reverse();
			 dll.print();
			
			//System.out.println("hh"+tail.data);
	}
	
//	<-------------------NODE------------------------->  

	static class Node{
		int data;
		Node prev,next;
		Node(int data){
			this.data=data;
			prev=null;
			next=null;

		}
	}
}