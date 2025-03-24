import java.util.Scanner;
class Volume{
	double a,b,c;
	void findVolume(double a){
		System.out.println("Volume of the cube is:"+(a*a*a));
	}
	void findVolume(double a,double b,double c){
		System.out.println("Volume of the Rectangular Box is:"+(a*b*c));
	}
	void findVolume(double a,double b){
		System.out.println("Volume of the Sphere is:"+(3.14*a*a*b));
	}
}

public class VolumeMain{
	public static void main (String args[]){
		double a,b,c;
	Scanner s = new Scanner(System.in);
	Volume obj= new Volume();
	
		System.out.println("Enter the side of cube: ");
		a = s.nextDouble();
		obj.findVolume(a);
	
	
		System.out.println("Enter the length,width,height of rectangular box: ");
		a = s.nextDouble();
		b = s.nextDouble();
		c = s.nextDouble();
		obj.findVolume(a,b,c);
	
	
		System.out.println("Enter the radius and height of cylinder: ");
		a = s.nextDouble();
		b = s.nextDouble();
		obj.findVolume(a,b);
	
	}
}