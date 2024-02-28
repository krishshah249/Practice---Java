import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Excercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input=null;
		String s[]=null;
		int i=0;
		Map<Integer,Integer> m = new HashMap<>();
		System.out.println("Entry numbers to find their squares");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			input=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s=input.trim().split(" ");
		int a[]= new int[s.length];
		while(i<s.length)
		{
			a[i]=Integer.parseInt(s[i]);
			i++;
		}
		
		m= getSquares(a);
		
		for(Map.Entry e:m.entrySet())
			System.out.println("Key is: "+e.getKey()+" Its Square is: "+e.getValue());
		
	}
	
	public static Map getSquares(int a[]) {
		
		Map<Integer,Integer> m = new HashMap<>();
		int i=0;
		for(i=0;i<a.length;i++)
			m.put(a[i],a[i]*a[i]);
		return m;
	}

}
