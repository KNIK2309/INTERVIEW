import java.util.Scanner;
public class Insertion_sort
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n,i,j,key;
		System.out.println("enter no. of elements to sort");
		int size=sc.nextInt();
		System.out.println("enter the elements");
		int arr[]=new int[size];
		for(n=0;n<size;n++)
		arr[n]=sc.nextInt();
		//INSERTION SORT
		for(i=1;i<size;i++)
		{
		key=arr[i];
		j=i-1;
		while(j>=0 && arr[j] > key)
		 {
				arr[j+1]=arr[j];
				j=j-1;
		 }
		arr[j+1]=key;
		}
		System.out.println("the sorted elements using insertion sort are: ");
		for (i=0;i<size;i++)
		System.out.println(arr[i]+" ");
		sc.close();
		
	}}		