import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Excercise2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n;
		System.out.println("Enter the a number to print the nth value of the Fibonacci sequence");
		String number=br.readLine();
		n=Integer.parseInt(number);
		if(n<=0)
			System.out.println("Enter a positive number");
		else if(n==0)
			System.out.println("Enter a non zero positive number");
		else if(n==1)
			System.out.println("1");
		else {
		System.out.println("The nth number in fibonacci series using recursive function is:"+recursiveFibo(1,1,n-2));
		System.out.println("The nth number in fibonacci series using non-recursive function is:"+nonRecursiveFibo(n));
		}
		}
	
	public static int recursiveFibo(int a,int b,int n) {
		
		if(n==0)
			return b;
		else
			return recursiveFibo(b,a+b,n-1);
	}
	
	public static int nonRecursiveFibo(int n) {
		
		int a=1;
		int b=1;
		int c;
		int i=3;
		while(i<=n) {
			
			c=a+b;
			a=b;
			b=c;
			i++;
		}
		return b;
	}
}
