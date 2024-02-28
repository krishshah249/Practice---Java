import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Period;

public class Excercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String date=null;
		System.out.println("Enter the date in dd/mm/yyyy ");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		try {
			date=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String s[]= date.trim().split("/");
		LocalDate userdate = LocalDate.of(Integer.parseInt(s[2]),Integer.parseInt(s[1]),Integer.parseInt(s[0]));
		LocalDate current = LocalDate.now();
		
		Period p= Period.between(userdate,current);
		if(p.isNegative())
			System.out.println("Entered date is in future and its durartion is\nDuration with days: "+(p.getYears()*365+p.getMonths()*30+p.getDays())*-1+"\nDuration with months: "+(p.getYears()*12+p.getMonths()+p.getDays()/30)*-1+"\nDuration with years: "+(p.getYears()+p.getMonths()/12+p.getDays()/365)*-1);
		else
			System.out.println("Entered date is in past and its durartion is\nDuration with days: "+(p.getYears()*365+p.getMonths()*30+p.getDays())+"\nDuration with months: "+(p.getYears()*12+p.getMonths()+p.getDays()/30)+"\nDuration with years: "+(p.getYears()+p.getMonths()/12+p.getDays()/365));
			
	}

}
