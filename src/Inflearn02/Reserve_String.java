package Inflearn02;

public class Reserve_String {

	public static void main(String[] args) {
		ReserveString("Hello");
	}
	public static void ReserveString(String str) {
		if(str.length()==0) {
			return;
		}
		else {
			//첫 글자를 제외한 나머지를 뒤집어 프린트 하고
			ReserveString(str.substring(1));
			//마지막으로 첫 글자를 프린트 한다.
			System.out.print(str.charAt(0));
		}
	}
}
//문자열을 뒤집어 출력하기
