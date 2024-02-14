package Assignment3;
public class A3Q3
{
	public static void main(String[]args)
	{
      int a[]= {1,1,1,13,3,3,1,1,2,1};
      int b = findFrequency(a,1);
      System.out.print(b);
	}
	
	public static int findFrequency(int[]a,int b)
	{
		int count=0;
		for (int i=0;i<=a.length-1;i++) {
			if (a[i]==b) {
				count++;
			}
		}
		return count;
	}
}
