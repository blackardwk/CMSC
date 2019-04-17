
	public class DebitCard extends Card {
		private int cardNumber;
		private int pin;

	public DebitCard() {
		super("Jane Doe");
		this.cardNumber = 00000000;
		this.pin = 0;
		}
	
	public DebitCard(String name, int cardNumber, int pin) {
		super(name);
		this.cardNumber = cardNumber;
		this.pin = pin;
		}

	public int getCardNumber() {
		return cardNumber;	
	}
	
	public int getPin() {
		return pin;
	}
	
	public String toString() {
		return super.toString() + " Card Number: " + getCardNumber();
	}
}
