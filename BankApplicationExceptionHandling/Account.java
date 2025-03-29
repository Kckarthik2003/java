package com.BankApplicationExceptionHandling;
import java.util.Scanner;
public class Account {
	static Scanner s = new Scanner(System.in);
	String acHolderName;
	long acNo;
	long MobNo;
	private double balance;
	long aadhar;
	public Account(String acHolderName, long acNo, long MobNo, double balance, long aadhar) throws NegativeAmountException {
		this.acHolderName = acHolderName;
		this.acNo = acNo;
		this.MobNo = MobNo;
		this.aadhar = aadhar;
		if(balance>0)
		this.balance = balance;
		else
			throw new NegativeAmountException("Entered balance is less than zero");
		
	}
	public double getBalance() throws MobileNumberException, InterruptedException, OtpException {
		System.out.print("Enter mobile number : ");
		long mob = s.nextLong();
		if(checkMobNo(mob)==this.MobNo) {
			Thread.sleep(2000);
			int otp = (int)(1000+Math.random()*999);
			System.out.println(otp);
			System.out.print("Enter otp");
			int enterdOtp = s.nextInt();
			if(enterdOtp==otp) {
				System.out.println("otp validated successfully");
				Thread.sleep(1000);
				return balance;
			}
			else {
				throw new OtpException("Entered otp is invalid");
			}
		}
		else {
			throw new MobileNumberException("Mobile Number is not matching");
		}
	}
	public static long checkMobNo(long no) throws MobileNumberException {
		int c=0;
		long mob=no;
		while(no!=0) 
		{
		no /=10;
		c++;
		}
		if(c==10) {
			return mob;
		}
		else {
			throw new MobileNumberException("Moblie number should be 10 digits");
		}
		
	}
	public void deposit(double balance) throws NegativeAmountException {
		if(balance>0) {
			this.balance+=balance;
			System.out.println(balance+"/- is deposited successfully");
		}
		else {
			throw new NegativeAmountException("entered balance is <= zero");
		}
	}
	public void withDraw(double amount) throws InsufficientBalanceException, AmountException {
		amount =Math.abs(amount);
		if(amount>=100) {
			if(amount%100==0) {
				if(amount<balance) {
					balance=balance-amount;
					System.out.println(amount+"/- is withdrawn successfully");
				}
				else{
					throw new InsufficientBalanceException("Insufficient Balance");
				}
			}
			else {
				throw new AmountException("entered amount is not in hundreds");
			}
		}
		else {
			throw new AmountException("entered amount is lessthan hundred");
		}
	}
	public void changeMobileNo(long Mob, long aadhar) throws OtpException, AadharNumberException, MobileNumberException, InterruptedException {
		checkMobNo(Mob);
		checkAadharNo(aadhar);
		if(aadhar==this.aadhar) {
			Thread.sleep(2000);
			int otp=(int)(1000+Math.random()*999);
			System.out.println(otp+"\n enter the otp");
			int enterdOtp = s.nextInt();
			if(enterdOtp==otp) {
				this.MobNo=Mob;
				System.out.println("mobile number updated successfully");	
			}
			else {
				throw new OtpException("Invalid otp");
			}
		}
		else {
			throw new AadharNumberException("aadhar number is not matched");
		}
	}
	public static long checkAadharNo(long aadhar) throws AadharNumberException {
		int c=0;
		long aadharNo = aadhar;
		while(aadhar!=0) {
			c++;
			aadhar /= 10;
		}
		if(c==12) {
			return aadharNo;
		}
		else {
			throw new AadharNumberException("Invalid aadhar number");
		}
	}
	
	public static void main(String[] args) throws OtpException, AadharNumberException, MobileNumberException, InterruptedException, NegativeAmountException, InsufficientBalanceException, AmountException {
		Account karthik = new Account("karthik",1234,9876543210l,1000,123456789012l);
		boolean t=true;
		do {
			System.out.println("press 1 for get balance");
			System.out.println("press 2 for deposit");
			System.out.println("press 3 for withdraw");
			System.out.println("press 4 for update the mobile number");
			System.out.println("press 0 to exit");
			int choice=s.nextInt();
			switch(choice) {
				case 1:
				{
					System.out.println(karthik.getBalance());
				}
				break;
				case 2:
				{
					System.out.print("Enter the amount : ");
					double amount =s.nextDouble();
					karthik.deposit(amount);
				}
				break;
				case 3:
				{
					System.out.print("Enter the amount : ");
					double amount =s.nextDouble();
					karthik.withDraw(amount);
				}
				break;
				case 4:
				{
					System.out.print("Enter  new mobile number : ");
					long mob = s.nextLong();
					System.out.print("Enter aadhar number : ");
					long aadhar = s.nextLong();
					karthik.changeMobileNo(mob, aadhar);
				}
				break;
				case 0:
				{
					t=false;
					System.out.println("thank you");
				}
				break;
				default:
				{
					System.out.println("Invalid Input");
				}
			
			}
				
				
		}while(t);
	}
	
	
	
	
}
