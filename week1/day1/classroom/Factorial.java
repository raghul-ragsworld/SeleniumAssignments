package week1.day1.assignments;

public class 	 {
	
	/*
	 * Goal: Find the Factorial of a given number
	 * 
	 * input: 5
	 * output: 5*4*3*2*1 = 120
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1) If we need an last loop ans then we need to place the print to out side of loop to get an single ans
	 * 2) Factorial concept and calc
	 * 3) 
	 * 
	 */	
	
	public static void main(String[] args) {

		// Declare your input as 5
		
		
		// Declare an integer variable fact as 1
		

		// Iterate from 1 to your input (tip: using loop concept)
		

			// Within the loop: Multiply fact with the iterator variable (Tip: Assign it to the 'fact' variable)
			

		//End of loop
		

		// Print factorial (fact)
		
		int fact=5;
		int Factorial = 1;
		for(int i=1;i<5;i++)
		{
			Factorial=fact*i;
			fact =Factorial;	
		}
		System.out.println("The factorial is: " + Factorial);
	}

}
