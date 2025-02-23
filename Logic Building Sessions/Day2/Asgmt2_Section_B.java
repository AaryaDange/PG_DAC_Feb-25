class Asgmt2_Section_B{ 
    public static void main(String[] args) { 
   

//Question 1: Grade Classification

	int score=8;
	if(score>=90){
		System.out.println("A");
	}
	else if(score>=80 && score<90){
		System.out.println("B");
	}
	else if(score>=70 && score<80){
		System.out.println("C");
	}
	else if(score>=60 && score<70){
		System.out.println("B");
	}
	else{
		System.out.println("F");
	}
    

/* Question 2. Write a program that uses a nested switch statement to print out the day of the week based on an integer input (1 for Monday, 2 for Tuesday, etc.). Additionally, within each day, print whether it is a weekday or weekend. */

 	int day=5;
	switch(day){
		case 1:
			System.out.println("Monday....\n Weekday It Is..!");
			break;
		case 2:
			System.out.println("Tuesday....\n Weekday It Is..!");
			break;	
		case 3:
			System.out.println("Wednesday....\n Weekday It Is..!");
			break;
		case 4:
			System.out.println("Thursday....\n Weekday It Is..!");
			break;
		case 5:
			System.out.println("Friday....\n Weekday It Is..!");
			break;
		case 6:
			System.out.println("Saturday....\n Weekend It Is..!");
			break;
		case 7:
			System.out.println("Sunday....\n Weekend It Is..!");
			break;
		default:
			System.out.println("Invalid Input..!!!");
			break;
	}

/*Question 3.Write a program that acts as a simple calculator. It should accept two numbers and an operator 
(+, -, *, /) as input. Use a switch statement to perform the appropriate operation. Use nested if
else to check if division by zero is attempted and display an error message*/	


	int num1 = 2;
	int num2=5; 
	char operator='/';

        switch(operator) { 
            case '+': 
                System.out.println("Addition is: "+(num1+num2)); 
		break;
            case '-': 
                System.out.println("Subtraction is: "+(num1-num2)); 
		break;
            case '*': 
                System.out.println("Multiplication is: "+(num1*num2));
		break; 
            case '/':
		if(num2==0){
			 System.out.println("Error: Division by zero not allowed!!");
		}
		else{
                	System.out.println("Division is: "+((double)num1/num2));
		}
		break;
	    default:
		System.out.println("Invalid input...");
		break; 
        } 

/*Question 4: Discount Calculation  
Write a program to calculate the discount based on the total purchase amount.*/

	int amount=100;
	int discount=0;
	int member=1;
	if(amount>=1000){
		discount=20;
	}
	else if(amount>=500 && amount<1000){
		discount=10;
	}
	else if(amount<500){
		discount=5;
	}
	if(member==1){
		discount=discount+5;
	}
	
	System.out.println("CONGRATSS..YOU GOT "+discount+" % DISCOUNT..!!");
	
/*Question 5:Write a program that determines whether a student passes or fails based on their grades in three subjects. If the student scores more than 40 in all subjects, they pass. If the student fails in one or 
more subjects, print the number of subjects they failed in. */

	int phy=4;
	int chem=8;
	int math=80;
	int fail=0;
	
	if(phy<40){
		fail++;
	}
	if(chem<40){
		fail++;
	}
	if(math<40){
		fail++;
	}
	if(fail==0){
		System.out.println("You are Pass in all the Subjects..!!!");
	}
	if(fail==1){
		System.out.println("You are Fail in one Subject..!!!");
	}
	else if(fail==2){
		System.out.println("You are Fail in two Subjects..!!!");
	}
	else if(fail==3){
		System.out.println("You are Fail in all three Subjects..!!!");
	}

    } 
}