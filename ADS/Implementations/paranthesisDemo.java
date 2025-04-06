class paranthesis{
		Node start;
	class Node{
		char data;
		Node next;
		Node(char data){
			this.data=data;
			next=null;
		}
	}
	boolean isEmpty(){
		if(start==null){
			//System.out.println("Stack is empty !!");
            return true;
		}
		return false;
	}
	void push(char ch){
		Node n1=new Node(ch);
		if(start==null){
			n1.next=start;
		}
		n1.next=start;
		start=n1;	
	}
	void pop(){
		if(isEmpty()){
			return;
		}
		if(!isEmpty()){
			start=start.next;
		}
		
	}
	char peek(){
		if(isEmpty()){
			return '\0';
		}
		return start.data;
	}
}
class paranthesisDemo{
	public static void main(String[] args){
		paranthesis p=new paranthesis();
		String s="({[})";
		char arr[]=s.toCharArray();
		for(int i=0;i<arr.length;i++){
			if(arr[i]=='{' || arr[i]=='[' ||arr[i]=='('){
				p.push(arr[i]);
			}
			else if(arr[i]=='}' || arr[i]==']' ||arr[i]==')'){
				if(arr[i]=='}' && p.peek()=='{' || 
					arr[i]==']' && p.peek()=='[' ||
					arr[i]==')' && p.peek()=='('){
					p.pop();
				}
			}
		}
		if(p.isEmpty()==false){
			System.out.println("Invalid!!");
		}
		else{
			System.out.println("valid!!");
		}

	}
}
