import java.io.*;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
public class Excercise2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		 
		int n;
		int i=0;
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of strings you want to pass");
		String temp=br.readLine();
		n= Integer.parseInt(temp);
		String s[]= new String[n];
		System.out.println("Enter all the strings");
		while(i<n) {
			s[i]=br.readLine();
			i++;
		}
		sortAndUpperCase(s);
	}
	
	public static void sortAndUpperCase(String s[]) {
		
		Map<String,String> m= new TreeMap<>();
		int i=0;
		while(i<s.length) {
			
			m.put(s[i], s[i]);
			i++;
		}
		
		String sorted[] = new String[s.length];
		i=0;
		for(String s1: m.keySet()) {
			sorted[i]=s1;
			i++;
		}
		i=0;
		while(i<Math.ceil(sorted.length/2.0)) {
			
			sorted[i]=sorted[i].toUpperCase();
			i++;
		}
		
		for(String s1: sorted)
			System.out.println(s1);
	}

}
