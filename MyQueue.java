class MyQueue<E>{

	CircularLinkedList<E> cll=new CircularLinkedList<>();
	void push(E data){
		cll.add(data);
	}
	E pop()throws Exception{
		return cll.getFirstElement();
		
	}
	 E peek()throws Exception{
      if(cll.head==null){
        throw new Exception("Stack is empety");
      }
      return cll.head.data;
  }
	public static void main(String[] args)throws Exception {
		MyQueue<Integer> mq=new MyQueue<Integer>();
		mq.push(5);
		 mq.push(6);
		 mq.push(2);
		  mq.push(9);
		System.out.println(mq.pop());
		System.out.println(mq.pop());
		 System.out.println(mq.pop());
		 System.out.println(mq.peek());
	}
}