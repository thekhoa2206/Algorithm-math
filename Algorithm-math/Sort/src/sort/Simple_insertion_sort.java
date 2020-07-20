package sort;

import java.util.Arrays;

public class Simple_insertion_sort {
	private static int [] array = { 12, 34, 54, 65, 76, 32, 104, 16, 43, 21, 35, 66,87, 97, 94, 18};
	public static void main(String[] args) {
//		Insertion sort là một thuật toán sắp xếp đơn giản, nó tạo ra mảng được sắp xếp
//		cuối cùng một phần tử một lúc. Nó kém hiệu quả đối với mảng dữ liệu lớn 
//		so với các thuật toán sắp xếp khác.

//		Ưu điểm của Insertion Sort:
//			+ giải thuật đơn giản, dễ sử dụng
//			+ Nó rất hiệu quả với bộ dữ liệu nhỏ
//			+ tính ổn định cao
		
		for  ( int  i =  1 ; i <array.length; i ++) {  
	         int  temp = array [i];  
	         int  j = i -  1 ;  
	         for  (; j >=  0  && array [j]> temp; j--) {  
	    
	             array [j +  1 ] = array [j];  
	         }  
	         array [j +  1 ] = temp;  
	     }  
	     System.out.println (Arrays.toString (array) +  "insertSort" );  

	}

}
