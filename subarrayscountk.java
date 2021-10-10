// Java program to count number of subarrays
// whose maximum element is greater than K.
import java.util.*;

class subarrayscountk {

	static int countSubarray(int arr[], int n, int k)
	{

		int s = 0;

		int i = 0;
		while (i < n) {
			if (arr[i] > k) {
				i++;
				continue;
			}

			int count = 0;
			while (i < n && arr[i] <= k) {
				i++;
				count++;
			}
			s += ((count * (count + 1)) / 2);
		}

		return (n * (n + 1) / 2 - s);
	}

	public static void main(String[] args)
	{

		int arr[] = { 1, 2, 3 };
		int k = 2;
		int n = arr.length;
		System.out.print(countSubarray(arr, n, k));
	}
}
