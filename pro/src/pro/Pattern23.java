package pro;

public class Pattern23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				if(j==1||j==i||i==5) System.out.print("1");
				else System.out.print("0");
			}
			System.out.println();
		}
	}

}