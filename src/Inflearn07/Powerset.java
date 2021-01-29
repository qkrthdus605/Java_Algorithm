package Inflearn07;

public class Powerset {

	private static char data[] = {'a', 'b', 'c', 'd', 'e', 'f'};
	private static int n = data.length;
	private static boolean [] include = new boolean [n]; 
	
	public static void powerSet(int k) {
		//s�� �������� ���->p���(include�� ���� true�� ���ҵ��� ����)
		if(k == n) {
			for(int i = 0; i < n; i++) 
				if(include[i])
					System.out.print(data[i] + " ");
			System.out.println();
			return;
		}
		//s�� �������� �ƴ϶�� 
		include[k] = false; //k ���� �� ���� x
		powerSet(k + 1);
		include[k] = true;  //k ��° ���� o
		powerSet(k + 1);
	}
	
	public static void main(String[] args) {
//		p�� ������ s�� ��ü����
		powerSet(0);
	}

}
