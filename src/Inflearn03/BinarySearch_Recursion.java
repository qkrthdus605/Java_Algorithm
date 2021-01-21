package Inflearn03;

public class BinarySearch_Recursion {
	public static int binarySearch(String[] items, String target, int begin, int end) {
		if(begin > end) {
			return -1;
		}
		else {
			int middle = (begin + end)/2;
			int compResult = target.compareTo(items[middle]);
			if(compResult == 0) {
				return middle;
			}
			else if(compResult < 0) {
				return binarySearch(items, target, begin, middle-1);
			}
			else {
				return binarySearch(items, target, middle+1, end);
			}
		}
	}
	//ÀÌÁø Å½»ö 
}
