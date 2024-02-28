import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Excercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input=null;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		try {
			input= br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lambda2 l=(s)->{
		s= s.replaceAll("", " ").trim();
		System.out.println(s);
		};
		
		l.addSpace(input);
	}

}

interface lambda2{
	
	public void addSpace(String s);
	
	
}
