import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Excercise4 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
	
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string to count number of each characters in it:");
		String input= br.readLine();
		char c[]= input.toCharArray();
		
		countChar(c);
		
	}
	
	
	public static void countChar(char c[]) {
		
		Map<Character,Integer> m= new TreeMap<>();
		int i=0;
		while(i<c.length) {
			
			if(m.containsKey(c[i]))
				m.put(c[i],m.get(c[i])+1 );
			else
				m.put(c[i], 1);
			
			i++;
		}
		
		for(Map.Entry<Character,Integer> e: m.entrySet())
			System.out.println("Character:"+e.getKey()+" No of times it appeared:"+e.getValue());
		
	}

}
