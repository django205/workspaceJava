package pro;

public class Pattern27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=3;
		int i,j;
		int count=1;
		for(i=1;i<=N;i++) {
			if(i%2==0) 	System.out.print(++count);
			for(j=1;j<=N;j++) {
					System.out.print(i);
			}
			if(i%2!=0) System.out.print(++count);
			System.out.println();
		}
	}

}
