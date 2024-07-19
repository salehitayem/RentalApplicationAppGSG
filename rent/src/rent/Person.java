package rent;

public abstract class Person {
	private String name;
	private int age;
	protected Visa visa;
	protected Paypal paypal;
	protected MasterCard masterCard;
	
	public Person(String name, int age) {
		this.setName(name);
		this.setAge(age);
		this.paypal = new Paypal();
		this.visa = new Visa();
		this.masterCard = new MasterCard();
	};
	
	public abstract void setVisa(float amount);
	public abstract float getVisa();
	
	
	public abstract void setMasterCard(float amount);
	public abstract float getMasterCard();
	
	
	public abstract void setPaypal(float amount);
	public abstract float getPaypal();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
