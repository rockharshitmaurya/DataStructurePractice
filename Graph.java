import java.util.*;
public class Graph {
private LinkedList<Integer> adj[];
	@SuppressWarnings("unchecked")
	public Graph(int v) {
		adj=new LinkedList[v];
		for(int i=0; i<v; i++) {
			adj[i]=new LinkedList<Integer>();
		}
	}
	public void addEdge(int source,int destination) {
		adj[source].add(destination);
		adj[destination].add(source);
	}
	
	public int bfs(int source , int destination) {
		int count=0;
		Queue<Integer> queue=new LinkedList<Integer>();
		int arr[]=new int[adj.length];
		boolean vis[]=new boolean[adj.length];
		arr[source]=-1;
		vis[source]=true;
		queue.add(source);
		while(!queue.isEmpty()) {
			int cur=queue.poll();
			if(cur==destination) break;
			for(int neighbor:adj[cur]) {
				if(!vis[neighbor]) {
					vis[neighbor]=true;
					queue.add(neighbor);
					arr[neighbor]=cur;
				}
			}
		}
		int cur=destination;
		while(arr[cur]!=-1) {
			System.out.println(cur+"-->");
			cur=arr[cur];
			count++;
		}
			return count;
	}
	public boolean dfs(int source , int destination) {
		boolean vis[]=new boolean[adj.length];
		vis[source]=true;
		Stack<Integer> stack=new Stack<Integer>();
		stack.push(source);
		while(!stack.isEmpty()) {
			int cur=stack.pop();
			if(cur==destination) return true;
			for(int neighbor:adj[cur]) {
				if(!vis[neighbor]) {
					vis[neighbor]=true;
					stack.add(neighbor);
				}
			}
		}
		
		return false;
	}
	private boolean dfsUtil(int source , int destination,boolean vis[]){
		if(source==destination) return true;
		
			for(int neighour: adj[source]) {
				if(!vis[neighour]) {
					vis[neighour]=true;
					boolean isConnecetd=dfsUtil(neighour, destination, vis);
					if(isConnecetd) return true;
				}
			}
			return false;
	}
	public boolean dfsR(int source , int destination) {
		boolean vis[]=new boolean[adj.length];
		vis[source]=true;
		
		return dfsUtil(source ,destination,vis);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter No of vertices and edge");
		int v=sc.nextInt();
		int e=sc.nextInt();
		
		Graph graph=new Graph(v);
		System.out.println("Enetr "+e+" edges");
		for(int i=0; i<e; i++) {
			int source=sc.nextInt();
			int destination=sc.nextInt();
			graph.addEdge(source, destination);
			
		}
		System.out.println("Please Enter Source and destination");
		int source=sc.nextInt();
		int destination=sc.nextInt();
		sc.close();
		//System.out.println("minimum distance is "+graph.bfs(source, destination));
		System.out.println("possible "+graph.dfsR(source, destination));
	}

}
