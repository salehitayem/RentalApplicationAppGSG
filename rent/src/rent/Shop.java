package rent;

public class Shop extends Buildings {

	private int price;
	private int size;
	
	public Shop(String address, String name,Owner owner , int price, int size) {
		super(address, name, owner);
		this.setPrice(price);
		this.setSize(size);
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public void setRent() {
		this.isRented = true;
		
	}

	@Override
	public boolean getRent() {
		return this.isRented;
	}

	@Override
	public void endRent() {
		this.isRented = false;		
	}
	
}
