package com.bean;

public class BinarySearchImplementation {
//O( log n) where n is the number of elements
	static int[] arr=new int[] {1,2,3,4,5};
	public static void main(String[] args) {
		System.out.println(binarySearch(arr,6));
	}
	public static int binarySearch(int[] array, int value) {
		int left=0;
		int right=arr.length-1;
		while(left<=right) {
			int mid=(left+right)/2;
			if(value==arr[mid]) {
				return arr[mid];
			}
			 if(arr[mid]<value) {
				 left=mid+1;
			}
			 else
					right=mid-1;

			
			}
		return -1;
	}
	
}
