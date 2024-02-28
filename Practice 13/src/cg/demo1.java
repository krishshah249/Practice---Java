package cg;
import java.util.*;
public class demo1 {

	public static void main(String[] args) {

		// non-generic collection
		
		Set col=new HashSet();
		col.add("Ram");
		col.add("Sham");
		col.add("Abdul");
		col.add(55);		//new Integer(55) //auto boxing
		col.add(null);
		col.add("ganesh");
		col.add("RAM");
		System.out.println(col);
		
		
	}

}
