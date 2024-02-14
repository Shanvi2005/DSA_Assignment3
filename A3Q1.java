package Assignment3;
public class A3Q1
{
	public static void main(String[]args) 
	{
	  	int [] arr = {3,4,2};
	  	int a=PeakElement(arr,arr.length);
	  	System.out.print(a);
	}
	public static int PeakElement(int[]arr,int n) {
		if(n==1) {return 0;}
		if(arr[0]>arr[1]) { return 0;}
		if(arr[n-1]>arr[n-2]) {return n-1;}
		
		int low=1; int high=n-2;
		
		while (low<=high){ // low<=high not low<high
			int mid = (low+high)/2;
			if((arr[mid]>arr[mid-1])&&(arr[mid]>arr[mid+1])) {
				return mid;
			}
			else if(arr[mid]>arr[mid-1]) {
				low = mid+1;
			}
			else {
				high=mid-1;
			}
			
			}
		return -1;
	}
}
