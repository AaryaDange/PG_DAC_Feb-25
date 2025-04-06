class Stack1{
	static int MAX=7;
	int top;
	int a[]=new int[MAX];
	
	Stack1(){
		top=-1;
	}
	
	boolean isEmpty(){
		return top < 0;
	}
	boolean push(int x){
		if(top > MAX){
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
class StackDemo1{
	public static void main(String[] args){
		Stack1 s1=new Stack1();
		
		System.out.println("1. Add element");
		System.out.println("2. Delete element");
		System.out.println("3. return Element at top");
		System.out.println("4. whether stack is empty or not?");
		System.out.println("5. whether stack is full or not?");
		System.out.println("6. Exit");
		
		
		
		
		if(s1.isEmpty()){
			System.out.println("Stack EMPTY !!");
		}
		else{
			System.out.println("Stack is not empty !!");
		}
		s1.push(10);
		s1.push(20);          
		
		
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		
		s1.peek();
	}
}

// 1 push 2 pop 3 peek 4 isempty() 5 isfull() 6 exit