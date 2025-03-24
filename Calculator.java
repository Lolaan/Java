
class Calculator{
	public static void main (String args[]){
		int a,b,add,sub,quo,prod,rem;
		a= Integer.parseInt(args[0]);
		b= Integer.parseInt(args[1]);
		
		add=a+b;
		sub=a-b;
		quo= a/b;
		prod=a*b;
		rem=a%b;
		
		System.out.println("Addition= "+ add);
		System.out.println("Substraction= "+ sub);
		System.out.println("Quotient= "+ quo);
		System.out.println("Product= "+ prod);
		System.out.println("Reminder= "+ rem);
	}
}