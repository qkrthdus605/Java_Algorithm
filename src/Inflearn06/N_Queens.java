package Inflearn06;

public class N_Queens {
	
	private final static int N = 8;
	private static int[] cols = new int[N+1];
	
	public static void main(String[] args) {
		queens(0);
	}
	
	public static boolean queens(int level) {
		if(promising(level) == false) { //���� ��� false = ���� 
			return false;
		}
		else if(level == N) { //��� ���� ������ = ����
			for(int i = 1; i <= N; i++) {
				System.out.println("(" + i + "," + cols[i] + ")");
			}
			return true;
		}
		for(int i = 1; i <= N; i++) {  //������ ���е� �ƴ� -> ��� �ڽ� ��� �湮 
			cols[level + 1] = i;
			if(queens(level + 1)) {
				return true;
			}
		}
		return false;
	}
	
	// �浹 ���� �˻� �Լ�
	public static boolean promising(int level) {
		for(int i = 0; i < level; i++) {
			if(cols[i] == cols[level]) {  //���� ���� �ִ��� �˻�
				return false;
			}
			else if(level - i == Math.abs(cols[level] - cols[i])) {
				// �Ǵ� ���� �밢�� �� �ִ��� �˻� ( �ݴ� ������ ����� ���밪 )
				return false;
			}
		}
		return true;
	}
}
	
	