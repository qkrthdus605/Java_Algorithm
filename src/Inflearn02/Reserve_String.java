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
			//ù ���ڸ� ������ �������� ������ ����Ʈ �ϰ�
			ReserveString(str.substring(1));
			//���������� ù ���ڸ� ����Ʈ �Ѵ�.
			System.out.print(str.charAt(0));
		}
	}
}
//���ڿ��� ������ ����ϱ�
