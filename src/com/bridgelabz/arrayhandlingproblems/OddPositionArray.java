package com.bridgelabz.arrayhandlingproblems;

public class OddPositionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int arr[] = {1,2,3,4,4,6,8,2,3,4,6,5,7,4,3,2,1,0,0,8,9};
         for(int i=0;i<=arr.length;i++)
         {
        	 if(i%2==0)
        		 System.out.println(arr[i]);
         }
	}

}
