package Inflearn02;

public class Print_String {

	public static void main(String[] args) {
		printChars("Hello");
	}
	public static void printChars(String str) {
		if(str.length()==0) {
			return;  //���̰� 0�̸� ���� ����
		}
		else {
			// ���ڿ��� ù ���ڸ� ���� ���
			System.out.print(str.charAt(0));
			// ù ���ڸ� ������ �������� ��ͷ� ���
			printChars(str.substring(1));
		}
	}
}
//���ڿ� ����Ʈ
