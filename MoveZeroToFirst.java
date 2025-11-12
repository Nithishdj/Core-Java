package Tasks;

public class MoveZeroToFirst {
	public static void main(String args[]) {
		int arr[] = {1,0,5,0,3,2,0,0};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j+1]==0) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
