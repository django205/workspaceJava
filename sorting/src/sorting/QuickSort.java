package sorting;
import java.util.*;
public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
	a[i]=sc.nextInt();
}

quicksort(a,0,n-1);

for(int i=0;i<n;i++){
	System.out.println(a[i]);
}
	}

	private static void quicksort(int[] a, int low, int high) {
		// TODO Auto-generated method stub
		if(low<high){
			int part=partition(a,low,high);
	quicksort(a,low,part-1);
	quicksort(a,part+1,high);
		}
	
	}

	private static int partition(int[] a, int low, int high) {
		// TODO Auto-generated method stub
		int pivot=a[high];
		int i=low-1;
		for(int j=low;j<=high-1;j++){
			if(a[j]<=pivot){
				i++;
				int temp=a[j];
				a[j]=a[i];
				a[i]=temp;
			}
			
		}
		int t=a[i+1];
		
		a[i+1]=a[high];
		a[high]=t;
		return i+1;
	}

}
