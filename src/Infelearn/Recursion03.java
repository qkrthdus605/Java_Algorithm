package Infelearn;

public class Recursion03 {

	public static double gcd(int m, int n){
		if(m < n){
			int temp;
			temp = m;
			m = n;
			n = temp; //swap
	  }
		if(m%n == 0)
			return n;
		else
			return gcd(n, m%n);
	}

}
//최대 공약수