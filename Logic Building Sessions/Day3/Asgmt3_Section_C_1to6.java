
//1.Write a program to calculate sum of first 50 natural numbers.

public class Asgmt3_Section_C{ 
    public static void main(String[] args) { 
        int sum = 0; 
        for (int i = 1;i<=50; i++) { 
            sum=sum+i; 
        } 
        System.out.println(sum); 

//o/p- 1275

//3. Write a program to print all multiples of 7 between 1 and 100.
 
        int multi=1;
	for (int i = 1; multi<100; i++) { 
      	multi=7*i;

	if(multi<100){
		System.out.println(multi);
	}
        } 
//o/p- 7 14 21 28 35 42 49 56 63 70 77 84 91 98

//6. Write a program to find and print the first 5 prime numbers. 
    	
	int count=0;
	int num=2;

	while(count<5){
		if(prime(num)){
			System.out.println(num);
			count++;
		}
		num++;
	}

} 
	public static boolean prime(int num){
		if(num<=1){
			return false;	
		}
		
	        for(int i=2;i<Math.sqrt(num);i++){
		 	if(num%i==0){
				return false;
		 	}
		 }
		return true;
	}


    
 }