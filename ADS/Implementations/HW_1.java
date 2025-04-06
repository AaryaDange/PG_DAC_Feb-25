class HW_1{
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
					System.out.println("\nnode added at ending");
					break;
				}
				n=n.next;
			}
			
	}
	void insertNodeMid(Node prev_node,int data){
			Node new_node=new Node(data);
			new_node.next=prev_node.next;
			prev_node.next=new_node;
	}
	void deleteNode(int dlt){
		Node n=start;
		Node prev=null;
		while(n!=null){
			if(n.data==dlt){
				prev.next=n.next;
				System.out.println(dlt+" Node deleted");
				break;
			}	
			prev=n;
			n=n.next;
		}
	}
	void deleteByPosition(int index){
		Node n=start;
		int i=1;
		Node prev=null;
		while(n!=null){
			if(i==index){
				prev.next=n.next;
				System.out.println("\nNode at position "+index+" is deleted");
				break;
			}	
			prev=n;
			n=n.next;
			i++;
		}
		System.out.println("\nNo "+index+" index is present in list");
	}
	void display(){
		Node n=start;
		while(n != null){
			System.out.print(n.data+"--->");
			n=n.next;
		}
		System.out.print("null");
	}
	void search(int key){
		Node n=start;
		while(n != null){
			if(n.data==key){
				System.out.println(key+" Node found");
				return;
			}
			n=n.next;
		}
		System.out.println(key+" Node not found");
	}
	int lengthList(){
		Node n=start;
		int i=0;
		while(n != null){
			i++;
			n=n.next;
		}
		return i;
	}
	int isEmpty(){
		Node n=start;
		if(n != null){
			return 1;
		}
		return -1;
	}
	
	
	public static void main(String[] args){
		HW_1 h=new HW_1();
		
		h.insertNodeFirst(5);
		h.insertNodeMid(h.start,20);
		h.insertNodeMid(h.start.next,30);
		h.insertNodeMid(h.start.next.next,40);
		h.insertNodeMid(h.start.next.next.next,50);
		h.insertNodeFirst(10);
		h.display();
		System.out.println();
		h.search(40);
		h.search(409);
		h.deleteNode(30);
		h.display();
		h.insertNodeEnd(70);
		//System.out.println();
		h.display();
		h.deleteByPosition(20);
		h.display();
		System.out.println("\nLength of linkedList is: "+h.lengthList());  
		if(h.isEmpty()==1){
			System.out.println("linkedList is not empty ");
		}
		else{
			System.out.println("linkedList is empty ");
		}
	}
}