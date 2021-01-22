package Inflearn04;

public class Maze {
	
	private static int N = 8;
	private static int maze[][] = {
			{0, 0, 0, 0, 0, 0, 0, 1},
			{0, 1, 1, 0, 1, 1, 0, 1},
			{0, 0, 0, 1, 0, 0, 0, 1},
			{0, 1, 0, 0, 1, 1, 0, 0},
			{0, 1, 1, 1, 0, 0, 1, 1},
			{0, 1, 0, 0, 0, 1, 0, 1},
			{0, 0, 0, 1, 0, 0, 0, 1},
			{0, 1, 1, 1, 0, 1, 0, 0}
			//�̷� ����, 1�� ���� ��
	};
	private static final int path_way = 0; //��
	private static final int wall = 1; //��
	private static final int blocked = 2; //���ôµ� ����.
	private static final int _path = 3; //���ôµ� �Է��ִµ� �������� ��


	public static boolean findMazePath(int x, int y) {
		if(x < 0 || y < 0 || x >= N || y >= N) {
			//��ǥ �ۿ� ��ġ�ϰų� ��ǥ�� �ִ��� (N,N)�� �Ѿ�� return flase;
			return false;
		}
		else if(maze[x][y] != path_way) {
			return false;
			//��ΰ� �ƴϸ� return false
		}
		else if(x == N-1 && y == N-1) {
			maze[x][y] = _path; 
			return true; 
			//��ΰ� ������ _path�� �ΰ� return true
		}
		//���⼭���� ���� �ȉ�...
		else {
			maze[x][y] = _path;
			if(findMazePath(x-1, y) || findMazePath(x, y+1) || findMazePath(x+1, y) || findMazePath(x, y-1)) {
				return true;
			}
			//���������� ������...?
			maze[x][y] = blocked;
			return false;
		}
	}
	
	public static void main(String[] args) {
		printMaze(); 
		findMazePath(0, 0);
		System.out.print("\n");
		printMaze();
	}
	
	private static void printMaze() {
		for(int x = 0; x < N; x++) {
			System.out.print("{");
			for(int y = 0; y < N; y++) {
				System.out.print(maze[x][y] + ",");
			}
			System.out.print("}\n");
		}
	}
	
}
