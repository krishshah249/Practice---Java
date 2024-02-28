
public class Video extends MediaItem{

	private String director;
	private String genre;
	private String year_released;
	
	
	public Video() {
		
	}
	
	public Video(Long UIN, String title, int copies,int runtime,String director,String genre,String year) {
		
		super(UIN,title,copies,runtime);
		this.director= director;
		this.genre= genre;
		this.year_released=year;
		
	}
	
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getYear_released() {
		return year_released;
	}
	public void setYear_released(String year_released) {
		this.year_released = year_released;
	}
	
		public void print(long uin) {
		
		Video v=(Video)findItem(uin);
		System.out.println("The UIN is:"+v.getUIN()+" Title: "+v.getTitle()+"No of Copies: "+v.getCopies()+" and the runtime is: "+v.getRuntime()+" and the director is:"+v.getDirector()+" and genre is: "+v.getGenre()+" and year of release is: "+v.getYear_released());
		
		
	}

	
}
