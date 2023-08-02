package in.com.rays;

public class Arraysort {
	public static void main(String[] args) {
		int arr[] = {5,10,40,50,1};
		int temp=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
			System.out.println(arr[i]);
		}
			
		}
		

}
