import java.util.Scanner;
class Distance{
	public static void main (String args[]){
		int x1,x2,y1,y2;
		Scanner s= new Scanner(System.in);
		double dis;
		System.out.println("Enter the value of x1: ");
		x1= s.nextInt();
		System.out.println("Enter the value of y1: ");
		y1= s.nextInt();
		System.out.println("Enter the value of x2: ");
		x2= s.nextInt();
		System.out.println("Enter the value of y2: ");
		y2= s.nextInt();
		
		dis= Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println("The distance between " +"(" +x1+","+y1+")"+ "and" +"(" +x2+","+y2+")"+"is "+dis );
	}
}