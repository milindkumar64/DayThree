package com.bridgelabz.arrayhandlingproblems;

public class ArrayFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,2,3,4,4,6,2,3,4,6,5,5};
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		int count5=0;
		int count6=0;
		
		
		for(int i=0;i<arr.length;i++)
		{
		   if(arr[i]==1)
		   {   ++count1;
		   
		   }
		   if(arr[i]==2)
		   {   ++count2;
		   
		   }
		   if(arr[i]==3)
		   {   ++count3;
		   
		   }
		   if(arr[i]==4)
		   {   ++count4;
		   
		   }
		   if(arr[i]==5)
		   {   ++count5;
		   
		   }		 
		   if(arr[i]==6)
		   {   ++count6;
		   }
		  
		}

		
		System.out.println(count1);
		System.out.println(count2);
		System.out.println(count3);
		System.out.println(count4);
		System.out.println(count5);
		System.out.println(count6);
	}

}
