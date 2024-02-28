
public class Excercise4 {
	
	private int id;
	
	public void setId(int id) {
		
		this.id=id;
	}
	
	public int getId() {
		
		return id;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Excercise4 e = new Excercise4();
		method m=e::setId;
		m.abc(4);
	
	}

}


interface method{
	
	public void abc(int a);
	
}


	
	
	
	

