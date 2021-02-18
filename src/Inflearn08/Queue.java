package Inflearn08;

public class Queue {

//	MAX-HEAP-INSERT(A, key){
//		heap_size = heap_size + 1;
//		A[heap_size] = key;
//		i = heap_size;
//		while(i > 1 and A[PARENT(i)] < A[i] ) {
//			exchange A[i] and A[PARENT(i)];
//			i = PARENT(i);
//		}
//	}
//	EXTRACT-MAX(A){
//		if heap_size[A] < 1
//			then error "heap underflow"
//		max <- A[1]
//		A[1] <- A[heap_size[A]]
//		heap_size[A] <- heap_size[A] -1
//		MAX-Heapify(A, 1)
//		return max
//	}
	private static void Max_Heap_Insert(int A[], int key){
		int heap_size = A.length; // 원래는 -1을 해줘야 하지만 데이터 삽입으로 1증가
		A[heap_size] = key;
		int i = heap_size;
		//부모 노드를 어떻게 표현,,,,,????
		while( i > 1 ) {
			
		}
	}
	
	private static int Extract_Max(int A[]) {
		int heap_size[A];
		//에외처리
		if(heap_size[A] < 1) {
			System.out.println("Error");
		}
		int max = A[1]; //최댓값
		A[1] = A[heap_size[A]]; //마지막 노드의 값을 루트 자리로 옮김
		heap_size[A] = heap_size[A]-1;// 노드 하나 삭제
		MaxHeapify(A, 1);
		return max;
	}
	
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
		

	}

}
