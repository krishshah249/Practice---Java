
public class Book extends WrittenItem {

	public Book() {
		
		
	}
	
	public Book(long UIN,String Title,int Copies,String Author) {
		
		super(UIN,Title,Copies,Author);
		
		
	}
	
	
		public void print(long uin) {
		
		Book b=(Book)findItem(uin);
		System.out.println("The UIN is:"+b.getUIN()+" Title: "+b.getTitle()+"No of Copies: "+b.getCopies()+" and the Author is: "+b.getAuthor());
		
		
	}

	



}
