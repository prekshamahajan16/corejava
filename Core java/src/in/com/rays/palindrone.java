package in.com.rays;

	public class palindrone{
	public static void main(String[] args) {
		int num=121;
		int b=num; // value are stored in variable b
		int sum=0;
		int d;
		
		while(b>0) { 
			d=b%10; 
			sum = sum *10+d;
			b=b/10;
		}
		if(num==sum) {
			System.out.println("This is a Palindrone");
		}
		else {
			System.out.println("This is not Palindrone");
		}	
	}

}
