package Inflearn08;

public class HeapSort {
// 수도 코드
//	MAX-HEAPIFY(A, i){
//		if there is no child of A[i]
//				return;
//		k <- index of the biggest child of i;
//		if A[i] >= A[k]
//				return;
//		exchange A[i] and A[k];
//		MAX-HEAPIFY(A, k); //recursion
//	}
	
//	BUILD-MAX-HEAP(A){
//		heap-size[A] <- length(A);
//		for i <- [length(A)/2] downto 1 
//			do MAX-HEAPIFY(A, i)
//	}
	
//	HEAPSORT(A){
//		BUILD_MAX_HEAP(A)
//		for i <- heap_size downto 2 do
//			exchange A[1] and A[i]
//			heap_size <- heap_size -1
//			MAX-HEAPIFY(A, 1)
//	}
	private static void heapSort(int[] arr) {
		int length = arr.length - 1;
		Build_max_heap(arr);
		for (int i = length; i >= 1; i--) {
			swap(arr, 0, i);
			length-=1;
			MaxHeapify(arr, 0);
		}
	}
	
	private static void Build_max_heap(int A[]) {
		int length = A.length;
		for(int i = length/2; i >= 0; i--) {
			MaxHeapify(A, i);
		}
	}
	
	private static void MaxHeapify(int A[], int i) {
		int length = A.length;
		int left_child = i * 2;
		int right_child = (i*2) + 1;
		int k = 0; //exchange에 필요한 변수
		
		if(left_child > length || right_child > length) {
			return; //자식이 없을 경우 종료
		}
		//더 큰 자식을 찾아 k에 할당
		if(A[left_child] > A[right_child]) {
			k = left_child;
		}
		else {
			k = right_child;
		}
		
		//부모가 자식보다 큰 경우 -> 완성. 종료
		if(A[i] >= A[k]) {
			return;
		}
		
		swap(A, i, k);
		MaxHeapify(A, k);
	}
	
	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void print(int A[]) {
		for(int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int A[] = {5, 2, 11, 33, 24, 40, 18, 4};
		heapSort(A);
		print(A);
	}

}
