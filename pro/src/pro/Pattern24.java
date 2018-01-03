package pro;

public class Pattern24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int N=9;
		for(int i=1;i<=N;i=i+2) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
				
			}
			System.out.println();
		}
		for(int i=N-2;i>=1;i=i-2) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
