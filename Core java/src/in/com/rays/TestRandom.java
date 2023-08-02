package in.com.rays;

public class TestRandom {
	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
			int j=(int)(Math.random()*1000);
			if(j>99) {
				System.out.println(j);
			}
			
		}
	}

}
