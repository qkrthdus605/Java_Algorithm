package Infelearn;

public class Recursion04 {

	public int fibonacci(int n){
		if(n < 2)
			return n;
		else
			return fibonacci(n-1) + fibonacci(n-2);
	}
}
//피보나치