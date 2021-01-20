package Inflearn02;

public class Print_String {

	public static void main(String[] args) {
		printChars("Hello");
	}
	public static void printChars(String str) {
		if(str.length()==0) {
			return;  //길이가 0이면 리턴 없음
		}
		else {
			// 문자열의 첫 문자를 먼저 출력
			System.out.print(str.charAt(0));
			// 첫 글자를 제외한 나머지를 재귀로 출력
			printChars(str.substring(1));
		}
	}
}
//문자열 프린트
