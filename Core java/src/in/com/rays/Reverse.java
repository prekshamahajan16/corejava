package in.com.rays;

public class Reverse {
	public static void main(String[] args) {
		int num=45666;
		int b=num; // value are stored in variable b
		int sum=0;
		int d;                              
		
		while(b>0) {
			d=b%10; 
			sum = sum *10+d;
			b=b/10;
		
		
		System.out.println(d);
		
		}
}
}




