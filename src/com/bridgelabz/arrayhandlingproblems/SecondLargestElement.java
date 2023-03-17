package com.bridgelabz.arrayhandlingproblems;

public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = new int [] {17,45,56,24,21,81,98,121,13,97};
        int temp=0;
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
			   temp = arr[i];
				   arr[i]=arr[j];
				   arr[j]=temp;
				}  
			}
		}
		System.out.println("Array in Ascending order :");
		for(int i=0;i<arr.length;i++)
		{
			
			System.out.println(arr[i]);
		}
		
		System.out.println("Largest elememet :"+arr[arr.length-1]);
		System.out.println("2nd Largest :"+arr[arr.length-2]);
	}
	

}
