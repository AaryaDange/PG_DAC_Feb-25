
class StackDemo4{
	static class Node{
		char data;
		Node next;
		Node(char data){
			this.data=data;
			next=null;
		}
	}
	
	Node head;
	StackDemo4(){
		this.head=null;
	}
	boolean isEmpty(){
		return head==null;
	}
	void push(char new_data){
		Node new_node=new Node(new_data);
		new_node.next=head;
		head=new_node;
	}
	char pop(){
		if(isEmpty()){
			System.out.println("Stack underflow !!");
			return '\0';
		}
		char removedData = head.data;
        head = head.next;  
        System.out.println("Element removed: " + removedData);
        return removedData;
	}
	int peek(){
		if(!isEmpty()){
			return head.data;
		}
		else{
			System.out.println("Stack underflow !!");
			return -1;
		}
	}
	void reverse(StringBuffer str){
		int n=str.length();
		for(int i=0;i<n;i++){
			this.push(str.charAt(i));
		}
		for(int i=0;i<n;i++){
			char ch=this.pop();
			str.setCharAt(i,ch);
		}
	}

	public static void main(String[] args){
	
	StackDemo4 s1=new StackDemo4();
	StringBuffer s=new StringBuffer("Arya Dange");
	s1.reverse(s);
	System.out.println(s);
	//s1.pop();
	//System.out.println(s1.peek());
	
	//StackDemo4
	}
}