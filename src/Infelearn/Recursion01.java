package Infelearn;

public class Recursion01{
	public static void main(String[] args){
		int n = 4;
		func(n);
	}

	public static void func(int k){
		if(k <= 0)   //base case
			return;
		else{
			System.out.println("Hello");
			func(k-1);   //recursive case
		}
	}
}