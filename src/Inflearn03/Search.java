package Inflearn03;

public class Search {

	public int search(int [] data, int begin, int end, int target) {
		if(begin > end) {
			return -1;
		}
		else if(target == data[begin]) {
			return begin;
		}
		else {
			return search(data, begin+1, end, target);
		}
	}
}
//���� Ž��
