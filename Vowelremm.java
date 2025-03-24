import java.util.Scanner;
class Vowelremm{
	public static void main (String args[]){
		String str1,str2;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a string: ");
		str1= s.nextLine();
		str2= str1.replaceAll("[AEIOUaeiou]","");
		System.out.println("Vowels removed successfully...");
		System.out.println("The final Output is: "+str2);
	}
		
	}
	