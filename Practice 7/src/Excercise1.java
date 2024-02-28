import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Excercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> m = new HashMap<>();
		
		m.put(1,"bcd");
		m.put(2,"zbcd");
		m.put(3,"abcd");
		
		List<String> l = getValues(m);
		
		for(String s: l) {
			System.out.println(s);
		}
				
	}
	
	public static List getValues(HashMap m) {
		
		Collection c=m.values();
		List<String> l= new ArrayList<>(c);
		Collections.sort(l);
		return l;
	}

}
