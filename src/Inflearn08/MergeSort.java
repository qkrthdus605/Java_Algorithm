package Inflearn08;

public class MergeSort {

	private static int temp[] = new int[30]; //배열 합병을 위한 추가배열
	
	void mergeSort(int left, int right, int data[]) {
		int middle;
		if(left < right) {
			middle = (left + right)/2;
			mergeSort(left, middle, data);
			mergeSort(middle+1, right, data);
			merge(left, middle, right, data);
		}
	}
	
	void merge(int left, int middle, int right, int[] data) {
		int l = left;
		int m = middle+1;
		int k = left;
		
		while(l<=middle || m<=right) {
			if(l<=middle && m<=right) {
				if(data[l] <= data[m]) {
					temp[k++] = data[l++]; //왼쪽 오른쪽 같이 비교
				} 
				else {
					temp[k++] = data[m++];
				}
			} 
			else if(l<=middle && m>right) {
				temp[k++] = data[l++]; //왼쪽만 남음 
			} 
			else {
				temp[k++] = data[m++]; //오른쪽만 남음 
			}
		}
		
		for(int i=left; i<=right; i++) {
			data[i] = temp[i];
		}
		
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		int [] data = {4, 2, 45, 23, 13, 12, 50, 34};
		// 합병 정렬 전
		System.out.println("=====정렬 전=====");
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println("\n");
		// 합병 정렬 후
		System.out.println("=====정렬 후=====");
		MergeSort test = new MergeSort();
		int left = 0;
		int right = data.length-1;
		test.mergeSort(left, right, data);
	}

}