package sort;

public class Simple_selection_sort {
	private static int [] array = { 12, 34, 54, 65, 76, 32, 104, 16, 43, 21, 35, 66,87, 97, 94, 18};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ý tưởng thuật toán selection sort là: 
		// Chọn phần tử nhỏ nhất trong n phần tử ban đầu,
		// đưa phần tử này về vị trí đúng là đầu tiên của dãy hiện hành. 
		// Sau đó không quan tâm đến nó nữa, xem dãy hiện hành chỉ còn n-1 
		// phần tử của dãy ban đầu, bắt đầu từ vị trí thứ 2. Lặp lại quá trình trên 
		// cho dãy hiện hành đến khi dãy hiện hành chỉ còn 1 phần tử. 
		// Dãy ban đầu có n phần tử, vậy tóm tắt ý tưởng thuật toán là thực hiện n-1 lượt 
		// việc đưa phần tử nhỏ nhất trong dãy hiện hành về vị trí đúng ở đầu dãy.
		
		
		int viTri = 0;
		for (int i = 0; i < array.length; i++) {
			int j = i+1;
			viTri = i;
			int temp = array[i];
			for (; j < array.length; j++) {
				if(array[j] < temp) {
					temp = array[j];
					viTri = j;
				}
			}
			array [viTri] = array [i];  
	        array [i] = temp;  
		}
		for (int k = 0; k < array.length; k++) {
			System.out.println(array[k]);
		}
	}

}
