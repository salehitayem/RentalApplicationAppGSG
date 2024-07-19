package rent;

public class Owner extends Person{
	
	private House house;
	private Shop shop;
	private Apartment apartment;
	
	
	
	public Owner(String name, int age) {
		super(name, age);
		
	}
	public Owner(String name, int age, House house) {
		super(name, age);
		this.setHouse(house);
		
	}
	public Owner(String name, int age, Shop shop) {
		super(name, age);
		this.setShop(shop);
		
	}
	public Owner(String name, int age, Apartment apartment) {
		super(name, age);
		this.setApartment(apartment);
		
	}
	public House getHouse() {
		return house;
	}
	public void setHouse(House house) {
		this.house = house;
	}
	public Shop getShop() {
		return shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}
	public Apartment getApartment() {
		return apartment;
	}
	public void setApartment(Apartment apartment) {
		this.apartment = apartment;
	}
	
	@Override
	public void setVisa(float amount) {
		super.visa.setBalance(amount);
	}

	@Override
	public float getVisa() {
		return super.visa.getBalance();
	}

	@Override
	public void setMasterCard(float amount) {
		super.masterCard.setBalance(amount);
	}

	@Override
	public float getMasterCard() {
		return super.masterCard.getBalance();
	}

	@Override
	public void setPaypal(float amount) {
		super.paypal.setBalance(amount);		
	}

	@Override
	public float getPaypal() {
		return super.paypal.getBalance();
	}

	

}
