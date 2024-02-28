
public abstract class MediaItem extends Item {

	
	private int runtime;
	
	public MediaItem() {
		
	}
	
	public MediaItem(Long UIN, String title, int copies,int runtime) {
		
		super(UIN,title,copies);
		
		this.runtime=runtime;
		
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	
	
}
