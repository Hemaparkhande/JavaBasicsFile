package basicsprograms;//Assignment 47
import java.util.Scanner;
public class ScannerClass_SwitchConcept 
{
	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in);
		System.out.println("Select a browser to launch:");
        System.out.println("1. Chrome");
        System.out.println("2. Edge");
        System.out.println("3. Safari");
        System.out.println("4. Internet Explorer");
		int value = s1.nextInt();
		switch (value) 
		         {case 1: 
		 			System.out.println("Chrome Browser Launch");
		 			break;//if no break then Chrome and edge both will launch	
		 		case 2:
		 			System.out.println("Edge Browser Launch");
		 			break;		
		 		case 3:
		 			System.out.println("Safari Browser Launch");
		 			break;
		 		case 4:
		 			System.out.println("Internet Explorer Browser Launch");
		 			break;
		 		
		 		default:
		 			System.out.println("Your selection is wrong, kindly press 1,2,3 or 4 only");
		 			s1.close();
		 			}	                
	}
	}
	
