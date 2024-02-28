import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.cg.eis.EmployeeException;

public class Excercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter Employee salary:");
			Double sal = Double.parseDouble(br.readLine());
			if(sal < 3000.00) 
				throw new EmployeeException("Salary must be greater than 3000");
			System.out.println("Your salary is : "+sal);
		}catch (IOException e) {
			System.out.println("Invalid Input");
		}catch(EmployeeException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
