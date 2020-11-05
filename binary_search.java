package algorithms;
import java.util.Arrays;
import java.util.Scanner;

public class binary_search {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int low,high,mid,n,i,m,key;
		
		System.out.println("enter number of elements");
		n= s.nextInt();
		int a[] = new int [n];
		System.out.println("enter all "+n+" elements");
		for(i=0;i<n;i++)
		{
			m=s.nextInt();
			a[i]=m;
		}
		System.out.println("entered array is");
		System.out.println(Arrays.toString(a) );
		Arrays.sort(a);
		System.out.println("sorted array is");
		System.out.println(Arrays.toString(a) );
		System.out.println("enter key element to search");
		key=s.nextInt();
		
		
		low=0;
		high=n-1;
		mid=(low+high)/2;
		
		while(low<high)
		{
			if(a[mid]>key)
				high=mid-1;
			else if(a[mid]<key)
				low=mid+1;
			else if(a[mid] == key)
			{
				System.out.println("key found at pos: "+ (mid+1));
				break;
			}
			
			mid=(low+high)/2;
		}
		
		if(low>high)
			System.out.println("key not found");
		

	
		
	}

}
