package recursion;

public class Fibonacci {

	public static int fib(int n) {
		if(n<=1) return n;
		else return fib(n-1)+fib(n-2);
	}
	public static void fibonacci(int n) {
		for(int i=0;i<=n;i++) {
			
			System.out.println(fib(i));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
	//	System.out.println(fib(n));
		fibonacci(n);
	}

}






/////////////////////////////////////
/*int fibonacci(int range,int a,int b){
sum = a+b;
if(sum>range)
    return 0;
else{
    printf("%d ",sum);
    fibonacci(range,b,sum);
}
}
*/