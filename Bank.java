import java.util.Scanner;
class MinBalExp extends Exception{
	public MinBalExp (String message){
		super (message);
	}
	
}
class Account{
	private double balance;
	private final double minBalance;
	public Account(double initialBalance, double minBalance){
		this.balance= initialBalance;
		this.minBalance = minBalance;
		
	}
	public void Deposit(double amount){
		balance+=amount;
		System.out.println("Deposited"+amount);
	}
	public void WithDraw(double amount)throws MinBalExp{
		if(balance<amount){
			throw new MinBalExp("Balance exceed limit");
		}
		else if(balance-amount<minBalance){
		throw new MinBalExp("less than min balance");}
		else
			balance-=amount;
			System.out.println("Withdrawal amount:"+amount);
			
		
		
	}
	public double getBalance(){
		return balance;
	}
}

public class Bank{
	public static void main (String args[]){
		double a;
		Scanner sc= new Scanner(System.in);
		System.out.println("Deposit amount");
		double initialBalance = sc.nextDouble();
		System.out.println("Fix min amount");
		double minBalance= sc.nextDouble();
		Account acc= new Account(initialBalance,minBalance);
		System.out.println("withdrawal amount:");
		a= sc.nextDouble();
		try {
			acc.WithDraw(a);
			
		}
		catch(MinBalExp e){
			System.out.println("exception:"+e.getMessage());
		}
		System.out.println("Current balance"+acc.getBalance());
	}
} 