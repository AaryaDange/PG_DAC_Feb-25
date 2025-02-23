public class Asgmt3_Section_C_7_10{ 
    public static void main(String[] args) { 

//7.Write program to calculate sum of digits of number 9876.The output should be 30(9+8+7+6).

	int num=9876;
	int sum=0;
	int rem=0;
	while(num>0){
		rem=num%10;
		sum=rem+sum;
		num=num/10;
	}
	System.out.println(sum);

//o/p- 	30

//8. Write a program to count down from 10 to 0, printing each number. 
	
	for(int i=10;i>=0;i--){
		System.out.print(i+" ");
	}
	System.out.println();
//o/p- 10 9 8 7 6 5 4 3 2 1 0

//9. Write a program to find and print the largest digit in the number 4825. 

	int num1=4825;
	int large=0;
	int rem1=0;
	while(num1>0){
		rem1=num1%10;
		if(rem1>large){
			large=rem1;
		}
		num1=num1/10;	
	}
	System.out.println(large);

//o/p- 8

//10. Write a program to print all even numbers between 1 and 50. 
 	for(int i=1;i<=50;i++){
		if(i%2==0){
			System.out.print(i+" ");
		}
	}
	System.out.println();

//o/p-2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50

//11. Write a Java program to demonstrate the use of both pre-increment and post-decrement operators in a single expression 
	
	int i=0;
	System.out.println(++i + i--);

/* o/p: 2
++i => first increment value of i by 1 then use it.
i-- => first use existing value of i then decrement by 1. */

    }
}