package EvenNumbersInaRange;

import java.util.Scanner;

public class EvenNumbersInaRange {
	
	public static int[] EvenNumber(int[] arr,int[][] array1,int size)
	{
		int[] array = new int[size];
		array[0] = (arr[0] %2 ==0)? 1 : 0;
		for(int i=1;i<size;i++)
		{
			array[i] += (arr[i] %2 ==0)? array[i-1]+1 : array[i-1]; 
		}
		return array;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Size of the Array :");
		int number = scan.nextInt();
		System.out.println("Enter elements of the Array :");
		int[] arr = new int[number];
		for(int i =0;i<number;i++)
		{
			arr[i]=scan.nextInt();
		}
		int size = arr.length;
		int [][] array1 = new int[3][2];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				array1[i][j] = scan.nextInt();
			}
		}
		int result[] = EvenNumber(arr,array1,size);
		int iterator =0;
		while(iterator < array1.length)
		{
			int left = array1[iterator][0];
			int right = array1[iterator][1];
			if(left == 0)
			{
				System.out.println(result[right]+ " ");
			}
			else
			{
				System.out.println(result[right] - result[left -1] +" ");
				
			}
			iterator++;
		}

	}

}
