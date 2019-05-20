import java.util.*;
public class sorting {
public static void sortSelection (int []unsrtd)
{
	int temp =0;
	int min =0;
	for(int i=0; i<unsrtd.length; i++ )
	{
		min=i;
		for(int j=i+1; j<unsrtd.length; j++)
		{
			if (unsrtd[j]<unsrtd[min])
			{
				min=j;
			}
		}
			temp =unsrtd[i];
			unsrtd[i]=unsrtd[min];
			unsrtd[min]= temp;
		
	}
}
public static void sortBubble (int []unsrtd)
{
	int temp =0;
	// printing the array before the sorting
	System.out.println("before sorting: ");
	for (int h=0; h<unsrtd.length; h++)
	{
		System.out.println(unsrtd[h]);
	}
	for (int i=0; i<unsrtd.length-1;i++)
	{
		for (int j=0; j<unsrtd.length-i-1; j++)
		{
			if(unsrtd[j]>unsrtd[j+1])
			{
				temp = unsrtd[j];
				unsrtd[j]= unsrtd[j+1];
				unsrtd[j+1]=temp;
			}
		}
		
	}
	// printing the array after the sorting
			System.out.println("after sorting");
			for (int k=0; k<unsrtd.length; k++)
			{
				System.out.println(unsrtd[k]);
			}
			
}
public static Scanner in=new Scanner (System.in);
	public static void main(String[] args) {
		
		System.out.println("enter array size:");
		int arrSize= in.nextInt();
		int arr[]= new int [arrSize];
		for (int h=0; h<arr.length; h++)
		{
			arr[h]= (int)(Math.random()*1000)+1;
		}
		sortBubble(arr);
		for(int i=arr.length-1; i!=-1 ; i--)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("2 d array now!");
		twoDArrey();		
	}
	public static void twoDArrey ()
	{
		System.out.println("i");
		int [][] a= new int[5][4];
		for (int i=0; i<a.length; i++)
		{
			for (int j=0; j<a[i].length; j++)
			{
				a[i][j]= (int)(Math.random()*1000)+1;
			}
		}
		// sorting the array
		for(int i=0; i<a.length;i++)
		{
			sortBubble(a[i]);
		}
		// printing it out from the biggest to the smallest
		for (int i=0; i< a.length; i++)
		{
			for(int j=a[i].length-1; j!=-1; j--)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
	}

}
