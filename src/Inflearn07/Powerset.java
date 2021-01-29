package Inflearn07;

public class Powerset {

	private static char data[] = {'a', 'b', 'c', 'd', 'e', 'f'};
	private static int n = data.length;
	private static boolean [] include = new boolean [n]; 
	
	public static void powerSet(int k) {
		//s가 공집합일 경우->p출력(include의 값이 true인 원소들의 집합)
		if(k == n) {
			for(int i = 0; i < n; i++) 
				if(include[i])
					System.out.print(data[i] + " ");
			System.out.println();
			return;
		}
		//s가 공집합이 아니라면 
		include[k] = false; //k 번쨰 를 포함 x
		powerSet(k + 1);
		include[k] = true;  //k 번째 포함 o
		powerSet(k + 1);
	}
	
	public static void main(String[] args) {
//		p는 공집합 s는 전체집합
		powerSet(0);
	}

}
