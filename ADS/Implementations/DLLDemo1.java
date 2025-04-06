class DLL1{
	Node head;
	static class Node{
		int data;
		Node prev;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
			prev=null;
		}
	}
	void insertFirst(int new_data){
		Node n1=new Node(new_data);
		n1.next=head;
		n1.prev=null;
		if(head !=null){
			head.prev=n1;
		}
		head=n1;
	}
	void insertBetween(Node prev,int new_data){
		if(prev== null) return;
		
		Node new_node=new Node(new_data);
		new_node.next=prev.next;
		prev.next=new_node;
		
		new_node.prev=prev;
		if (new_node.next != null) { 
			new_node.next.prev=new_node;
		}
	}
	void insertionEnd(int data){
		Node n1=new Node(data);
		Node n=head;
		if(n==null){
			n1.prev=null;
			head=n1;
			return;
		}
		while(n.next!=null){
			n=n.next;
		}
		n.next=n1;
		 n1.prev = n;
	}
	void deletion(Node del){
		if(head == null || del==null){
			return;
		}
		if(head == del){
			head = del.next;
		}
		if(del.next !=null){
			del.next.prev=del.prev;
		}
		if(del.prev !=  null){
			del.prev.next=del.next;
		}
	}
	void traverse(){
		System.out.println("\nForward traversal: ");
		Node n=head;
		Node p=null;
		while(n!=null){
			System.out.print(n.data+"-->");
			p=n;
			n=n.next;
		}
		//System.out.println("NULL");
		System.out.println("\nBackward traversal: ");
		while(p!=null){
			System.out.print(p.data+"-->");
			p=p.prev;
		}
		//System.out.println("NULL");
	}
}
class DLLDemo1{
	public static void main(String[] args){
		DLL1 d1=new DLL1();
		d1.insertFirst(10);
		d1.insertFirst(20);
		d1.insertFirst(30);
		d1.insertionEnd(50);
		d1.insertBetween(d1.head.next.next,40);
		
		d1.insertionEnd(90);
		d1.traverse();
		d1.deletion(d1.head.next.next.next);
		d1.traverse();
	}
}
	
