import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Excercise3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Long n;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter an integer number");
		String number=br.readLine();
		n=Long.parseLong(number);
		if(n<=1)
			System.out.println("Enter a positive greater than or equal to 2 number");
		else {
			System.out.println("All the prime numbers upto "+n+" are:");
			prime(n);
		}
		
		
	}
	
	public static void prime(Long n) {
		
		long i=2;
		while(i<=n) {
				int j=2;
			while(j<=i) {
				
					if(i%j==0)
					break;
					j++;
			}
				
			if(j==i) 
				System.out.println(j);
			
			i++;	
		}
		
	}

}
