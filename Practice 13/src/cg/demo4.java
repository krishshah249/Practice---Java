package cg;
import java.util.*;
import com.cg.bean.*;
public class demo4 {

	public static void main(String[] args) {
		
		Map<Long,Account> accmap= new TreeMap<Long,Account>();
		
		Account a = new Account(100,887964890,"Krish",25000.00);
		accmap.put(a.getMobile(),a);
		
		Account b = new Account(100,887964899,"Krish",25000.00);
		accmap.put(b.getMobile(),b);
		
		Account c = new Account(100,887964892,"Krish",25000.00);
		accmap.put(c.getMobile(),c);
		
		Account d = new Account(100,887964891,"Krish",25000.00);
		accmap.put(d.getMobile(),d);
		
		System.out.println(accmap);
		System.out.println(accmap.keySet());
		
		Collection<Account> vc= accmap.values();
		
		List<Account> acclist = new ArrayList<Account>(vc);
		
		Collections.sort(acclist);
	
		for(Account o: acclist) {
			
			System.out.println(o );
			
		}
		
		System.out.println("Sort by balance");
		Comparator bc= new BalanceComparator();
		Collections.sort(acclist, bc);
		for(Account o: acclist)
			System.out.println(o);
		
		System.out.println("Sort by Name");
		Comparator nc= new NameComparator();
		Collections.sort(acclist, nc);
		for(Account o: acclist)
			System.out.println(o);
		
		
		
	
	}

}
