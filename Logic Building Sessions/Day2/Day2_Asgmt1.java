class Day2_Asgmt1{
	public static void main(String args[]){

/* 1. Write a Java program that checks if a predefined number is positive 
using an if-else statement and prints the appropriate message.*/

	int a=5;
	if(a>0){
		System.out.println("Number is positive.");
	}
	else{
		System.out.println("Number is negative.");
	}

//2. Check Negative Number: 

	int b=-5;
	if(b<0){
		System.out.println("Number is negative.");
	}
	else{
		System.out.println("Number is positive.");
	}

//4. Display Good Morning Message Based on Time:

//assuming 24hr Format time here

	double time=6.4;
	if(time >5 && time<12){
		System.out.println("Good Morning !!!");
	}
	
//5. Print Area of a Square: 

	int side=7;
	float area=side*side;
	System.out.println("Area of Square is "+area);

//6. Print Area of a Rectangle: 

	int len=7;
	int wid=9;
	float area1=len*wid;
	System.out.println("Area of Rectangle is "+area1);




	}
}