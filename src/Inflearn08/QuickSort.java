package Inflearn08;

import java.util.Arrays;

public class QuickSort {
	
	//수도코드
//	Partition(A, p, r) //수도 코드
//	{
//	   x <- A[r]; //pivot
//	   i <- p-1; //i의 index는 처음부터 시작, 작은 값이 하나도 없는 상태에서 시작이기 때문에 p-1
//	   for j <- p to r-1 
//	       if A[j] <= x then //비교한값이 pivot보다 작을 때
//	          i <- i+1; //작은 애들의 마지막 인덱스를 1증가 
//	          exchange A[i] and A[j]; //비교한 값을 작은 애들의 마지막으로 넣음
//	    exchange A[i+1] and A[r]; //맨 끝에 있던 피봇을 큰애들과 작은 애들 사이로 이동
//	    return i + 1; //pivot의 자리 리턴
//	}
	public static int partition(int arr[], int left, int right) {
		// left, right는 배열의 인덱스
		int pivot = arr[(left + right) / 2]; //배열의 중간을 pivot으로 선정

		while (left < right) {
			while ((arr[left] < pivot) && (left < right))
				left++;
			while ((arr[right] > pivot) && (left < right))
				right--;

			if (left < right) {
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

