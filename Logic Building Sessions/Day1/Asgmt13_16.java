class Asgmt13_16{
	public static void main(String args[]){

//13. Calculate the Average of Three Numbers 

		int n1=20;
		int n2=40;
		int n3=60;

		double avg=(n1+n2+n3)/3;
		System.out.println("The Average is: "+avg);


//14. Print the Fibonacci Series 

		int num1=0;
		int num2=1;
		int num3;
		System.out.println(num1);
		System.out.println(num2);
		for(int i=0;i<8;i++){
			num3=num1+num2;
			System.out.println(num3);
			num1=num2;
			num2=num3;
		}



//15. Find the Factorial of a Number

		int no=5;

		int fact=1;
		while(no>0){
			fact=fact*no;
			no--;
		}	
		System.out.println("The Factorial of 5 is: "+fact);



//16. Check Whether a Number Is Prime 

		int num=17;

		int prime=0;
		for(int i=2;i<num;i++){
			if(num%i==0){
				prime=1;
			}
		}	
		if(prime==1){
			System.out.println("The number 17 is not Prime.");
		}
		else{
			System.out.println("The number 17 is Prime.");
		}


	}
}