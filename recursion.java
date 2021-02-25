
public class recursion {
	static  int sum(int i) {
		if(i!=0) return i+sum(i-1);
		else return i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(10));
	}

}
