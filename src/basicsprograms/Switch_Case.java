package basicsprograms;
//Assignment 32
public class Switch_Case 
{

	public static void main(String[] args) 
	{
		switch(2)// value is passed at compile time as i have written before running program
		{
		case 1: // pass run time or compile time? compile time
			System.out.println("Chrome Browser Launch");
			break;// if no break then it will launch 1,2
			
		case 2:
			System.out.println("Edge Browser Launch");
			break;
			
		case 3:
			System.out.println("Safari Browser Launch");
			break;
			
		case 4:
			System.out.println("Internet Explorer Browser Launch");
			break;
		
		default:// no matching case
			System.out.println("Your selection is wrong, kindly press 1,2,3 or 4 only");
			
		}

	}

}
