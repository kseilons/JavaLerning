package sort;

public class Sort{
	public static void main(String[] args){
		int[] numbers = {40, 7, 59, 4, 1};
		int[] sec = {40, 7, 59, 4, 1};
		int[] th = {40, 7, 59, 4, 1};
		selectionSort(numbers);
		bubbleSort(sec);
		mergeSort(th, 0, th.length - 1);
		show(th);
	}
	
	
	private static void selectionSort(int[] numbers) {
		int indexMin = 0; //the index of the smallest number
		for(int i = 0; i< numbers.length; i++){
			indexMin = i;
			for(int j = i + 1; j < numbers.length; j++){
				if(numbers[j] < numbers[indexMin]){//if we find a smaller int, set it as the min
					indexMin = j;
				}
			} //we now have the index of the smallest int and can swap the values
			int temp = numbers[i]; //use temp to store the value
			numbers[i] = numbers[indexMin];
			numbers[indexMin] = temp;
		}

		show(numbers);
		
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

	     show(arr);
	}
	
	private static void show(int[] ar) {
		for(int k = 0; k < ar.length; k++){
			System.out.print(ar[k] + " ");
		}
		System.out.println();
		
	}
	
	
	private static void mergeSort(int[] ar, int l, int r) {

		if (l < r) {
		
			int mid = (l + r) / 2;
			mergeSort(ar, l, mid);
			mergeSort(ar, mid+1, r);
			
			
			merge(ar, l, mid, r);
		}
	}
	
	private static void merge(int[] ar, int l, int mid, int r) {
		int n1 = mid - l + 1;
		int n2 = r - mid;
		
		int lArr[] = new int[n1];
		int rArr[] = new int[n2];
		
		for (int i = 0; i < n1; i++) {
			lArr[i] = ar[l+i];
		}
		
		for (int i = 0; i < n2; i++) {
			rArr[i] = ar[mid + 1 + i];
		}
		
		int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (lArr[i] <=rArr[j]) {
                ar[k] = lArr[i];
                i++;
            } else {
                ar[k] = rArr[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            ar[k] = lArr[i];
            i++;
            k++;
        }
        while (j < n2) {
            ar[k] = rArr[j];
            j++;
            k++;
        }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}