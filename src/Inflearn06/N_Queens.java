package Inflearn06;

public class N_Queens {
	
	private final static int N = 8;
	private static int[] cols = new int[N+1];
	
	public static void main(String[] args) {
		queens(0);
	}
	
	public static boolean queens(int level) {
		if(promising(level) == false) { //검증 결과 false = 실패 
			return false;
		}
		else if(level == N) { //모든 말이 놓였음 = 성공
			for(int i = 1; i <= N; i++) {
				System.out.println("(" + i + "," + cols[i] + ")");
			}
			return true;
		}
		for(int i = 1; i <= N; i++) {  //성공도 실패도 아님 -> 모든 자식 노드 방문 
			cols[level + 1] = i;
			if(queens(level + 1)) {
				return true;
			}
		}
		return false;
	}
	
	// 충돌 여부 검사 함수
	public static boolean promising(int level) {
		for(int i = 0; i < level; i++) {
			if(cols[i] == cols[level]) {  //같은 열에 있는지 검사
				return false;
			}
			else if(level - i == Math.abs(cols[level] - cols[i])) {
				// 또는 같은 대각선 상에 있는지 검사 ( 반대 방향을 고려해 절대값 )
				return false;
			}
		}
		return true;
	}
}
	
	