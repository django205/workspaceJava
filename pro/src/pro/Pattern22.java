package pro;

public class Pattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			for(int i=1;i<=10;i++){
				for(int j=1;j<=20-i;j++){
					System.out.print(" ");	
				}
				
				for(int j=1;j<=i;j++){
					System.out.print("*");
				}
				
				System.out.println();				
			}

			for(int i=1;i<=10;i++){
				for(int j=10;j>=i;j--){
					System.out.print("*");
				}
				System.out.println();
			}
	}

}
