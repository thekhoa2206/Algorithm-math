package sort;

import java.util.ArrayList;
import java.util.Arrays;

public class Radix_sort {
	private static int [] array = { 12, 34, 54, 65, 76, 32, 104, 16, 43, 21, 35, 66,87, 97, 94, 18};
	public static void main(String[] args) {
//		Radix Sort — Một thuật toán sắp xếp theo phương pháp cơ số không quan tâm 
//		đến việc so sánh giá trị của các phần tử như các thuật toán sắp xếp khác 
//		như Bubble sort, Selection sort, … Radix Sort sử dụng cách thức phân loại 
//		các con số trong dãy và thứ tự phân loại con con số này để tạo ra thứ tự 
//		cho các phần tử. Đây là cách tiếp cận khác so với các phương pháp sắp xếp khác.
		radixSort(array);
	}
	public static void  radixSort ( int [] array) {    
	    int  max = array [ 0 ];  
	    for  ( int  i =  1 ; i <array.length; i ++) {  
	        if  (array [i]> max) {  
	            max = array [i];  
	        }  
	    }  
	    int  time =  0 ;  
	    while  (max>  0 ) {  
	        max /=  10 ;  
	        time ++;
	    }  
	  
	  
	    ArrayList <ArrayList <Integer >> queue =  new  ArrayList <> ();  
	    for  ( int  i =  0 ; i <  10 ; i ++) {  
	        ArrayList <Integer> queue1 =  new  ArrayList <> ();  
	        queue.add (queue1);  
	    }  
	  
	  
	    for  ( int  i =  0 ; i <time; i ++) {  
	        for  ( int  anArray: array) {  
	            int  x = anArray% ( int ) Math.pow ( 10 , i +  1 ) / ( int ) Math.pow ( 10 , i);  
	            ArrayList <Integer> queue2 = queue.get (x);  
	            queue2.add (anArray);  
	            queue.set (x, queue2);  
	        }  
	        int  count =  0 ; 
	        for  ( int  k =  0 ; k <  10 ; k ++) {  
	            while  (queue.get (k) .size ()>  0 ) {  
	                ArrayList <Integer> queue3 = queue.get (k);  
	                array [count] = queue3.get ( 0 );  
	                queue3.remove ( 0 );  
	                count ++;  
	            }  
	        }  
	    }  
	    System.out.println (Arrays.toString (array) +  "radixSort" );  
	}  
}
