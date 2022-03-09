package activities;

public class Activity4 {

	public static void main(String[] args) {
	int arr[]= {4,3,2,10,12,1,5,6};
	int temp=0;
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");
	
	}

	}

}
