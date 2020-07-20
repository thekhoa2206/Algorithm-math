package sort;

import java.util.Arrays;

public class Merge_sort {
	private static int [] array = { 12, 34, 54, 65, 76, 32, 104, 16, 43, 21, 35, 66,87, 97, 94, 18};
	public static void main(String[] args) {
//	Các bước để thực hiện thuật toán Merge Sort:
//		+ Chia mảng dữ liệu chưa sort thành n phân vùng, mỗi phân vùng chứa 1 phần tử.
//		Tại đây phần tử được coi đã được sắp xếp
//		+ Lặp đi lặp lại các đơn vị được phân chia để tạo ra một mảng mới cho đến khi
//		chỉ còn lại 1 mảng con. Cuối cùng thu được một mảng đã được sắp xếp
		mergingSort(array);
	}
	public static void  mergingSort ( int [] array) {    
	    sort (array,  0 , array.length -  1 );  
	    System.out.println (Arrays.toString (array) +  "mergingSort" );  
	}  
	  
	private static void  sort ( int [] data,  int  left,  int  right) {    
	    if  (left <right) {  
	        int  center = (left + right) /  2 ;  
	        sort (data, left, center);  
	        sort (data, center +  1 , right);  
	        merge (data, left, center, right);  
	    }  
	}  
	  
	private static void  merge ( int [] data,  int  left,  int  center,  int  right) {    
	    int [] tmpArr =  new int [data.length];   
	    int  mid = center +  1 ;  
	    int  third = left;  
	    int  tmp = left;  
	    while  (left <= center && mid <= right) {  
	        if  (data [left] <= data [mid]) {  
	            tmpArr [third ++] = data [left ++];  
	        }  else  {  
	            tmpArr [third ++] = data [mid ++];  
	        }  
	    }  
	  
	    while  (mid <= right) {  
	        tmpArr [third ++] = data [mid ++];  
	    }  
	  
	    while  (left <= center) {  
	        tmpArr [third ++] = data [left ++];  
	    }  
	  
	    while  (tmp <= right) {  
	        data [tmp] = tmpArr [tmp ++];  
	    }  
	}  
}
