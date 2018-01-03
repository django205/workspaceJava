package recursion;

public class PrintArray {

	
	//print array using recursion
	public static void print(int a[],int N) {
		if(N==0) return;
		else {
			System.out.println(a[5-N]);
			 print(a,N-1);
		}
	}
	public static void printRev(int a[],int N) {
		if(N==0) return;
		else {
			//System.out.println(a[N-1]);
			printRev(a,N-1);
			System.out.println(a[5-N]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,5};
		int size=5;
		
		print(a,5);
		
		
		System.out.println("in reverse order");
		printRev(a,5);
	}

}
