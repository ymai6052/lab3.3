public class functions {
	public static void main(String[]args)
	{
		int [] nums = {4,7,9,2,6};
		double [] nums2 = {11.8,7.1,3.9,0.1,5.6,9.8};
		String [] string1= {"v","a","d","b","c"};
		
		//insertionSort(nums);
		//printArrayint(nums);
		
		//selectionSort(nums2);
		//printArraydouble(nums2);
		
		bubbleSort(string1);
		printArraystring(string1);
	}
	public static void insertionSort(int[] list1)
	{
		for(int i=0;i<list1.length;i++)
		{
			for (int j = i; j > 0; j--)	
			{
				if(list1[j] < list1[j-1])
				{
					swap(list1,j,j-1);
				}
			}
		}
	}
	public static void selectionSort(double [] list1)
	{
		double low;
		int index = 0;
		for (int j = 0; j < list1.length-1;j++)
		{
			low = list1[j];
			for (int i = j; i < list1.length;i++)
			{
				if(list1[i] < low)
				{
					low = list1[i];
					index = i;
				}
			}
			swap(list1,index,j);
		}
	}
	public static void bubbleSort(String [] list1)
	{
		boolean swapped=true;
		while(swapped)
		{
			int counter=0;
			for(int i=0;i<list1.length-1;i++)
			{ 
				if(list1[i].compareTo(list1[i+1])>0)
				{
					swapstring(list1,i+1,i);
					counter++;
				}
			}
			if(counter==0)
			{
				swapped=false;
			}
		}
	}
	public static void printArrayint(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.print(arr[i]+",");
		}
		System.out.print(arr[arr.length-1]);
	}
	public static void printArraystring(String[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.print(arr[i]+", ");
		}
		System.out.print(arr[arr.length-1]);
	}
	public static void printArraydouble(double[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.print(arr[i]+",");
		}
		System.out.print(arr[arr.length-1]);
	}
	public static void swap(int[]arr,int i,int j)
	{
		int x = arr[i];
		arr[i] = arr[j];
		arr[j] = x;
	}
	public static void swap(double[]arr,int i,int j)
	{
		double x = arr[i];
		arr[i] = arr[j];
		arr[j] = x;
	}
	public static void swapstring(String[]arr,int i,int j)
	{
		String x = arr[i];
		arr[i] = arr[j];
		arr[j] = x;
	}
}
