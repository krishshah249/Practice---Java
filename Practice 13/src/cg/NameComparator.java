package cg;

import java.util.Comparator;

import com.cg.bean.Account;

public class NameComparator implements Comparator<Account>{

	@Override
	public int compare(Account arg0, Account arg1) {
		// TODO Auto-generated method stub
		
		
		String ah1= arg0.getAccountholder();
		String ah2= arg1.getAccountholder();
		int a= ah1.compareTo(ah2);
		return a;
	}

	
	
	
	
}
