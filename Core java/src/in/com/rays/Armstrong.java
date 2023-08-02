package in.com.rays;

public class Armstrong {
public static void main(String[] args) {
	int a=12378;
	int b=a;
	int sum=0;
	int d;
	
	while(b>0) {
		d=a%10;
		sum= sum+d*d*d;
		b=b/10;
	}
	
	if(a==sum) {
		System.out.println("This is Armstrong number"+sum);
	}
	else {
		System.out.println("This is not Armstrong number"+sum);
	}
	}
	}

	




