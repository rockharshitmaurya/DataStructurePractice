import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class GenericTree {
	static class Node{
		int data;
		ArrayList<Node> children=new ArrayList<>();
		Node(int data){
			this.data=data;
		}
	}
	static class pair{
		Node node;
		int level;
		pair(Node node,int level){
			this.node=node;
			this.level=level;
		}
	}
	public static void Display(Node node) {
		String str=node.data+"-->";
		for(Node child:node.children) {
			str+=child.data+",";
		}
		str+=".";
		System.out.println(str);
		for(Node child:node.children) {
			Display(child);
		}
	}
	static int size(Node node) {
		int s=0;
		for(Node child: node.children) {
			s+=size(child);
		}
		return s+1;
	}
	
	static int max(Node node) {
		int m=Integer.MIN_VALUE;
		for(Node child:node.children) {
			int cm=max(child);
			m=Math.max(m, cm);
		}
		return Math.max(m,node.data);
	}
	static int height(Node node) {
		int ht=-1; //in case of Height of edges else ht=0;(case of node)
		for(Node child:node.children) {
			int ch=height(child);
			ht=Math.max(ch, ht);
		}
		ht+=1;
		return ht;
	}
	
	//Generic Tree - Traversals (pre-order, Post-order)
	//https://www.pepcoding.com/resources/online-java-foundation/generic-tree/generic-tree-traversal-official/ojquestion
	public static void traversals(Node node) {
		System.out.println("Node pre "+node.data);
		for(Node child:node.children) {
			System.out.println("Edge pre "+node.data+"--"+child.data);
			traversals(child);
			System.out.println("Edge post "+node.data+"--"+child.data);
		}
		System.out.println("Node post "+node.data);
	}
	public static void levelOrder(Node node){
		Queue<Node> q=new LinkedList<Node>();
		q.add(node);
		while(q.size()>0) {
			node=q.poll();
			System.out.print(node.data+" ");
			for(Node child:node.children) {
				q.add(child);
			}
		}
		System.out.println(".");
	}
	
	public static void levelOrderLinewise(Node node){
		Queue<Node> mq=new LinkedList<Node>();
		Queue<Node> cq=new LinkedList<Node>();
		mq.add(node);
		while(mq.size()>0) {
			node=mq.remove();
			System.out.print(node.data+" ");
			for(Node child:node.children) {
				cq.add(child);
			}
			if(mq.size()==0) {
				mq=cq;
				cq=new LinkedList<Node>();
				System.out.println();
			}
		}
	}
	public static void levelOrderLinewise2(Node node){
		Queue<Node> mq=new LinkedList<Node>();
		mq.add(node);
		mq.add(new Node(-1));
		while(mq.size()>0) {
			node=mq.remove();
			if(node.data!=-1) {
			System.out.print(node.data+" ");
			for(Node child:node.children) {
				mq.add(child);
			}
			}else {
				if(mq.size()>0) {
					mq.add(new Node(-1));
					System.out.println();
				}
			}
		}
	}
	public static void levelOrderLinewise3(Node node){
		Queue<Node> mq=new LinkedList<Node>();
		mq.add(node);
		
		while(mq.size()>0) {
			int csize=mq.size();
			for(int i=0; i<csize; i++) {
			node=mq.remove();
			System.out.print(node.data+" ");
			for(Node child:node.children) {
				mq.add(child);
			}
		}
			System.out.println();
		}
	}
	public static void levelOrderLinewise4(Node node){
		Queue<pair> mq=new LinkedList<pair>();
		int level=1;
		mq.add(new pair(node,1));
		while(mq.size()>0) {
			pair p=mq.remove();
			if(p.level>level) {
				level=p.level;
				System.out.println();
			}
			System.out.print(p.node.data+" ");
			for(Node child:p.node.children) {
				mq.add(new pair(child,p.level+1));
			}
			
		}
	}
	public static void mirror(Node node){
		for(Node child:node.children) {
			mirror(child);
		}
		Collections.reverse(node.children);
	}
	public static void removeLeaves(Node node) {
		for(int i=node.children.size()-1; i>=0; i--) {
			Node child=node.children.get(i);
			if(child.children.size()==0 ) {
				node.children.remove(child);
			}
		}
		for(Node child:node.children) {
			removeLeaves(child);
		}
	}
	  public static void linearize(Node node){
		  for(Node child:node.children) {
			  linearize(child);
		  }
		  Node lc=node.children.remove(node.children.size()-1);
		  Node sl=node.children.get(node.children.size()-1);
		  Node slt=getTail(sl);
		  slt.children.add(lc);
	  }
	  public static Node getTail(Node node) {
		  while(node.children.size()==1) {
			  node=node.children.get(0);
		  }
		  return node;
	  }
	  public static Node linearize2(Node node){
		  if(node.children.size()==0) return node;
		  Node lkt=node.children.get(node.children.size()-1);
		  while(node.children.size()>1) {
			  Node last=node.children.remove(node.children.size()-1);
			  Node sLast=node.children.get(node.children.size()-1);
			  Node tail=linearize2(sLast);
			 tail.children.add(last);
		  }
		  return lkt;
	  }
	public static void levelOrderLinewiseZZ(Node node){
		Stack<Node> ms=new Stack<>();
		Stack<Node> cs=new Stack<>();
		ms.push(node);
		int level=1;
		while(ms.size()>0) {
			node=ms.pop();
			System.out.print(node.data+" ");
			if(level%2==1) {
				for(int i=0; i<node.children.size(); i++) {
					Node child=node.children.get(i);
					cs.push(child);
				}
			}else {
				for(int i=node.children.size()-1; i>=0; i--) {
					Node child=node.children.get(i);
					cs.push(child);
				}
			}
			if(ms.size()==0) {
				ms=cs;
				cs=new Stack<>();
				level++;
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[]= {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
			Node root=null;
			Stack<Node> stack=new Stack<>();
			for(int i=0; i<arr.length; i++) {
				if(arr[i]==-1) {
					stack.pop();
				}else {
					Node node=new Node(arr[i]);
					if(stack.size()>0) {
						stack.peek().children.add(node);
					}else {
						root=node;
					}
					stack.push(node);
				}
			}
			
			//	Display(root);
//				System.out.println("size() "+size(root));
//				System.out.println("max() "+max(root));
//				System.out.println("height() "+height(root));
//				traversals(root);
//				levelOrder(root);
//				levelOrderLinewise(root);
//				levelOrderLinewiseZZ(root);
				//levelOrderLinewise4(root);
		//	mirror(root);
			linearize2(root);
			Display(root);
	}

}
