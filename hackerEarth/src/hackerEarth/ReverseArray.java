package hackerEarth;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,3,4,5,6,7};
		reverseArray(a);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}

	private static void reverseArray(int[] a) {
		// TODO Auto-generated method stub
		int temp;
		int end=a.length-1;

		for(int i=0;i<a.length/2;i++){
			temp=a[i];
			a[i]=a[end];
			a[end]=temp;
			end--;
		}
	
		
	}
		}


