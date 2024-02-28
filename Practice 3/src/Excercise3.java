import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Excercise3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int n;
		int i=0;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter integer numbers to reverse and sort them:");
		String input= br.readLine();
		String input1[]=input.split(" ");
		n=input1.length;
		int reversed[]=new int[n];
		StringBuilder sb=null;
		while(i<n) {
			sb= new StringBuilder(input1[i]);
			input1[i]=sb.reverse().toString();
			reversed[i]= Integer.parseInt(input1[i]);
			i++;
		}
		
		int sorted[]= getSorted(reversed);
		System.out.println("The reversed and then sorted array of integers is:\n");
		for(int w:sorted)
			System.out.println(w+"\t");
	}
	
	public static int[] getSorted(int a[]) {
		
		Arrays.sort(a);
		
		return a;
		
		
	}

}
