
	public class IDCard extends Card {
		private int idNumber;
		
		public IDCard() {
			super("Jane Smith");
			this.idNumber = 0;
		}
		
		public IDCard(String name, int idNumber) {
			super(name);
			this.idNumber = idNumber;
		}
		
		public int getIDNumber() {
			return idNumber;
		}
		
		public String toString() {
			return super.toString() + " ID Number: " + getIDNumber();
		}
}
