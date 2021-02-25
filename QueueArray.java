class QueueArray{
	int size=5;
	int queue[]=new int[size];
	int front=-1,rear=-1;
	void enqueue(int data){
		 if(rear==size-1){
		 	System.out.println("Overflow");
		 }else if(front==-1 && rear==-1){
			front=rear=0;
			queue[rear]=data;
		}else{
			rear++;
			queue[rear]=data;
		}
	}
	void dequeue(){
		
		if(front==-1 && rear==-1){
			System.out.println("queue is Empty");
		}else if(front==rear){
			System.out.println(queue[front]);
			front=rear=-1;
		}else{
			System.out.println(queue[front]);
			front++;
		}
	}
	public static void main(String[] args) {
		QueueArray qa=new QueueArray();
		qa.enqueue(7);
		qa.enqueue(4);
		qa.enqueue(2);
		qa.enqueue(3);
		qa.dequeue();
		qa.dequeue();
		qa.dequeue();
			qa.dequeue();
				qa.dequeue();
	}
}