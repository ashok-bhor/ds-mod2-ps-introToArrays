package com.ab.homework;

public class ReverseArray {
	public static void main(String[] args) {
		int[] arr = { 3, -2, 1, 4, 2, 1, 0, 6 };
		int k = 12;

		arr = reverseInRange(arr,1,3);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	static int[] reverse(int[] arr) {

		int n = arr.length;
		for (int i = 0, j = n - 1; i < j; i++, j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}

		return arr;
	}

	static int[] reverseInRange(int[] arr, int s, int e) {

		int n = arr.length;
		for (int i = s, j = e; i < j; i++, j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}

	

		return arr;
	}
}