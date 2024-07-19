package rent;

public class Contract {
	private Shop shop;
	private House house;
	private Apartment apartment;
	private Visa visa;
	private MasterCard masterCard;
	private Paypal paypal;
	private Customer customer;
	private Owner owner;
	private int rentalPeriod;
	private int rentCost;
	private String info;
	
	public Contract(Shop shop, Visa visa, Customer customer, int rentalPeriod, Owner owner) {
		this.shop = shop;
		this.visa = visa;
		this.customer = customer;
		this.rentalPeriod = rentalPeriod;
		this.owner = owner;
		rentCost = this.shop.getPrice() * rentalPeriod;
		if ((!this.shop.isRented) && (this.customer.getVisa() >= rentCost)) {
			this.customer.setVisa(this.customer.getVisa() - rentCost);
			
		 	info = "Shop is rented for " + rentalPeriod +" days, for $" + rentCost + " from the Owner: " + this.owner.getName() + " to Customer: " + this.customer.getName() + "." ;
		} else {
			info = "Rent is faild";
		}
		
	};
	
	public Contract(House house, Visa visa, Customer customer, int rentalPeriod, Owner owner) {
		
		
		this.house = house;
		this.visa = visa;
		this.customer = customer;
		this.rentalPeriod = rentalPeriod;
		this.owner = owner;
		rentCost = this.house.getPrice() * rentalPeriod;
		if ((!this.house.isRented) && (this.customer.getVisa() >= rentCost)) {
			this.customer.setVisa(this.customer.getVisa() - rentCost);
			
		 	info = "Shop is rented for " + rentalPeriod +" days, for $" + rentCost + " from the Owner: " + this.owner.getName() + " to Customer: " + this.customer.getName() + "." ;
		} else {
			info = "Rent is faild";
		}
		
	};
	
	public Contract(Apartment apartment, Visa visa, Customer customer, int rentalPeriod, Owner owner) {
		this.apartment = apartment;
		this.visa = visa;
		this.customer = customer;
		this.rentalPeriod = rentalPeriod;
		this.owner = owner;
		rentCost = this.apartment.getPrice() * rentalPeriod;
		if ((!this.apartment.isRented) && (this.customer.getVisa() >= rentCost)) {
			this.customer.setVisa(this.customer.getVisa() - rentCost);
			
		 	info = "Shop is rented for " + rentalPeriod +" days, for $" + rentCost + " from the Owner: " + this.owner.getName() + " to Customer: " + this.customer.getName() + "." ;
		} else {
			info = "Rent is faild";
		}
		
	};
	
	public Contract(Shop shop, MasterCard masterCard, Customer customer, int rentalPeriod, Owner owner) {
		
		this.shop = shop;
		this.masterCard = masterCard;
		this.customer = customer;
		this.rentalPeriod = rentalPeriod;
		this.owner = owner;
		rentCost = this.shop.getPrice() * rentalPeriod;
		if ((!this.shop.isRented) && (this.customer.getVisa() >= rentCost)) {
			this.customer.setVisa(this.customer.getVisa() - rentCost);
			
		 	info = "Shop is rented for " + rentalPeriod +" days, for $" + rentCost + " from the Owner: " + this.owner.getName() + " to Customer: " + this.customer.getName() + "." ;
		} else {
			info = "Rent is faild";
		}
		
	};
	
	public Contract(House house, MasterCard masterCard, Customer customer, int rentalPeriod, Owner owner) {
		
		this.house = house;
		this.masterCard = masterCard;
		this.customer = customer;
		this.rentalPeriod = rentalPeriod;
		this.owner = owner;
		rentCost = this.house.getPrice() * rentalPeriod;
		if ((!this.house.isRented) && (this.customer.getVisa() >= rentCost)) {
			this.customer.setVisa(this.customer.getVisa() - rentCost);
			
		 	info = "Shop is rented for " + rentalPeriod +" days, for $" + rentCost + " from the Owner: " + this.owner.getName() + " to Customer: " + this.customer.getName() + "." ;
		} else {
			info = "Rent is faild";
		}
		
	};
		
	
	public Contract(Apartment apartment, MasterCard masterCard, Customer customer, int rentalPeriod, Owner owner) {
		this.apartment = apartment;
		this.masterCard = masterCard;
		this.customer = customer;
		this.rentalPeriod = rentalPeriod;
		this.owner = owner;
		rentCost = this.apartment.getPrice() * rentalPeriod;
		if ((!this.apartment.isRented) && (this.customer.getVisa() >= rentCost)) {
			this.customer.setVisa(this.customer.getVisa() - rentCost);
			
		 	info = "Shop is rented for " + rentalPeriod +" days, for $" + rentCost + " from the Owner: " + this.owner.getName() + " to Customer: " + this.customer.getName() + "." ;
		} else {
			info = "Rent is faild";
		}
		
	};
	
	
	public Contract(Shop shop, Paypal paypal, Customer customer, int rentalPeriod, Owner owner) {
		
		this.shop = shop;
		this.paypal = paypal;
		this.customer = customer;
		this.rentalPeriod = rentalPeriod;
		this.owner = owner;
		rentCost = this.shop.getPrice() * rentalPeriod;
		if ((!this.shop.isRented) && (this.customer.getVisa() >= rentCost)) {
			this.customer.setVisa(this.customer.getVisa() - rentCost);
			
		 	info = "Shop is rented for " + rentalPeriod +" days, for $" + rentCost + " from the Owner: " + this.owner.getName() + " to Customer: " + this.customer.getName() + "." ;
		} else {
			info = "Rent is faild";
		}
		
	};
	
	public Contract(House house, Paypal paypal, Customer customer, int rentalPeriod, Owner owner) {
		
		this.house = house;
		this.paypal = paypal;
		this.customer = customer;
		this.rentalPeriod = rentalPeriod;
		this.owner = owner;
		rentCost = this.house.getPrice() * rentalPeriod;
		if ((!this.house.isRented) && (this.customer.getVisa() >= rentCost)) {
			this.customer.setVisa(this.customer.getVisa() - rentCost);
			
		 	info = "Shop is rented for " + rentalPeriod +" days, for $" + rentCost + " from the Owner: " + this.owner.getName() + " to Customer: " + this.customer.getName() + "." ;
		} else {
			info = "Rent is faild";
		}
		
	};
		
	
	public Contract(Apartment apartment, Paypal paypal, Customer customer, int rentalPeriod, Owner owner) {
		
		this.apartment = apartment;
		this.paypal = paypal;
		this.customer = customer;
		this.rentalPeriod = rentalPeriod;
		this.owner = owner;
		rentCost = this.apartment.getPrice() * rentalPeriod;
		if ((!this.apartment.isRented) && (this.customer.getVisa() >= rentCost)) {
			this.customer.setVisa(this.customer.getVisa() - rentCost);
			
		 	info = "Shop is rented for " + rentalPeriod +" days, for $" + rentCost + " from the Owner: " + this.owner.getName() + " to Customer: " + this.customer.getName() + "." ;
		} else {
			info = "Rent is faild";
		}
		
	};
	
	public String getInfo() {
		return info;
	}
	
}
