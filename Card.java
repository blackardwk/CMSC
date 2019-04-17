
public class Card {
	private String name;
	
	public Card() {
		this.name = "";	
	}
	
	public Card(String name) {
		this.name = name;	
	}
	
	public void setName() {
		this.name = "";
	}
	
	public String getName (String name) {
		this.name = name;
		return name;
	}
	
	public String toString() {
		return "Card Holder: " + name;
	}
}
