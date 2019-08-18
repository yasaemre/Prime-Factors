package Lab2a;

import java.util.*;
//********************************************************************
//Lab 21 - showFactors
//@authors     Emre Yasa
//@IDE     	   Eclipse
//@since       2019-3-4
//@OS          IOS
//**

public class showFactors { 
	public static void main(String[] args)
{
	int num;
	do {
		 
		
		    Scanner kb = new Scanner(System.in);
		    System.out.print("Enter a number, and I will display its prime factors in descending order\n" +
		    		"(enter 0 to exit program): ");
		    num=kb.nextInt();
		   //If the user enters the 0, the programs says "Goodbye" and ends.
			if (num == 0) {
				System.out.println("Goodbye!");
			} else {
				System.out.print("The factors for " + num + ": " );
				//Show factors gives the prime factors of entry from backward
				showFactors(num);
			    System.out.println();
			    System.out.println();
			}
		//if num is not equal to 0, it works constantly
	} while (num != 0);
  
	   

}

/*
 * this method helps to get single number 
 * to output the prime factors. So that
 * user can enter only the number he/she process
 */
public static int showFactors(int number)
{  
	showFactors(number, 2);
	return number;

} 

/*
 * So long as the remainder yields 0, the recursive method will
 * give prime factors. Otherwise it will not output on the console.
 * Example Table :
 * Output | Remainder | Number | Counter
 * 2           0         100        2
 * 2           0          50        2
 * -           1          25        2
 * -           1          25        3
 * -           1          25        4
 * 5           0          25        5
 * 5           0           5        5
 * -           1           1        6
 *
 *By using showFactors(number/count, count) before
 *print statement, I obtain the numbers backward
 *
 *If the remainder is 1, it keeps adding to counter
 */
public static void showFactors(int number, int count)
{  
	//Base Case,it works until recursion hit the 1
    if (number == 1)
        return;

    if((number%count)==0)
    {
    	//
    	showFactors(number/count, count);
        System.out.print(count+ " ");
        
    }
    else 
    	showFactors(number,count+1);
    }


}