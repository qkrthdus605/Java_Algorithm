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
//배열의 합 구하기
//재귀가 계속되면서 n이 0에 도달할 것이다.
