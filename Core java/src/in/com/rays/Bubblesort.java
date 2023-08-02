package in.com.rays;

public class Bubblesort {
	public static void main(String[] args) {
		int arr[] = { 1, 56, 45, 67, 89, 66 };
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length - i - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}

			System.out.println(arr[i]);

		}
	}

}
