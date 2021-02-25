public class LinkedListt{
	Node head,tail;

//	<-------------------------------------------->  

	public void add(int data){
		Node toadd=new Node(data);
		if(head==null){
			head=tail=toadd;

			return;
		}
		Node temp=head;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=tail=toadd;

	}


//	<-------------------------------------------->  

		
	void add(int pos, int data){
		Node toadd=new Node(data);
		Node temp=head;

		int count=1;
		if(head==null)
        {
            head=toadd;
            return;
        }
        else if(pos==0){
        	toadd.next=head;
        	head=toadd;
        	return;
        }
       else{
		while(count<pos){
			temp=temp.next;
			count++;
		}

		toadd.next=temp.next;
		temp.next=toadd;
	}

	}


//	<-------------------------------------------->  

		
	void print(){
		Node temp=head;
			System.out.println("Printing Node Data");
			if(head==null)
			{
				System.out.println("<LinkedList> is Empety");
				return;
			}
				while(temp!=null){
			
			System.out.println("head = "+temp+" head.next = "+temp.next+" head.data "+temp.data);
			temp=temp.next;
		}
	}

//	<-------------------------------------------->  

		
	void remove(int pos){
		int count=0;
		Node temp=head;
		Node nextNode;
		if(pos==0){
			head=head.next;
			return;
		}else if(head==null){
			return;
		}else{
			while(count<pos-1){
				temp=temp.next;
				count++;
			}
			nextNode=temp.next;
			temp.next=nextNode.next;

		}
		return;
	}

//	<-------------------------------------------->  

		
	void get(int pos){
		Node temp=head;
		int count=0;
		if(head==null || head.next==null)
			{
				System.out.println("<LinkedList> is Empety : "+new Exception().getStackTrace()[0].getMethodName()+"()");
				return;
			}
		while(count<pos){
			temp=temp.next;
			count++;
		}
		System.out.println(temp.data);
	}

//	<-------------------------------------------->  

		
	void getValueFromtail(int pos){
		Node temp1=head;
		Node temp=head;
	
		for(int i=0; head.next!=null; i++){
			head=head.next;
			if(i>=pos)
			{
				temp=temp.next;
			}
		}
		System.out.println("Value of index "+pos+" From Tail Is "+temp.data);
		head=temp1;
}

//	<-------------------------------------------->  


	void reverse(){
		Node prev=null,current, nextNode;
		current=nextNode=head;
		if(head==null || head.next==null){
			return;
		}else{
			while(nextNode!=null){
				nextNode=nextNode.next;
				current.next=prev;
				prev=current;
				current=nextNode;
			}
			head=prev;
		}
	}

//	<-------------------------------------------->  

	void update(int pos,int data){
		int count=0;
		Node temp=head;
		if(head==null || head.next==null)
			{
				System.out.println("<LinkedList> is Empety : "+new Exception().getStackTrace()[0].getMethodName()+"()");
				return;
			}
		while(count<pos){
			temp=temp.next;
			count++;
		}
		temp.data=data;
	}

	void clear(){
		head=null;
	}

//	<-------------------------------------------->  

void removeAll(LinkedListt newList){
	if(head==null || newList.head==null){
		return;
	}else{
		Node newTemp=newList.head;
		while(newTemp!=null){
			int value=newTemp.data;

			while(head.data==value)
			{	
				head=head.next;
				System.out.println("Deleted"+value);
			}
			Node temp=head;
			Node prev=null;
			while(temp!=null){
				if(temp.data==value){
					prev.next=temp.next;
					System.out.println("Deleted"+value);
				}
				prev=temp;
				temp=temp.next;
			}
			newTemp=newTemp.next;
		}

	}

}



	public static void main(String args[]){
		LinkedListt llt=new LinkedListt();
		LinkedListt llt1=new LinkedListt();
		// Scanner sc=new Scanner(System.in);
		// System.out.println("How Many Elements You Want To Insert");
		// int No=sc.nextInt();
		llt.add(2);
		llt.add(2);
		llt.add(2);
		llt.add(2);
		llt.add(2);
		llt.add(2);
		llt.add(2);
		llt.add(7);
		llt.add(6);
		llt.add(5);
		//llt1.add(7);
		 llt1.add(2);
		// llt1.add(4);
		llt1.add(5);
		llt1.add(6);
		// llt1.add(7);
		// llt1.add(8);
		//llt.add(3,40);
		//llt.remove(0);
		// llt.getValueFromtail(0);
		// llt.reverse();
		//llt.clear();
		// llt.update(5,99);
		// llt.print();
		//llt.get(0);
		llt.removeAll(llt1);
   	   llt.print();
   	   // System.out.println(llt);

	}
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
	}
}