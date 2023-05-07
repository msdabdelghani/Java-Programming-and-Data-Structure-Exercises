package chapter7;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {5,3,2,7,4,7,8,9,4,2,0,14};
		int[] newList = new int[list.length];
		newList = selectionSort(list);
		for(int item : newList) {
			System.out.print(item + " " );
		}
	}
	
	public static int[] selectionSort(int[] array) {
		for(int  i = 0; i < array.length - 1; i++ )	{
			int min = array[i];
			int minIndex = i;
			for(int j = i + 1; j < array.length; j++ ) {
				if(array[j] < min) {
					min = array[j];	
					minIndex = j;
				}
			}
			if(minIndex != i) {
				int temp = array[i];
				array[i] = min;
				array[minIndex] = temp;
			}
		}
		return array;
	}

}
