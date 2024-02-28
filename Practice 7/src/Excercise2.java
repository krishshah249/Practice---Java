import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;

public class Excercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input=null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string to count number of each characters in it:");
		try {
			input = br.readLine().toLowerCase();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		char c[] = input.toCharArray();
		Map<Character,Integer> m = new HashMap<>();
		m=countCharacter(c);
		for (Map.Entry<Character, Integer> e : m.entrySet())
			System.out.println("Character:" + e.getKey() + " No of times it appeared:" + e.getValue());
		
	}

	public static Map countCharacter(char c[]) {

		Map<Character, Integer> m = new HashMap<>();
		int i = 0;
		while (i < c.length) {

			if (m.containsKey(c[i]))
				m.put(c[i], m.get(c[i]) + 1);
			else
				m.put(c[i], 1);

			i++;
		}

		return m;

	}

}
