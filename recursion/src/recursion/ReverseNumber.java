package recursion;

public class ReverseNumber {
	static int sum;
	public static int reverse(int n) {
		
		if(n==0) return sum;
		sum=sum*10+n%10;
		reverse(n/10);
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1221;
		int revn=reverse(n);
		System.out.println(revn);
		if(n==revn) System.out.println("palindrome");
		else System.out.println("not palindrome");
	}

}
