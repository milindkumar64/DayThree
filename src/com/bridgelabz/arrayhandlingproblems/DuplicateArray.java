package com.bridgelabz.arrayhandlingproblems;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {21,6,21,7,21,7};
		int freq[]=new int [arr.length];
		int visited =-5;
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
			
				if(arr[i]==arr[j])
				{   count++;
				    freq[j]=visited;
					//System.out.println("duplicate element :"+arr[i]+" are :"+ count);
				}
			}
			if(freq[i]!=visited)
			{
				freq[i]=count;
				//System.out.println(i);
			}	
		}
		
		for(int i=0;i<freq.length;i++)
		{
			if(freq[i]!=visited)
			System.out.println(freq[i]);
		}
	}
	

}
