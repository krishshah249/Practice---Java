import java.util.HashMap;
import java.util.Map;

public abstract class Item {

	Long UIN;
	String title;
	int copies=0;
	
	static Map<Long,Item> m = new HashMap<Long,Item>();
	
	public Item(){
		
		
	}
	
	public Item(Long uIN, String title, int copies) {
		super();
		UIN = uIN;
		this.title = title;
		this.copies = copies;
	}
	public Long getUIN() {
		return UIN;
	}
	public void setUIN(Long uIN) {
		UIN = uIN;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getCopies() {
		return copies;
	}
	public void setCopies(int copies) {
		this.copies = copies;
	}
	@Override
	public String toString() {
		return "Item [UIN=" + UIN + ", title=" + title + ", copies=" + copies + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((UIN == null) ? 0 : UIN.hashCode());
		result = prime * result + copies;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (UIN == null) {
			if (other.UIN != null)
				return false;
		} else if (!UIN.equals(other.UIN))
			return false;
		if (copies != other.copies)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	public abstract void print(long uin);
	
	public static void printAll() {
		
		System.out.println(m);
		
	}
	
	public Item findItem(long uin) {
		
		return m.get(uin);
		
	}
		
	public void addItem(Item i) {
		
		m.put(i.getUIN(),i);
		
		
	}
	
	public  void checkIn(long uin) {
		Item i= findItem(uin);
		i.setCopies(i.getCopies()+1);
		m.put(uin, i);
	}

	public  void checkOut(long uin) {
		
		Item i= findItem(uin);
		i.setCopies(i.getCopies()-1);
		m.put(uin, i);
		
	}

}
