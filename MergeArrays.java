import java.util.Scanner;
class MergeArrays{
	public static void main (String args[]){
		int a1,b1,c1;
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter the number of elements in first array: ");
		a1=s.nextInt();
		int a[]= new int [a1];
	
		System.out.println("Enter the number of elements in second array: ");
		b1=s.nextInt();
		int b[]= new int [b1];
		
		c1=a1+b1;
		int c[]= new int [c1];
		
		System.out.println("Enter the element of first array: ");
		for(int i=0;i<a1;i++){
			a[i]= s.nextInt();
		}
		System.out.println("Enter the element of Second array: ");
		for(int i=0;i<b1;i++){
			b[i]= s.nextInt();
		}
		for(int i=0;i<a1;i=i+1){
			c[i]=a[i];
		}
		for(int i=0;i<b1;i=i+1){
			c[a1+i]=b[i];
		}
		System.out.println("First array is: ");
		for(int i=0;i<a1;i=i+1){
			System.out.println(a[i]);
		}
		System.out.println("Second array is: ");
		for(int i=0;i<b1;i=i+1){
			System.out.println(b[i]);
		}
		System.out.println("merged array is: ");
		for(int i=0;i<c1;i=i+1){
			System.out.println(c[i]);
		}
		
	}
}