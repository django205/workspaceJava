package hackerEarth;
import java.util.*;
public class DivisibleSumPairs {
	  static int divisibleSumPairs(int n, int k, int[] ar) {
	        // Complete this function
	        int c=0;
	        for(int i=0;i<ar.length;i++){
	            int sum=0;
	            for(int j=i+1;j<ar.length;j++){
	                sum=ar[i]+ar[j];
	                if(sum%k==0) c++;
	            }
	        }
	        return c;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int k = in.nextInt();
	        int[] ar = new int[n];
	        for(int ar_i = 0; ar_i < n; ar_i++){
	            ar[ar_i] = in.nextInt();
	        }
	        int result = divisibleSumPairs(n, k, ar);
	        System.out.println(result);
	}

}
