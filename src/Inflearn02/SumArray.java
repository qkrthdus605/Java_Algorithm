package Inflearn02;

public class SumArray {

	public static void main(String[] args) {

	}
	public static int sum(int n, int [] data) {
		
		if(n <= 0) {
			return 0;
		}
		else {
			return sum(n-1, data) + data[n-1];
		}
	}
}
//�迭�� �� ���ϱ�
//��Ͱ� ��ӵǸ鼭 n�� 0�� ������ ���̴�.
