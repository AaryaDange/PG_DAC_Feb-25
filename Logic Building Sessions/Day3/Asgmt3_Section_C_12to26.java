public class Asgmt3_Section_C_12to26{ 
    public static void main(String[] args) { 

/* 12. Write a program to draw the following pattern: 
***** 
***** 
***** 
***** 
*****	*/

	for(int i=0;i<5;i++){
		for(int j=0;j<5;j++){
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println("\n");
	
/* 13. Write a program to print the following pattern: 
1 
2*2 
3*3*3 
4*4*4*4 
5*5*5*5*5 
5*5*5*5*5 
4*4*4*4 
3*3*3 
2*2 
1                       */

	for(int i=1;i<=5;i++){
		for(int j=1;j<=i;j++){
			System.out.print(i);
			while(i>j){
				System.out.print("*");
				break;
			}
		}
		System.out.println();
	}
	for(int i=5;i>=1;i--){
		for(int j=1;j<=i;j++){
			System.out.print(i);
			while(i>j){
				System.out.print("*");
				break;
			}
		}
		System.out.println();
	}
	System.out.println("\n");

/* 14. Write a program to print the following pattern: 

 * 
 ** 
 *** 
 ***** 
 ******* 
 *********                                  */

	for(int i=0;i<6;i++){
		for(int j=0;i>=j;j++){
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println("\n");

/* 15. Write a program to print the following pattern: 
    *
   * *
  * * *
 * * * *
* * * * * 			*/

	for(int i=0;i<5;i++){
		for(int j=4;j>i;j--){
			System.out.print(" ");
		}
		for(int k=0;k<=i;k++){
			System.out.print("* ");
		}
		System.out.println();
	}
	System.out.println("\n");

/* 16. Write a program to print the following pattern: 
    * 
   *** 
  ***** 
 ******* 
*********                  */

	for(int i=0;i<5;i++){
		for(int j=4;j>i;j--){
			System.out.print(" ");
		}
		for(int k=0;k<=i;k++){
			System.out.print("*");
		}
		for(int l=1;l<=i;l++){
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println("\n");

/* 17. Write a program to print the following pattern: 
  * * * * *
   * * * *
    * * * 
     * *
      *                  	*/
	for(int i=0;i<5;i++){
		for(int j=0;j<i;j++){
			System.out.print(" ");
		}
		for(int k=5;k>i;k--){
			System.out.print("* ");
		}
	System.out.println();
	}
	System.out.println("\n");

/* 18. Write a program to print the following pattern: 
    *     
   *** 
  ***** 
 ******* 
  ***** 
   *** 
    *  				*/

	for(int i=0;i<4;i++){
		for(int j=3;j>i;j--){
			System.out.print(" ");
		}
		for(int k=0;k<=i*2;k++){
			System.out.print("*");
		}
	System.out.println();
	}
	for(int i=0;i<3;i++){
		for(int j=0;j<=i;j++){
			System.out.print(" ");
		}
		for(int k=6;k>(2*i)+1;k--){
			System.out.print("*");
		}
	System.out.println();
	}
	System.out.println("\n");

/* 19. Write a program to print the following pattern: 
1 
1*2 
1*2*3 
1*2*3*4 
1*2*3*4*5  		*/

	for(int i=1;i<=5;i++){
		for(int j=1;j<=i;j++){
			System.out.print(j);
			while(j<i){
				System.out.print("*");
				break;
			}
		}
	System.out.println();
	}
	System.out.println("\n");

/* 20. Write a program to print the following pattern: 
5 
5*4 
5*4*3 
5*4*3*2 
5*4*3*2*1			*/

	for(int i=5;i>0;i--){
		for(int j=5;j>=i;j--){
			System.out.print(j);
			while(j>i){
				System.out.print("*");
				break;
			}
		}
	System.out.println();
	}
	System.out.println("\n");

/* 21. Write a program to print the following pattern: 
1 
1*3 
1*3*5 
1*3*5*7 
1*3*5*7*9 			*/

	for(int i=0;i<5;i++){
		for(int j=0;j<=i;j++){
			System.out.print((2*j)+1);
			while(j<i){
				System.out.print("*");
				break;
			}
		}
	System.out.println();
	}
	System.out.println("\n");

/* 22. Write a program to print the following pattern: 
 ********* 
  ******* 
   ***** 
    *** 
     * 
    *** 
   ***** 
  ******* 
 ********* 		*/

	for(int i=0;i<5;i++){
		for(int j=0;j<i;j++){
			System.out.print(" ");
		}
		for(int j=9;j>=(2*i)+1;j--){
			System.out.print("*");
		}
		System.out.println();		
	}
	for(int i=1;i<5;i++){
		for(int j=3;j>=i;j--){
			System.out.print(" ");
		}

		for(int j=0;j<(2*i)+1;j++){
			System.out.print("*");
		}
		System.out.println();		
	}
	System.out.println("\n");

/* 23. Write a program to print the following pattern: 
11111 
22222 
33333 
44444 
55555			*/

	for(int i=1;i<=5;i++){
		for(int j=1;j<=5;j++){
			System.out.print(i);
		}
	System.out.println();
	}
	System.out.println("\n");

/* 24. Write a program to print the following pattern: 
1 
22 
333 
4444 
55555             */

	for(int i=1;i<6;i++){
		for(int j=0;j<i;j++){
			System.out.print(i);
		}
	System.out.println();
	}
	System.out.println("\n");

/* 25. Write a program to print the following pattern: 
1 
12 
123 
1234
12345		*/

	for(int i=1;i<6;i++){
		for(int j=1;j<=i;j++){
			System.out.print(j);
		}
	System.out.println();
	}
	System.out.println("\n");

/* 26. Write a program to print the following pattern: 
 
 
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 			*/
 	
	int count=0;
	for(int i=0;i<6;i++){
		for(int j=0;j<i;j++){
			count++;
			System.out.print(count+" ");
		}
	System.out.println();
	}
	System.out.println("\n");
    } 
 }