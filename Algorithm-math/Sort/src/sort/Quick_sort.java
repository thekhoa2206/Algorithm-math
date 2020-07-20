package sort;

import java.util.Arrays;

public class Quick_sort {
	private static int [] list = { 12, 34, 54, 65, 76, 32, 104, 16, 43, 21, 35, 66,87, 97, 94, 18};
	public static void main(String[] args) {
		// Quick sort là phương pháp đổi chỗ từng phần
		// đây là phương pháp rất hiệu quả, rất thông dụng

		//Chọn một nút bất kỳ trong danh sách(Giả sử là nút số 5) 
		// gọi là nút làm trục (pivot node), xác định vị trí hợp lệ của nút này 
		// trong danh sách (gọi là vị trí pivot).
		// Tiếp theo chúng ta phân hoạch các nút còn lại trong danh sách cần sắp xếp 
		// sao cho từ vị trí 0 đến vị trí pivot-1 đều có nội dung nhỏ hơn hoặc bằng nút 
		// làm trục, các nút từ vị trí pivot+1 đến n-1 đều có nội dung lớn hơn nút làm trục.
		// Quá trình lại tiếp tục như thế với hai danh sahs con từ trị trí 0 đến vị trí 
		// pivot-1 và từ vị trí pivot+1 đến vị trí n-1, … Sau cùng chúng ta sẽ được danh sách 
		// có thứ tự.
		
		quickSort(list);
	}
	
	public static void quickSort(int[] array) {  
	    _quickSort(array, 0, array.length - 1);  
	    System.out.println(Arrays.toString(array) + " quickSort");  
	}  
	  
	  
	private static int getMiddle(int[] list, int low, int high) {  
	    int tmp = list[low];    
	    while (low < high) {  
	        while (low < high && list[high] >= tmp) {  
	            high--; 
	        }  
	  
	  
	        list[low] = list[high];   
	        while (low < high && list[low] <= tmp) {  
	            low++;  
	        }  
	  
	  
	        list[high] = list[low];   
	    }  
	    list[low] = tmp;              
	    return low;                  
	}  
	  
	  
	private static void _quickSort(int[] list, int low, int high) {  
	    if (low < high) {  
	        int middle = getMiddle(list, low, high);  
	        _quickSort(list, low, middle - 1);      
	        _quickSort(list, middle + 1, high);      
	    }  
	} 

}
