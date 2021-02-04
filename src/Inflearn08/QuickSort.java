package Inflearn08;

import java.util.Arrays;

public class QuickSort {
	
	//�����ڵ�
//	Partition(A, p, r) //���� �ڵ�
//	{
//	   x <- A[r]; //pivot
//	   i <- p-1; //i�� index�� ó������ ����, ���� ���� �ϳ��� ���� ���¿��� �����̱� ������ p-1
//	   for j <- p to r-1 
//	       if A[j] <= x then //���Ѱ��� pivot���� ���� ��
//	          i <- i+1; //���� �ֵ��� ������ �ε����� 1���� 
//	          exchange A[i] and A[j]; //���� ���� ���� �ֵ��� ���������� ����
//	    exchange A[i+1] and A[r]; //�� ���� �ִ� �Ǻ��� ū�ֵ�� ���� �ֵ� ���̷� �̵�
//	    return i + 1; //pivot�� �ڸ� ����
//	}
	public static int partition(int arr[], int left, int right) {
		// left, right�� �迭�� �ε���
		int pivot = arr[(left + right) / 2]; //�迭�� �߰��� pivot���� ����

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

		return left; //pivot �� �ε��� ���� 
	}

	public static void quickSort(int arr[], int left, int right) {

		if (left < right) {
			int pivotNewIndex = partition(arr, left, right);

			quickSort(arr, left, pivotNewIndex - 1); //���� ����
			quickSort(arr, pivotNewIndex + 1, right); //������ ����
		}

	}

	public static void main(String[] args) {
		int[] arrs = { 69, 10, 30, 2, 16, 8, 31, 22 };
		quickSort(arrs, 0, arrs.length - 1);
		System.out.println("���");

		for (int i : arrs) {
			System.out.print(i + " ");
		}
	}
}

