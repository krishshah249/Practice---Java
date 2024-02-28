
public abstract class WrittenItem extends Item{

	
	private String author;
	
	public WrittenItem() {
		
		
	}
	
	public WrittenItem(Long UIN, String title, int copies,String author) {
		super(UIN, title, copies);
		this.author= author;
		// TODO Auto-generated constructor stub
	}
	
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	
}
