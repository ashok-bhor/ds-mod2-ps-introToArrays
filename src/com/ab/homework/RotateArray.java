package com.ab.homework;

public class RotateArray {

	public static void main(String[] args) {
		int[] arr = { 3, -2, 1, 4, 3, 6, 8 };

		int n = arr.length;

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
		int k=4;
		arr=rightRotate(arr, n, k);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	static int[] rightRotate(int[] arr, int n,int k) {

		arr=reverseInRange(arr,0,n-1);
		arr=reverseInRange(arr, 0, k-1);
		arr=reverseInRange(arr, k, n-1);
		
		return arr;
	}

	static int[] leftRotate(int[] arr, int n,int k) {

		arr=reverseInRange(arr,0,n-1);
		arr=reverseInRange(arr, 0, k-1);
		arr=reverseInRange(arr, k, n-1);
		
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