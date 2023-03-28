package com.ab.homework;

/*Given an array of size N, count no of elements which has atleast one 
 * 	 element greater than itself.
	 A= {-3,-2,6,8,4,8,5}
*/

//??Not working
public class CountGreaterElements {

	public static void main(String[] args) {
//		/int[] arr = { -3, -2, 6, 8, 4, 8, 5 };
		int[] arr = { 3,4,1,7,2,7 };
		System.out.println(getCount(arr));
	}

	static int getCount(int arr[]) {

		int max = arr[0];
		int len = arr.length;
		int count = 0;
		int maxCount=0;

		for (int i = 0; i < len; i++) {
			if (arr[i] > max)
			{
				max = arr[i];
				count++;
			}
			
			
		}
		return count;
	}

	static int findMax(int arr[]) {

		int max = arr[0];
		int len = arr.length;

		for (int i = 0; i < len; i++) {
			if (arr[i] > max)
				max = arr[i];

		}
		return max;
	}
}
