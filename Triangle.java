import java.util.Scanner;
class Triangle{
	public static void main(String args[]){
		int a,b,c;
		double s,val,area;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter three sides: ");
		a= sc.nextInt();
		b= sc.nextInt();
		c= sc.nextInt();
		if(a<b+c&&b<a+c&&c<a+b){
			if(a==b&&b==c&&a==c)
				System.out.println("This is an equilateral triangle");
			else if(a==b || b==c|| a==c)
				System.out.println("This is an isosclese triangle");
			else
				System.out.println("This is a scalene triangle");
			
			s=(a+b+c)/2;
			val= s* (s-a)*(s-b)*(s-c);
			area= Math.sqrt(val);
			System.out.println("Area of the triangle is: "+area);
			
		}
		else {
			System.out.println("Cannot form a triangle");
		}
	}
}