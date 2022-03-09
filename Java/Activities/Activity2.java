package activities;

public class Activity2 {

	public static void main(String[] args) {
		int sum=0;

		int arr[]= {10,77,10,54,-11,10};
		for(int i=0;i<arr.length;i++) {
			
		if(arr[i]==10) {
						 sum=sum+arr[i];
		}
		
		}
	if(sum==30) {
		System.out.println("True");
	}
	else {
		System.out.println("False");
	}
		
	}

}
