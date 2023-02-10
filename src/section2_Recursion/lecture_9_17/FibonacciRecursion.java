package section2_Recursion.lecture_9_17;

public class FibonacciRecursion {
	public int fibonacci(int n) {
		if(n < 0) {
			return -1;
		}
		if(n == 0 || n == 1) {
			return n;
		}
		return  fibonacci(n-1) + fibonacci(n-2);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciRecursion fr = new FibonacciRecursion();
		int num = fr.fibonacci(10);
		System.out.println(num);
	}

}
