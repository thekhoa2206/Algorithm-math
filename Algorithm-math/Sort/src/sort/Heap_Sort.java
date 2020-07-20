package sort;

import java.util.Arrays;

public class Heap_Sort {
	private static int [] array = { 12, 34, 54, 65, 76, 32, 104, 16, 43, 21, 35, 66,87, 97, 94, 18};
	public static void main(String[] args) {
//		– Với một tập danh sách n phần từ T1 – T2 – T3… Tn. Ta coi nó như 
//		một cây nhị phân.

//		– Quy định cho cây nhị phân như nhau.
//		Nếu một node là tại vị trí = i. Thì node này có 2 nhánh trái và 
//		phải tương ứng như sau.
//		+ Nhánh trái là phần tử 2*i + 1 và nhánh phải là 2*i+ 2 với điều kiện là < n
//		– Nguyên lý được thực hiện như sau:
//		+ Xây dựng đống sao cho với mọi nút cha đều có giá trị lớn hơn nút con => 
//		nút gốc đầu tiên sẽ có giá trị lớn nhất.
//		+ Hoán vị nút gốc với nút thứ n-1 và xây dựng lại đống mới với n-2, 
//		sau đó tiếp tục hoán vị nút gốc với nút cuối của cây mới sau n-2.
		heapSort(array);
	}
	public static void heapSort(int[] array) {  
		   
	    int len = array.length - 1;  
	    int beginIndex = (len - 1) >> 1;  
	    for (int i = beginIndex; i >= 0; i--) {  
	        maxHeapify(i, len, array);  
	    }  
	   
	    for (int i = len; i > 0; i--) {  
	        swap(0, i, array);  
	        maxHeapify(0, i - 1, array);  
	    }  
	    System.out.println(Arrays.toString(array) + " heapSort");  
	}  
	private static void swap(int i, int j, int[] arr) {  
	    int temp = arr[i];  
	    arr[i] = arr[j];  
	    arr[j] = temp;  
	}  

	private static void maxHeapify(int index, int len, int[] arr) {  
	    int li = (index << 1) + 1; 
	    int ri = li + 1;           
	    int cMax = li;             
	    if (li > len) {  
	        return;       
	    }  
	    if (ri <= len && arr[ri] > arr[li])
	    { cMax = ri; }  
	    if (arr[cMax] > arr[index]) {  
	        swap(cMax, index, arr);      
	        maxHeapify(cMax, len, arr);  
	    }  
	}  
}
