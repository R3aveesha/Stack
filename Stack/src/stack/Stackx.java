package stack;

public class Stackx {
	private int maxsize;
	private double[] stackArray;
	private int top;
	
	public Stackx(int s) {
		
		maxsize=s;
		stackArray=new double[maxsize];
		top=-1;
	}
	public void push(double j) {
		if(top==maxsize-1) {
			System.out.println("Stack is full");
		}
		else {
			stackArray[++top]=j;
		}
		
	}
	public double pop() {
		if(top==-1) {
			System.out.println("stack is full");
			return-99;
			
		}
		else {
			return stackArray[top--];
		}

	}
	public double peek() {
		if(top==-1) {
			return -99;
		}
		else {
			
			return stackArray[top];
		}
	}
	public boolean isemplty() {
		return (top==-1);
	}
	public boolean isfull() {
		return (top==maxsize-1);
	}

	
}
