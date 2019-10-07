
import java.io.IOException;

public class binarySearch {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int k =2;
                int a [] = {1,11,6,2,6,9,1};
		     
		     int index= binarySearch(a,0,a.length-1,k);
		     if(index==-1) {
		    	 System.out.println("Element is not present in the array.");
		     }else
		    	 System.out.println("Element is present in the array.");
		
	}
	
	static int binarySearch(int[] a ,int low,int high,int k) {
		
		if(high>=low) {
		int mid = low+ (high-low)/2;
		
		if(a[mid] == k) {
			return mid;
		}
	    if(a[mid]>k) {
			return binarySearch(a, low, mid-1, k);
			
		}
		if(a[mid]<k) {
			return binarySearch(a, mid+1, high, k);
		}
		
		}
		return -1;
		
	}
	

}
