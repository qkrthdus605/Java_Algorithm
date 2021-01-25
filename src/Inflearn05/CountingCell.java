package Inflearn05;

public class CountingCell {

	private static int N = 8;
	private static int background_color=0;
	private static int image_color = 1;
	private static int already_counted=2;
	
	private static int [][] grid = {
			{1, 0, 0, 0, 0, 0, 0, 1},
			{0, 1, 1, 0, 0, 1, 0, 0},
			{1, 1, 0, 0, 1, 0, 1, 0},
			{0, 0, 0, 0, 0, 1, 0, 0},
			{0, 1, 0, 1, 0, 1, 0, 0},
			{0, 1, 0, 1, 0, 1, 0, 0},
			{1, 0, 0, 0, 1, 0, 0, 1},
			{0, 1, 1, 0, 0, 1, 1, 1}
	};
	
	public static int countCells(int x, int y) {
		if(x < 0 || x >= N || y < 0 || y >= N) {
			return 0;
		}
		else if(grid[x][y] != image_color) {
			return 0;
		}
		else {
			grid[x][y] = already_counted;
			return 1 + countCells(x-1, y+1) + countCells(x, y+1) 
					+ countCells(x+1, y+1) + countCells(x-1, y) 
					+ countCells(x+1, y) + countCells(x, y-1) 
					+ countCells(x-1, y-1) + countCells(x+1, y-1);
		}
	}
	
	public static void main(String[] args) {
		printGrid();
		int numCell = countCells(3, 5);
		System.out.print("\n");
		System.out.println("Count: " + numCell);
		printGrid();
		
	}

	private static void printGrid() {
		for(int x = 0; x < N; x++) {
			System.out.print("{");
			for(int y = 0; y < N; y++) {
				System.out.print(grid[x][y] + ",");
			}
			System.out.print("}\n");
		}
	}
}
