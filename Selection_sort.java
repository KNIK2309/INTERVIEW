import java.util.*;
public class Selection_sort
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n,i,j,temp,min=0;
		System.out.println("enter no. of elements to sort");
		int size=sc.nextInt();
		System.out.println("enter the elements");
		int arr[]=new int[size];
		for(n=0;n<size;n++)
		arr[n]=sc.nextInt();
		//SELECTION SORT
		for(i=0;i<size-1;i++)
		{
			min=i;
			for( j=i+1;j<size;j++)
			if (arr[j]<arr[min])
			min = j;
			temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		System.out.println("the sorted elements using Selection sort are: ");
		for (i=0;i<size;i++)
		System.out.println(arr[i]+" ");
		sc.close();
		
	}
}
