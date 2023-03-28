package com.ab.homework;

public class SumEqualToK {

	public static void main(String[] args) {
		int[] arr= {3,-2,1,4,3,6,8};
		int k=12;
		
		System.out.println(checkSum(arr, k));
		
	}

	static boolean checkSum(int[] arr,int k) {
		
		boolean check=false;
		int len=arr.length;
		
		for(int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
				if((arr[i]+arr[j])==k && i!=j)
					return true;
			}
		}
		
		return check;
	}
	
}
