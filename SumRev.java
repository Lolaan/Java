import java.util.Scanner;
class SumRev{
	public static void main (String args[]){
		int a,n,sum=0,m=0;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		n=sc.nextInt();
		
		do{
			a=n%10;
			m=m*10+a;
			sum=sum+a;
			n=n/10;
		}
		while(n>0);
			System.out.println("Sum: "+sum);
			System.out.println("Reverse: "+m);
		
	}
}