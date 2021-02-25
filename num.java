class num{
public static void main(String[] args) {
	int x=4;
	int count=0;
	// while(x>0){
		// if((x&1)==1) count++;

		// x=x>>1;
	// 	


//	System.out.println(x^(1<<3));
	// int y=x^(1<<*3);
	// System.out.println(x&y);
	
	// while(x>0){
	// 	count++;
	// 	if(count>1) false;
	// }
	// return true;

	// while(x>0){
	// 	x=x^(1<<2);

		
	// }
			for(int i=1; i<=x; i++){
				int k=i;
				while(i!=0){
					i=i&(i-1);
					count++;
				}
				i=k;
			}
			System.out.println(count);
}
}