package chapter7;

public class LinearSearchArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {1,2,3,4,5,6,7};
		
		System.out.println(linearSearch(list, 44));
	}
	
	public static int linearSearch(int[] list, int key) {
		for(int i = 0; i < list.length; i++) {
			if(list[i] == key)
				return i;
		}
		return -1;
	}
}
