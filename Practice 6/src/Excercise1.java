import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Excercise1 {
	
	
		public static void main(String args[]) throws IOException {
		// TODO Auto-generated method stub
		int sum=0;
		int a;
		System.out.println("Enter a line of integer");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String input= br.readLine();
		//input=input.replaceAll(""," ").trim();
		input= input.trim();
		StringTokenizer st= new StringTokenizer(input," ");
		
		while(st.hasMoreTokens()) {
			
			a= Integer.parseInt(st.nextToken());
			System.out.print(a+" ");
			sum+=a;
		}
		
		System.out.println("The sum of all the integers is"+sum);
	}

}
