import java.util.Scanner;
class Greatest{
	public static void main (String args[]){
		int i,j,temp,n=10;
		Scanner s= new Scanner(System.in);
		int arr[]= new int[10];
		System.out.println("Enter 10 elements: ");
		for(i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		for(i=0;i<n;i++){
			for(j=i+1;j<10;j++){
				if(arr[i]>arr[j]){
					temp= arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("The Smallest number is: "+arr[0]);
		System.out.println("The greatest number is: "+arr[n-1]);
		System.out.println("The second largest number is: "+arr[n-2]);
	}
}