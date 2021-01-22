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
			//미로 설정, 1이 막인 벽
	};
	private static final int path_way = 0; //길
	private static final int wall = 1; //벽
	private static final int blocked = 2; //가봤는데 막힘.
	private static final int _path = 3; //가봤는데 뚤려있는데 길인지는 모름


	public static boolean findMazePath(int x, int y) {
		if(x < 0 || y < 0 || x >= N || y >= N) {
			//좌표 밖에 위치하거나 좌표의 최대인 (N,N)을 넘어가면 return flase;
			return false;
		}
		else if(maze[x][y] != path_way) {
			return false;
			//통로가 아니면 return false
		}
		else if(x == N-1 && y == N-1) {
			maze[x][y] = _path; 
			return true; 
			//통로가 맞으면 _path로 두고 return true
		}
		//여기서부터 이해 안됌...
		else {
			maze[x][y] = _path;
			if(findMazePath(x-1, y) || findMazePath(x, y+1) || findMazePath(x+1, y) || findMazePath(x, y-1)) {
				return true;
			}
			//막혀있으면 끝난다...?
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
