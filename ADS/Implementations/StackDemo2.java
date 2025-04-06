import java.util.Scanner;
class Stack2{
	static int MAX=7;
	int top;
	int a[]=new int[MAX];
	
	Stack2(){
		top=-1;
	}
	
	boolean isEmpty(){
		return top < 0;
	}
	boolean isFull(){
		return top == MAX-1;
	}
	boolean push(int x){
		if(top >= MAX-1){
			System.out.println("Stack overflow !!");
			return false;
		}
		else{
			a[++top]=x;
			System.out.println(x+" Element inserted..");
			return true;
		}
	}
	int pop(){
		if(top < 0){
			System.out.println("Stack underflow !!");
			return 0;
		}
		else{
			int x=a[top--];
			System.out.println("element removed !!");
			return x;
		}
	}
	int peek(){
		if(top < 0){
			System.out.println("Stack underflow !!");
			return 0;
		}
		else{
			int x=a[top];
			System.out.println("element at peek:"+x);
			return x;
		}
	}

}
class StackDemo2{
	public static void main(String[] args){
		Stack2 s1=new Stack2();
		Scanner sc=new Scanner(System.in);
		
		while(true){
			System.out.println("1. Add element");
			System.out.println("2. Delete element");
			System.out.println("3. return Element at top");
			System.out.println("4. whether stack is empty or not?");
			System.out.println("5. whether stack is full or not?");
			System.out.println("6. Exit");
			System.out.println("\nEnter choice:");
			int choice=sc.nextInt();
			switch(choice){
				case 1:
					System.out.println("\nEnter element:");
					int num1=sc.nextInt();
					s1.push(num1);
					break;
				case 2:
					s1.pop();
					break;
				case 3:
					s1.peek();
					break;
				case 4:
					if(s1.isEmpty()){
						System.out.println("Stack EMPTY !!");
					}
					else{
						System.out.println("Stack is not empty !!");
					}
					break;
				case 5:
					if(s1.isFull()){
						System.out.println("Stack IS full!!");
					}
					else{
						System.out.println("Stack is Not full!!");
					}
					break;
				case 6:
					System.out.println("Exiting");
					return;
				default:
					System.out.println("Invalid input... Try again!!");
				
			}
			
		}		
		
}
}

// 1 push 2 pop 3 peek 4 isempty() 5 isfull() 6 exit