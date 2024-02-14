package Assignment3;
public class A3Q2
{
public static void main(String[]args)
{
	int [] arr = {3,2,1,56,100000,167};
	int[] a = getMinMax(arr);
	System.out.print("Minimum: " + a[0] + ", Maximum: " + a[1]);
	// if you write sop(array) garbage value is printed
}
public static int[] getMinMax(int[]arr)
{
	int min = arr[0];
	int max= arr[0];
	for(int i=1;i<arr.length;i++) {
		if (arr[i]>max) {
			max=arr[i];
		}
		if (arr[i]<min) {
			min=arr[i];
		}
	}
	return new int[] {min,max};
}
}
