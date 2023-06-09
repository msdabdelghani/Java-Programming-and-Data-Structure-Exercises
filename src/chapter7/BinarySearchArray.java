package chapter7;

public class BinarySearchArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
		System.out.println(binarySearch(list, 3));
	}
	
	public static int binarySearch(int[] list, int key) {
		int low = 0;
		int high = list.length - 1;
		while(high >= low) {
			int mid = (low + high) / 2;
			if(list[mid] > key) 
				high = mid - 1;
			else if(list[mid] < key)
				low = mid + 1;
			else
				return mid;
		}
		return -low - 1;
	}

}
