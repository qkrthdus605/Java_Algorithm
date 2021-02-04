package Inflearn08;

import java.util.Arrays;

public class QuickSort {
	
	public static int partition(int arr[], int left, int right) {
		// left, right는 배열의 인덱스
		int pivot = arr[(left + right) / 2]; //배열의 중간을 pivot으로 선정

		while (left < right) {
			while ((arr[left] < pivot) && (left < right))
				left++; //pivot 보다 큰 값을 만날 때까지 
			while ((arr[right] > pivot) && (left < right))
				right--; //pivot 보다 작은 값을 만날 때까지

			if (left < right) { //엇갈린 상태라면 swap
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		}

		return left; //pivot 의 인덱스 리턴 
	}

	public static void quickSort(int arr[], int left, int right) {

		if (left < right) {
			int pivotNewIndex = partition(arr, left, right);

			quickSort(arr, left, pivotNewIndex - 1); //왼쪽 정렬
			quickSort(arr, pivotNewIndex + 1, right); //오른쪽 정렬
		}

	}

	public static void main(String[] args) {
		int[] arrs = { 69, 10, 30, 2, 16, 8, 31, 22 };
		quickSort(arrs, 0, arrs.length - 1);
		System.out.println("결과");

		for (int i : arrs) {
			System.out.print(i + " ");
		}
	}
}

