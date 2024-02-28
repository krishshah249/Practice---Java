package cg;

public enum Size {
	
	SMALL(100),
	MEDIUM(200),
	LARGE(300);
	
	private int ml;
	private Size(int ml) {
		
	this.ml=ml;	
		
	}
	
	public int getMl() {
		
		return ml;
		
	}
}
