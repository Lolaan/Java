import java.util.Scanner;
class Base{
	public static void main (String args[]){
		int num,index=0;
		int binary[]=new int[40];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer:");
		num= sc.nextInt();
		int temp1=num;
		while(temp1>0){
			binary[index]=temp1%2;
			temp1=temp1/2;
			index++;
			
		}
		System.out.print("Binary is:");
		for(int i=index-1;i>=0;i--){
			System.out.print(binary[i]);
		}
		int temp2=num,rem=0;
		String octal="";
		char ol[]={'0','1','2','3','4','5','6','7'};
		while(temp2>0){
			rem=temp2%8;
			octal=ol[rem]+octal;
			temp2=temp2/8;
			
		}
		System.out.println("\nOctal:"+octal);
		
		
		int temp3=num;
		String hex="";
		char hx[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		while(temp3>0){
			rem=temp3%16;
			hex=hx[rem]+hex;
			temp3=temp3/16;
			
		}
		System.out.println("Hex:"+hex);
	}
}