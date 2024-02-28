
public class CD extends MediaItem{
	
	private String artist;
	private String genre;
	
	public CD() {
		
		
	}
	
	public CD(Long UIN, String title, int copies,int runtime,String artist,String genre) {
		
		super(UIN,title,copies,runtime);
		this.artist=artist;
		this.genre=genre;
		
	}
	
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
		public void print(long uin) {
		
		CD c=(CD)findItem(uin);
		System.out.println("The UIN is:"+c.getUIN()+" Title: "+c.getTitle()+"No of Copies: "+c.getCopies()+" and the runtime is: "+c.getRuntime()+" and the artist is: "+c.getArtist()+" and the genre is"+c.getGenre());
		
		
	}

	
}
