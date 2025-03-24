import java.util.Scanner;
class BaseConv{
	public static void main (String args []){
	
		int num,index=0;
		int binary[]=new int[40];
		Scanner s= new Scanner(System.in);
		System.out.print("Enter an integer: ");
		num = s.nextInt();
		int temp1=num;
		while (temp1>0){
			binary[index]= temp1%2;
			temp1= temp1/2;
			index++;
		}
		System.out.print("Binary of the given number is: ");
		for(int i=index-1;i>=0;i--){
			System.out.print(binary[i]);
		}
		int temp2=num,rem=0;
		String octal= "";
		char octalchars[]={'0','1','2','3','4','5','6','7'};
		while (temp2>0){
			rem=temp2%8;
			octal=octalchars[rem]+octal;
			temp2=temp2/8;
			
		}
		System.out.print("\n The octal of the given integer is: "+octal);
		
		int temp3=num;
		String hx= "";
		char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		while (temp3>0){
			rem=temp3%16;
			hx=hexchars[rem]+hx;
			temp3=temp3/16;
			
		}
		System.out.print("\n The hexadecimal of the given integer is: "+hx);
	
	}
}