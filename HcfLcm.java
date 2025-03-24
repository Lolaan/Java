import java.util.Scanner;
class HcfLcm{
	public static void main (String args[]){
		int num1,num2,temp,temp1,temp2,LCM,HCF;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		num1=sc.nextInt();
		System.out.println("Enter the second number: ");
		num2=sc.nextInt();
		
		temp1=num1;
		temp2=num2;
		
		while (temp2!=0){
			temp=temp2;
			temp2=temp1%temp2;
			temp1=temp;
		}
		HCF=temp1;
		LCM= (num1*num2)/HCF;
		
		System.out.println("HCF is: "+HCF);
		System.out.println("LCM is: "+LCM);
	}
}
