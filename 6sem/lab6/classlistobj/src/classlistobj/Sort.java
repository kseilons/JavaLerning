package classlistobj;

import java.util.ArrayList;
import java.util.List;

public class Sort{
		public static <T extends Comparable<T>> void  mergeSort(List<T> list, int l, int r) {
	        if (l < r) {
	            int mid = (l + r) / 2;
	            mergeSort(list, l, mid);
	            mergeSort(list, mid + 1, r);
	            merge(list, l, mid, r);
	        }
	    }

		private static <T extends Comparable<T>> void  merge(List<T> list, int l, int mid, int r) {
	        int n1 = mid - l + 1;
	        int n2 = r - mid;

	        List<T> leftList = new ArrayList<>(n1);
	        List<T> rightList = new ArrayList<>(n2);

	        for (int i = 0; i < n1; i++) {
	            leftList.add(list.get(l + i));
	        }

	        for (int i = 0; i < n2; i++) {
	            rightList.add(list.get(mid + 1 + i));
	        }

	        int i = 0, j = 0;
	        int k = l;
	        while (i < n1 && j < n2) {
	            if (leftList.get(i).compareTo(rightList.get(j)) <= 0) {
	                list.set(k, leftList.get(i));
	                i++;
	            }
	            else {
	                list.set(k, rightList.get(j));
	                j++;
	            }
	            k++;
	        }

	        while (i < n1) {
	            list.set(k, leftList.get(i));
	            i++;
	            k++;
	        }

	        while (j < n2) {
	            list.set(k, rightList.get(j));
	            j++;
	            k++;
	        }
		}
    
	}
	