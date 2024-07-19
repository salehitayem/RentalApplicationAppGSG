package rent;

public class Paypal {
	
	private float balance;
	
	public Paypal() {
		this.balance = 1000;
	};
	public float getBalance() {
		return this.balance;
	};
	public void setBalance(float amount) {
		balance = amount;
	};

}
