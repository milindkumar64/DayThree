package com.bridgelabz.arrayhandlingproblems;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			if((arr.length-i-1)>i)
			{
			temp=arr[arr.length-i-1];
			arr[arr.length-i-1]=arr[i];
			arr[i]=temp;
			}
		}
		
		System.out.println("Array in Reverse :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	

}
