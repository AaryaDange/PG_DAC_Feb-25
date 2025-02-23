class Asgmt17_20{
	public static void main(String args[]){

//17. Print the First N Natural Numbers 

		int number=6;
		for(int i=1;i<=number;i++){
			System.out.println(i);
		}	

//18. Convert Celsius to Fahrenheit

		int Celsius=25;
		double Fh=(Celsius*9/5)+32;

		System.out.println("25°C is equal to "+Fh+"°F");


//19. Calculate the Power of a Number 

		int base=3;
		int expo=4;
		int result=1;
		while(expo>0){
			result=result*base;
			expo--;
		}
		System.out.println("3 raised to the power 4 is "+result);

//20. Count the Number of Digits in a Number 

		int num=123456;
		int count=0;
		while(num>0){
			count++;
			num=num/10;
		}
		System.out.println("The number 123456 has "+count+" digits.");


	}
}