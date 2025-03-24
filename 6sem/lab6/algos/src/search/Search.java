package search;

import java.util.Arrays;

public class Search {
	

	public static void main(String[] args) {
		int[] ar = {3, 4, 56, 12, 23, 9, 61, 40};
		System.out.println(linearSearch(ar, 40));
		
		bubbleSort(ar);
		Arrays.stream(ar).forEach(x -> System.out.print(x + " "));
		System.out.println();
		
		System.out.println(binarySearch(ar, 40));
		
	}

	
	private static int linearSearch(int[] ar, int x) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == x) {
				return i;
			}
		
		}
		
		return -1;
	}
	
	
	private static int binarySearch(int[] ar, int x) {
		int l = 0;
		int r = ar.length - 1;
		int middle = 0;
		while (l <= r) {
			middle = (l + r) / 2;
			if (x == ar[middle]) return middle;
			else if (x < ar[middle]) r = middle - 1;
			else l = middle + 1;
		}
		
		return -1;
	}
	
	private static void bubbleSort(int[] arr) {
		 int i, j, temp;
		 int n = arr.length;
	     boolean swapped;
	     for (i = 0; i < n - 1; i++) {
	         swapped = false;
	         for (j = 0; j < n - i - 1; j++) {
	             if (arr[j] > arr[j + 1]) {
	                    
	                    // Swap arr[j] and arr[j+1]
	                 temp = arr[j];
	                 arr[j] = arr[j + 1];
	                 arr[j + 1] = temp;
	                 swapped = true;
	             }
	         }
	         if (swapped == false)
	             break;
	     }

	}
	
}
