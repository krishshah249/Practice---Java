import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class User {

	
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String choice=null;
		long uin=0L;
		while(true) {
		System.out.println("1.Add Item");
		System.out.println("2.Check In");
		System.out.println("3.Check Out");
		System.out.println("4.Print All Books");
		System.out.println("5.Exit");
		System.out.println("Enter your choice");
		choice= br.readLine();
		switch(choice) {
			
		
		case "1":	option();
					break;
		case "2":	System.out.println("Enter the UIN number");
					uin=Long.parseLong(br.readLine());
					choice(uin,"check in");
					break;
		case "3":	System.out.println("Enter the UIN number");
					uin=Long.parseLong(br.readLine());
					choice(uin,"check out");
					break;
		case "4":   Item.printAll();
					break;
		case "5":	System.exit(0);
		default: System.out.println("Enter Valid Option");
		}
	
	}

}
	public static void choice(long uin, String check ) throws IOException{
		
		String choice=null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			try {
			System.out.println("1.Book");
			System.out.println("2.Journal Paper");
			System.out.println("3.Video");
			System.out.println("4.CD");
			System.out.println("5.Exit");
			System.out.println("Enter your choice");
			choice= br.readLine();
			switch(choice) {
		 
			case "1":	if(check.equalsIgnoreCase("check in"))
						(new Book()).checkIn(uin);
						if(check.equalsIgnoreCase("check out"))
						(new Book()).checkOut(uin);
						
						break;
			case "2":	if(check.equalsIgnoreCase("check in"))
						(new JournalPaper()).checkIn(uin);
						if(check.equalsIgnoreCase("check out"))
						(new JournalPaper()).checkOut(uin);
						
						break;
			case "3":	if(check.equalsIgnoreCase("check in"))
						(new Video()).checkIn(uin);
						if(check.equalsIgnoreCase("check out"))
						(new Video()).checkOut(uin);
						
						break;
			case "4":	if(check.equalsIgnoreCase("check in"))
						(new CD()).checkIn(uin);
						if(check.equalsIgnoreCase("check out"))
						(new CD()).checkOut(uin);
					
						break;
			case "5":	return;
			default: 	System.out.println("Enter valid option");
	}
	}catch(NullPointerException e) {
		
		System.out.println("No Records found");
	}
		}
		
		}
	public static void option() throws IOException {
		
		String choice=null;
		long uin=0;
		String title=null;
		int copies=0;
		int runtime=0;
		String author=null;
		String artist=null;
		String year=null;
		String director=null;
		String genre=null;
		WrittenItem wi=null;
		MediaItem mi=null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("1.Book");
			System.out.println("2.Journal Paper");
			System.out.println("3.Video");
			System.out.println("4.CD");
			System.out.println("5.Exit");
			System.out.println("Enter your choice");
			
		choice= br.readLine();
		switch(choice) {
		
		
		case "1":	System.out.println("Enter UIN, Title, No of Copies, Author");
					uin=Long.parseLong(br.readLine());
					title = br.readLine();
					copies=Integer.parseInt(br.readLine());
					author = br.readLine();
					wi = new Book(uin,title,copies,author);
					wi.addItem(wi);
					break;
		case "2":	System.out.println("Enter UIN, Title, No of Copies, Author, Year");
					uin=Long.parseLong(br.readLine());
					title = br.readLine();
					copies=Integer.parseInt(br.readLine());
					author = br.readLine();
					year = br.readLine();
					wi = new JournalPaper(uin,title,copies,author,year);
					wi.addItem(wi);
					break;
		case "3":	System.out.println("Enter UIN, Title, No of Copies, runtime, Director, Genre, Year");
					uin=Long.parseLong(br.readLine());
					title = br.readLine();
					copies=Integer.parseInt(br.readLine());
					runtime=Integer.parseInt(br.readLine());
					director = br.readLine();
					genre = br.readLine();
					year = br.readLine();
					mi = new Video(uin,title,copies,runtime,director,genre,year);
					mi.addItem(mi);
					break;
		case "4":	System.out.println("Enter UIN, Title, No of Copies, runtime, artist, Genre");
					uin=Long.parseLong(br.readLine());
					title = br.readLine();
					copies=Integer.parseInt(br.readLine());
					runtime=Integer.parseInt(br.readLine());
					artist = br.readLine();
					genre = br.readLine();
					mi = new CD(uin,title,copies,runtime,author,genre);
					mi.addItem(mi);
					break;
		case "5":   return;
		
		default: System.out.println("Enter Valid Option");
				
		}
	
	}
		
		
	}
}