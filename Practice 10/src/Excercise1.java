import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Excercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x1=null;
		String y1=null;
		lambda1 l=(x,y)-> Math.pow(x, y);
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter two numbers x and y to find x raise to y:");
		try {
			x1= br.readLine();
			y1= br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		double x=Double.parseDouble(x1);
		double y=Double.parseDouble(y1);
		
		System.out.println(l.raiseTo(x, y));
		
	}

}

interface lambda1{
	
	
	public double raiseTo(double x, double y);
	
	
}