
public class JournalPaper extends WrittenItem {
	
	
	private String year;
	
	public JournalPaper(){
		
	}
	
	public JournalPaper(long UIN,String Title,int Copies,String Author, String year){
		
		super(UIN,Title,Copies,Author);
		this.year=year;
	
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	
	public void print(long uin) {
		
		JournalPaper j=(JournalPaper)findItem(uin);
		System.out.println("The UIN is:"+j.getUIN()+" Title: "+j.getTitle()+"No of Copies: "+j.getCopies()+" and the Author is: "+j.getAuthor()+" and the year of release is: "+j.getYear());
		
		
	}

}
