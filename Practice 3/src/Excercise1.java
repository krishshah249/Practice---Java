import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Excercise1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int n;
		int i=0;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter integer numbers to find second smallest of it:");
		String input= br.readLine();
		String input1[]=input.split(" ");
		n=input1.length;
		int sort[]=new int[n];
		if(n==1)
			System.out.println("Enter Atleast 2 numbers");
		else {
		while(i<n) {
		
			sort[i]= Integer.parseInt(input1[i]);
			i++;
			
		}
		System.out.println("The second smallest integer is:"+getSecondSmallest(sort));
		}
	}

	public static int getSecondSmallest(int a[]) {
		
		int second;
		Arrays.sort(a);
		int first= a[0];
		second=a[1];
		int i=2;
		while(first==second&&i<a.length) {
		
			first=second;
			second=a[i];
			i++;
		}
		return second;

}
}