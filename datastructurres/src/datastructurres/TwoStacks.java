package datastructurres;

public class TwoStacks {

	int size;
	int a[];
	int top1,top2;
	int item;
	TwoStacks(int n){
		size=n;
		top1=-1;
		top2=size;
		a=new int[size];
	}
	public void push1(int item){
		if(top1<top2-1){
			top1++;
			a[top1]=item;
		}else{
			System.out.println("overflow");
			System.exit(1);
		}
	}
	public int pop1(){
		if(top1>=0){
			int data=a[top1];
			top1--;
			return data;
		}
		else{
			System.out.println("underflow");
			System.exit(1);
		}
		return 0;
	}
	
	public void push2(int item){
		if(top1<top2-1){
			top2--;
			a[top2]=item;
		}
		else{
			System.out.println("overflow");
		}
	}
	public int pop2(){
		if(top2<size){
			int data=a[top2];
			top2++;
			return data;
		}
		else{
			System.out.println("underflow");
			System.exit(1);
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TwoStacks ts = new TwoStacks(5);
        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(11);
        ts.push2(7);
        System.out.println("Popped element from" +
                           " stack1 is " + ts.pop1());
        ts.push2(40);
        System.out.println("Popped element from" +
                         " stack2 is " + ts.pop2());
		
	}

}
