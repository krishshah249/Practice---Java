package cg;
import java.util.*;
import java.io.*;
import com.cg.service.*;
import com.cg.bean.*;
public class demo5 {

	public static void main(String[] args) throws IOException {
		
		Map<Long,Account> accmap= new TreeMap<Long,Account>();
		

	

		String choice="";
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		while(true) {
		System.out.println("Menu");
		System.out.println("====");
		System.out.println("1. Create new Account");
		System.out.println("2. Print all Accounts");
		System.out.println("3. Exit");
		System.out.println("Enter your choice");
		choice= br.readLine();
		
		switch(choice) {
		
		case "1":	int id=0;
					long mb=0L;
					String ab="";
					double bal=0.0;
					System.out.println("Enter Account No");
					while(true) {
						String s_id = br.readLine();
						boolean ch1= Validator.validatedata(s_id, Validator.aidpattern);
						if(ch1==true)
						{
							try {
								
								id= Integer.parseInt(s_id);
								break;
							}
							catch(NumberFormatException e)
							{
								System.out.println("Account Number must be numeric...Re enter");
							}
						}
						else {
							System.out.println("ReEnter Account No in 3 digits");
						}
					} // end of account while
					
					// mobile no
					
					System.out.println("Enter Mobile No");
					while(true) {
						String s_mb = br.readLine();
						boolean ch1= Validator.validatedata(s_mb, Validator.mobilepattern);
						if(ch1==true)
						{
							try {
								
								mb= Long.parseLong(s_mb);
								break;
							}
							catch(NumberFormatException e)
							{
								System.out.println("mobile Number must be numeric...Re enter");
							}
						}
						else {
							System.out.println("ReEnter mobile No in 3 digits");
						}
					}	// end of while for mobile number
					
					
					//accepting and validating accountholder
					System.out.println("Enter the name:");
					while(true) {
					
						String s_name=br.readLine();
						boolean ch1= Validator.validatedata(s_name, Validator.namepattern);
						if(ch1==true)
						{
							ab= s_name;
							break;
						}
						else {
							System.out.println("ReEnter Name");
						}
					}
					
					//accepting and validating balance
					System.out.println("Enter Balance");
					String s_bal= br.readLine();
					bal = Double.parseDouble(s_bal);
					
					
					Account ob= new Account(id,mb,ab,bal);
					accmap.put(ob.getMobile(),ob);
					
					
					break;
		
		case "2": 	Collection<Account> vc= accmap.values();
		
					List<Account> acclist = new ArrayList<Account>(vc);
		
					Collections.sort(acclist);

					for(Account o: acclist) {
		
						System.out.println(o );
					}
					break;
		case "3":	System.out.println("Exiting Program...");
					System.exit(0);
					break;
		default: 	System.out.println("Invalid Choice");
		
		}
		
		}	//end of menu
		
	
	

//		System.out.println("Sort by balance");
//		Comparator bc= new BalanceComparator();
//		Collections.sort(acclist, bc);
//		for(Account o: acclist)
//			System.out.println(o);
//		
//		System.out.println("Sort by Name");
//		Comparator nc= new NameComparator();
//		Collections.sort(acclist, nc);
//		for(Account o: acclist)
//			System.out.println(o);
//		
		
		
	
	}

}
