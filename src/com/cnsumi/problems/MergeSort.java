package com.cnsumi.problems;

public class MergeSort {
	public static void main(String[] args) {
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100 + 1);
		}
		printArray(array);
		mergeSort(array, 0, 10);
		printArray(array);
	}
	
	private static void mergeSort(int[] array,int start,int end) {
		if (end > start + 1) {
			int p = (start + end)/2;
			mergeSort(array, start, p);
			mergeSort(array, p, end);
			merge(array, start, end, p);
		}
	}
	private static void merge(int[] array,int start,int end,int p) {
		int i = 0;
		int j = 0;
		int[] left = new int[p - start];
		int[] right = new int[end - p];
		for (int n = start; n < end; n++) {
			if (n < p)
				left[i++] = array[n];
			else
				right[j++] = array[n];
		}
		i = 0;
		j = 0;
		for (int k = start; k < end; k++) {
//			if (i == p - start )
//				array[k] = right[j++];
//			else if (j == end - p )
//				array[k] = left[i++];
//			else\
			
			array[k] = left[i] < right[j] ? left[i++] : right[j++];
			if (i == p - start || j == end - p) {
				k++;
				for (; k < end; k++) {
					array[k] = i == p - start ? right[j++] : left[i++];
				}
			}
		}
	}
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println();
	}
}
