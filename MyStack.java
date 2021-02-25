//import jdk.incubator.jpackage.main.Main;

public class MyStack<E>{
  CircularLinkedList<E> cll=new CircularLinkedList<>();
  void push(E data){
      cll.add(data);
  }
  E peek()throws Exception{
      if(cll.head==null){
        throw new Exception("Stack is empety");
      }
      return cll.tail.data;
  }
  E pop()throws Exception{
return cll.getLastElement();      
  }
  public static void main(String[] args)throws Exception {
      MyStack<Integer> ms=new MyStack<>();
      ms.push(5);
       ms.push(2);
        ms.push(3);
      // ms.push(4);
      System.out.println("pouped element "+ms.pop());
        System.out.println("pouped element "+ms.pop());
        System.out.println("pouped element "+ms.pop());
          System.out.println("pouped element "+ms.pop());
          // System.out.println("pouped element "+ms.pop());
     // System.out.println("peek() value "+ms.peek());
  }
}