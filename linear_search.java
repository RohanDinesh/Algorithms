package algorithms;
import java.util.Scanner;

public class linear_search {
public static void main(String[] args)
{
	int found=0,i,j,key;
	@SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
	
	System.out.println("Enter size of an array");
	int m= s.nextInt();
	int[] a = new int[m];
	
	System.out.println("Enter array elements");
	for( i=0;i<m;i++)
		a[i]=s.nextInt();
	System.out.println("Enter key element");
	 key = s.nextInt();
	
	for( j=0;j<m;j++)
	{
		if (key==a[j])
		{
			found=1;
			break;
		}
		
	}
	
	if(found==1)
		System.out.println("key:"+key+" found at position:"+(j+1) );
	else
		System.out.println("key not found");
}
}