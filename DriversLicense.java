
	public class DriversLicense extends IDCard {
		private int expirationYear;
		private Month expirationMonth;
		
	
	
	public DriversLicense() {
		super();
		this.expirationYear = 1969;
		expirationMonth = Month.JANUARY;
	}
	
	public DriversLicense(String name, int idNumber, int expirationYear, Month expirationMonth) {
		super(name, idNumber);
		this.expirationYear = expirationYear;
		this.expirationMonth = expirationMonth;
	}
	
	public Month getExpirationMonth() {
		return expirationMonth;
	}
	
	public int getExpirationYear() {
		return expirationYear;
	}
	
	public String toString() {
		return super.toString() + " Expiration Month & Year: " + getExpirationMonth() + " " + getExpirationYear();
	}
}