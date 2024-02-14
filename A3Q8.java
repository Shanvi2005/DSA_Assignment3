package Assignment3;
public class A3Q8 {

    static int largestElement(int[] arr, int n) {
        int a = arr[0];
        for (int i=1;i<=n-1;i++)
        {
            if (arr[i]>a)
            {
                a=arr[i];
            }
        }
        return a;

    }
}
