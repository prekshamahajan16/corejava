package in.com.rays;

public class TestAvg {
	public static void main(String[] args) {
		int n=10;
		int sum=0;
		int count=0;
		int  avg;
		for (int i = 1; i <=10; i++) {
			if(i%2==0) {
				sum=sum+i;
				count++;
			}
			
		}
		avg=sum/count;
		System.out.println(avg);
	}

}
