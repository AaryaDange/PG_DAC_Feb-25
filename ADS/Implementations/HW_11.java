class HW_11{
	Node start;
	class Node{
		Node next;
		int data;
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	
	void insertNodeFirst(int data){
			Node new_node=new Node(data);
			new_node.next=start;
			start=new_node;
	}
	void insertNodeEnd(int data){
			Node new_node=new Node(data);
			Node n=start;
			while(n != null){
				if(n.next==null){
					n.next=new_node;
					new_node.next=null;
					break;
				}
				n=n.next;
			}	
	}
	void display(){
		Node n=start;
		while(n != null){
			System.out.print(n.data+"--->");
			n=n.next;
		}
		System.out.print("null");
	}
	/*void reverseLL(){
		Node n=start;
		Node prev=null;
		while(n!=null){
			n.next=null;
			n=n.next;
		}
	}*/
	
	int lengthList(){
		Node n=start;
		int i=0;
		while(n != null){
			i++;
			n=n.next;
		}
		return i;
	}
	void middleNode(){
		int mid=lengthList()/2;
		Node n=start;
		int i=1;
		Node prev=null;
		while(n!=null){
			if(i==(mid+1)){
				//prev.next=n.next;
				System.out.println("\nNode at middle position is "+n.data);
				break;
			}	
			n=n.next;
			i++;
		}
	}
	int isCycle(){
		Node n=start;
		Node p=start;
		while(n!= null || n!=p){
			return -1;
			
		}
		return 1;
	}
		
	public static void main(String[] args){
	HW_11 h1=new HW_11();
		
	h1.insertNodeFirst(1);
	h1.insertNodeEnd(2);
	h1.insertNodeEnd(3);
	h1.insertNodeEnd(4);
	h1.insertNodeEnd(5);
	h1.insertNodeEnd(6);
	h1.insertNodeEnd(7);
	//h1.insertNodeEnd(8);
	h1.display();
	h1.middleNode();
	
	if(h1.isCycle()==-1){
		System.out.println("List is not circular..");
	}
	else{
		System.out.println("List is not circular..");
	}
	
	}
}