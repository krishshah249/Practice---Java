package com.cg.pl;
import com.cg.bean.*;
import com.cg.exception.InsufficientBalanceException;
import com.cg.service.AccountService;
import com.cg.service.Gst;
public class MyWallet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		/*Account ob1=new SavingAccount(101,22222222,"Raja",25000.00);
		// ob1.setInterest(); 
		System.out.println(ob1);
		double b1=ob1.withdraw(24500);
		
		
		System.out.println(b1);
		SavingAccount s1=(SavingAccount)ob1;
		s1.setInterest();
		System.out.println(ob1);*/
		SavingAccount ob2=new SavingAccount(105,22262222,"Manjiri",55000.00);
		AccountService service=new AccountService();
		service.printStatement(ob2); //calling default method of Transaction 
		
		double b1=0.0;
		try {
		b1=service.withdraw(ob2, 55000.00);
		System.out.println("After Withdraw balance is: "+b1);
		}
		catch(InsufficientBalanceException e) {
			
			System.err.println(e.getMessage());
			System.err.println(e);
		}
		double tax=service.calculateTax(Gst.PCT_5, b1);
		System.out.println("Gst: "+tax);

		SavingAccount ob3=new SavingAccount(106,22262722,"Sahil",55000.00);
		System.out.println(service.transferMoney(ob2, ob3, 10000));
		
		
		//System.out.println(ob2 instanceof SavingAccount);

		//System.out.println(ob2 instanceof Account);
		//System.out.println(ob2 instanceof Object);
		//System.out.println(ob2 instanceof String);//ERROR
		
		//Account ob3=new Account();// ABSTRACT CLASS CANNOT BE INSTANTIZED
		
	}

}
