package cg;

//import java.util.HashSet;
import java.util.*;

public class demo2 {

	public static void main(String[] args) {
		// generic (type safe)
		
		
		//Set<String> col=new HashSet<String>();
		//Set<String> col=new LinkedHashSet<String>();
		//Set<String> col=new TreeSet<String>();
		List<String> col=new ArrayList<String>();
		
		col.add("Ram");
		col.add("Sham");
		col.add("Abdul");
		//col.add(55);		//new Integer(55) //auto boxing
		col.add(null);
		col.add("ganesh");
		col.add("rAM");
		col.add("abdul");
		System.out.println(col);
		System.out.println("====================");
		for(String a: col)
			System.out.println(a);
		System.out.println("====================");
		
		Iterator<String> i = col.iterator();
		while(i.hasNext()) {
			
			System.out.println(i.next());
			
		}
		
		
	}

}
