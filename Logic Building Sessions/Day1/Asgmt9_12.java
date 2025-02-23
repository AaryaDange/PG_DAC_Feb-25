class Asgmt9_12{
	public static void main(String args[]){


//9.Calculate the Area of a Circle 

		int rad=7;
		float pi=3.142f;
		float area=pi*rad*rad;
		System.out.println("Area of Circle is "+area);


//10. Check If a Number Is Even or Odd

		int no=15;
		if(no%2==0){
			System.out.println("The number is Even.");
		}
		else{
			System.out.println("The number is Odd.");
		}		


//11. Find the Largest of Three Numbers 

		int a=12;
		int b=45;
		int c=22;

		if(a>b && a>c){
			System.out.println("The largest number is "+a);
		}
		
		else if(b>a && b>c){
			System.out.println("The largest number is "+b);
		}
		else if(c>a && c>b){
			System.out.println("The largest number is "+c);
		}	



//12.Reverse a Number 

		int num=12345;
		int num2=0;
		
		while(num!=0){
			
			int rem=num%10;
			num2=num2*10+rem;
			num=num/10;
		}

		System.out.println(num2);	
	}
}