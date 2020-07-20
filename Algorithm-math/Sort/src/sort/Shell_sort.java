package sort;

import java.util.Arrays;

public class Shell_sort {
	private static int [] array = { 12, 34, 54, 65, 76, 32, 104, 16, 43, 21, 35, 66,87, 97, 94, 18};
	public static void main(String[] args) {
//		Shell sort còn được gọi là sắp xếp tăng hẹp, nó là một insertion sort. 
//		Là một thuật toán bổ sung cho insertion sort

//  	ý tưởng thuật toán:
//		Mỗi row được group bởi các step gap, mỗi group sử dụng insertion sort để sắp xếp, 
//		khi step gap giảm các group chứa được nhiều record hơn. Khi giá trị của gap 
//		được giảm xuống còn 1 toàn bộ dữ liệu được kết hợp thành một group để 
//		tạo thành một bộ dữ liệu đã được sắp xếp.
		
		 int  i;  
		    int  j;  
		    int  temp;  
		    int  gap =  1 ;  
		    int  len = array.length;  
		    while  (gap <len /  3 ) {gap = gap *  3  +  1 ;}  
		    for  (; gap>  0 ; gap /=  3 ) {  
		        for  (i = gap; i <len; i ++) {  
		            temp = array [i];  
		            for  (j = i - gap; j >=  0  && array [j]> temp; j -= gap) {  
		                array [j + gap] = array [j];  
		            }  
		            array [j + gap] = temp;  
		        }  
		    }  
		    System.out.println (Arrays.toString (array) +  "shellSort" ); 
	}

}
