package sort;

public class Bubble_sort {

	public static void main(String[] args) {
		//thuật toán Bubble sort là thuật toán sắp xếp bằng cách đổi chỗ các phần tử
		int [] Array = { 12, 34, 54, 65, 76, 32, 104, 16, 43, 21, 35, 66,87, 97, 94, 18};
		int temp = 0;
		for (int i=0; i < Array.length-1 ;i++ ) {
			for(int j=0; j< Array.length - i -1; j++) {
				if(Array[j] > Array[j+1]) {
					temp = Array[j];
					Array[j] = Array[j+1];
					Array[j+1] = temp;
				}
			}
		}
		System.out.println("thứ tự từ nhỏ đến lớn: ");
		for (int j = 0; j < Array.length; j++) {
			System.out.println(Array[j] );	
		}
	}

}
