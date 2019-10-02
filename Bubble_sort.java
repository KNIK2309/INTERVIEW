import java.util.*;
public class Bubble_sort
{
	public static void main (String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,i,j,temp;
		System.out.println("enter no. of elements to sort");
		int size=sc.nextInt();
		System.out.println("enter the elements");
		int arr[]=new int[size];
		for(n=0;n<size;n++)
		arr[n]=sc.nextInt();
		//BUBBLE SORT
		for(i=0;i<size-1;i++)
		for(j=0;j<size-1;j++)
		if (arr[j]>arr[j+1])
			{
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		System.out.println("the sorted elements using bubble sort are: ");
		for (i=0;i<size;i++)
		System.out.println(arr[i]+" ");
		sc.close();
	}
}


