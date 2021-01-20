package Inflearn02;

public class PrintToBinary {

	public static void main(String[] args) {
		PrintBinary(14);
	}
	public static void PrintBinary(int n) {
		if(n < 2) {
			System.out.print(n);
		}
		else {
			PrintBinary(n/2);
			System.out.print(n%2);
		}
	}

}
//2진수로 변환해 출력
