package rent;

import java.util.List;

public class Customer extends Person{

	private List<Contract> contracts;
	
	public Customer(String name, int age) {
		super(name, age);
		
	}
	public Customer(String name, int age,Contract contract) {
		super(name, age);
		this.contracts.add(contract);
	}
		
	public Visa getVisaO() {
		return super.visa;
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



	public List<Contract> getContracts() {
		return contracts;
	}


	public void setContracts(Contract contracts) {
		this.contracts.add(contracts);
	}
	

}
