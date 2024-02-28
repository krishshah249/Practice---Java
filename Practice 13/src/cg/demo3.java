package cg;
import java.util.*;
public class demo3 {

	public static void main(String[] args) {
	
		Map<String,Double> m= new HashMap<String,Double>();
		
		m.put("Ram", 5000.00);
		m.put("Sham",7000.00);
		m.put("Abdul", 9000.00);
		m.put("Ganesh", 4000.00);
		m.put(null, 5000.00);
		
		System.out.println(m);
		
		Set<String> key = m.keySet();
		System.out.println(key);
		
		for(String s:key) {
			
			double b= m.get(s);
			System.out.println(s+" has balance of"+b);
		}
		
		System.out.println("--------------------------------------");
		
		double b= m.get("Sham");
		System.out.println("Before"+b);
		b=b-3000.00;
		m.put("Sham", b);
		b= m.get("Sham");
		System.out.println("After"+b);
		System.out.println("--------------------------------------");
		
		
		Collection<Double> c=m.values();
		
		List<Double> l= new ArrayList<Double>(c);
		
		Collections.sort(l);
		
		for(double d: l) {
			
			System.out.println(d);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
	
}
