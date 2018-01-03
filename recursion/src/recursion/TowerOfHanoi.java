package recursion;

public class TowerOfHanoi {

	
	public static void towerOfHanoi(int n,char src, char dest, char aux) {
		
		if(n==1) {
			System.out.println("move disk 1 from peg "+src+" to peg "+dest);
			return;
		}
		towerOfHanoi(n-1,src,aux,dest);
		System.out.println("move disk "+n+" from peg "+src+" to peg "+dest);
		towerOfHanoi(n-1,aux,dest,src);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		towerOfHanoi(n,'A','C','B');
	}

}
