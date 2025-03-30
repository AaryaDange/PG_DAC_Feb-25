import java.util.Scanner;

class ContactList{
	Node start;
	
	static class Node{
		Node next;
		String name;
		String phone_num;
		
		Node(String name,String phone_num){
			this.name=name;
			this.phone_num=phone_num;
			next=null;
		}
	}
	void addFirst(String name,String phone_num){
		Node n1=new Node(name,phone_num);
		n1.next=start;
		start=n1;
		System.out.println("Contact added: "+n1.name+" , "+n1.phone_num);
		return;
	}
	void addEnd(String name,String phone_num){
		Node n1=new Node(name,phone_num);
		
		if(start==null){
			n1.next=start;
			start=n1;
			System.out.println("Contact added: "+n1.name+" , "+n1.phone_num);
			return;
		}
		Node n=start;
		while(n != null){
			if(n.next==null){
			n.next=n1;
			n1.next=null;
			System.out.println("Contact added: "+n1.name+" , "+n1.phone_num);
			break;
			}
			else{
				n=n.next;
			}
		}
	}
	void display(){
		Node n=start;
		if(n==null){
			System.out.println("List is empty");
		}
		if(n!=null){System.out.println("Contact List: "); }
		
		while(n != null){
			System.out.println(n.name+" , "+n.phone_num); 
			n=n.next;
		}
		
	
	}
	boolean searchContact(String name){
		Node n=start;
		while(n != null){
			if(n.name.equals(name)){
				System.out.println("Contact Details Found !!! "); 
				System.out.println(n.name+" , "+n.phone_num); 
				return true;
			} 
			n=n.next;
		}
		return false;
	}
	boolean removeContact(String name) {
    if (start == null) {
        System.out.println("List is empty.");
        return false;
    }

    if (start.name.equals(name)) {
        start = start.next; 
        System.out.println("Contact removed.");
        return true;
    }

    Node prev = start;
    Node n = start.next;

    while (n != null) {
        if (n.name.equals(name)) {
            prev.next = n.next; // Remove the node
            System.out.println("Contact removed.");
            return true;
        }
        prev = n;
        n = n.next;
    }

    System.out.println("No such Contact Details present!");
    return false;
}
	
	public static void main(String[] args){
		
		ContactList cl=new ContactList();
		Scanner sc=new Scanner(System.in);
		
		while(true){
		System.out.println("\nChoose an option :");
		System.out.println("1.Add contact at beginning");
		System.out.println("2.Add contact at ending");
		System.out.println("3.Remove contact");
		System.out.println("4.Search contact.");
		System.out.println("5.Display all contacts");
		System.out.println("6.Exit !!");
		
		System.out.println("\nEnter your choice: ");
		int choice=sc.nextInt();
		sc.nextLine();
		
		
			switch(choice){
			case 1:
				System.out.println("Enter name: "); 
				String name1=sc.nextLine();
				System.out.println("Enter Phone number: ");
				String phone_num1=sc.nextLine();
				cl.addFirst(name1,phone_num1);
				break;
			case 2:
				System.out.println("Enter name: "); 
				String name2=sc.nextLine();
				System.out.println("Enter Phone number: ");
				String phone_num2=sc.nextLine();
				cl.addEnd(name2,phone_num2);
				break;
			case 3:
				System.out.println("Enter name: "); 
				String name3=sc.nextLine();
				if(cl.removeContact(name3)==false){
					System.out.println("No such Contact Details present!!!"); 
				}
				break;
			case 4:
				System.out.println("Enter name: "); 
				String name4=sc.nextLine();
				if(cl.searchContact(name4)==false){
					System.out.println("No such Contact Details Found!!!"); 
				}
				break;
			case 5:
				cl.display();
				break;
			case 6:
				return;
			default:
				System.out.println("Invalid input.. Try again..!!!");
			}
		}
		
		
	}
}