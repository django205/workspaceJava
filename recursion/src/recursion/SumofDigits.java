package recursion;

public class SumofDigits {

	static int sum;
	public static int sumofdigits(int n) {
	if(n==0) return sum;
	sum=sum+n%10;
	sumofdigits(n/10);
	return sum;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1857;
		System.out.println(sumofdigits(n));
	}

}
