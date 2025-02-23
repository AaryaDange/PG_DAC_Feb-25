class Asgmt5_8{
	public static void main(String args[]){

//5. Multiply Two Numbers 

		int a=25;
		int b=5;
		int c=a*b;
		System.out.println("Multiplication of a*b is "+c);

//6.print the sum, multiplication, subtraction, division, remainder of two numbers. 

		int num1=125;
		int num2=24;
		System.out.println("125+24 = "+(125+24));
		System.out.println("125-24 = "+(125-24));
		System.out.println("125*24 = "+(125*24));
		System.out.println("125/24 = "+(125/24));
		System.out.println("125 mod 24 = "+(125%24));

//7. Multiplication Table of 8.

		int num=8;
		for(int i=1;i<11;i++){
			System.out.println(num+"x"+i+"="+(num*i));
		}

//8. Swap Two Numbers

		int m=10;
		int n=20;
		System.out.println("Before Swapping:\n First no.:"+m+"\n Second no.:"+n);
		
		m=m+n;
		n=m-n;
		m=m-n;
		System.out.println("\nAfter Swapping:\n First no.:"+m+"\n Second no.:"+n);



	}
}
