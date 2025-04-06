class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		next=null;
	}
	



}
class StackDemo3{
	
	Node head;
	StackDemo3(){
		this.head=null;
	}
	boolean isEmpty(){
		return head==null;
	}
	void push(int new_data){
		Node new_node=new Node(new_data);
		new_node.next=head;
		head=new_node;
	}
	void pop(){
		 if (isEmpty()) {
            System.out.println("Stack underflow !!");
            return;
        }
        System.out.println("Element removed: " + head.data);
        head = head.next;
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

	public static void main(String[] args){
	
	StackDemo3 s1=new StackDemo3();
	s1.push(10);
	s1.push(20);
	s1.push(30);
	System.out.println(s1.peek());
	s1.pop();
	System.out.println(s1.peek());
	
	
	}
}