package rent;

public abstract class Buildings {
	private String address;
	private String name;
	private Owner owner;
	protected boolean isRented;
	public Buildings(String address,String name, Owner owner) {
		this.address = address;
		this.name = name;
		this.owner = owner;
		this.isRented = false;
	}
	
	public abstract void setRent();
	public abstract boolean getRent();
	public abstract void endRent();
	
	
}
