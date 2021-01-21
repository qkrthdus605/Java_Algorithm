package Inflearn03;

public class findMax {
	public int Max(int [] data, int begin, int end) {
		if(begin == end) {
			return data[begin];
		}
		else {
			return Math.max(data[begin], Max(data, begin+1, end));
		}
	}
}

//최대값 찾기