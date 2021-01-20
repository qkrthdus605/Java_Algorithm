package Inflearn02;

public class String_length {

	public static void main(String[] args) {
		System.out.println(length("Hello"));
	}
	
	public static int length(String str) {
		if(str.equals("")) {
			return 0;
		}
		else {
			return 1+length(str.substring(1));
		}
	}

}

//문자열 길이 계산