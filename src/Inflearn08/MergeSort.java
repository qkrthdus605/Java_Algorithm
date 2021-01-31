package Inflearn08;

public class MergeSort {

	private static int temp[] = new int[30]; //�迭 �պ��� ���� �߰��迭
	
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
					temp[k++] = data[l++]; //���� ������ ���� ��
				} 
				else {
					temp[k++] = data[m++];
				}
			} 
			else if(l<=middle && m>right) {
				temp[k++] = data[l++]; //���ʸ� ���� 
			} 
			else {
				temp[k++] = data[m++]; //�����ʸ� ���� 
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
		// �պ� ���� ��
		System.out.println("=====���� ��=====");
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println("\n");
		// �պ� ���� ��
		System.out.println("=====���� ��=====");
		MergeSort test = new MergeSort();
		int left = 0;
		int right = data.length-1;
		test.mergeSort(left, right, data);
	}

}