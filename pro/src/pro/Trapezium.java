package pro;

public class Trapezium {

	public static void main(String[] args) {
		
			//Scanner sc= new Scanner(System.in);
			int rows=4;
			System.out.println("Enter the no of rows");
			//rows=sc.nextInt();
			int number=0;
			int number1=0;
			int temp=rows;
			while(temp>0)
			{
				number1+=temp;
				temp--;
			}
			number1=number1*2;
			for(int i=1;i<=rows;i++){
				for(int j=i;j>1;j--)
					System.out.print(" ");
				for( int k=rows;k>=i;k--){
					System.out.print(++number);
					if(k!=0)
						System.out.print("*");
				}

				int get=number1-(rows-i);
				for(int l=i;l<=rows;l++){
					System.out.print(get++);
					if(l!=rows)
						{
							System.out.print("*");
						}
					if(l==rows)
						{
							number1=number1-(rows-i);
							number1--;
						}
				}
			System.out.println();
			}
	}
}