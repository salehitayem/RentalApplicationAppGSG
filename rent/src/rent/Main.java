package rent;

public class Main {

	public static void main(String[] args) {
		
		
		
		Customer c =  new Customer("sam", 28);
		
		Owner o = new Owner("alex", 30);
		
		Shop shop = new Shop("Ramallah", "Shop1", o, 30, 40);
		
		Contract contract = new Contract(shop, c.getVisaO(), c,5,o);
		
		System.out.println(contract.getInfo());
		
		
		
		
		
		
		
	}

}
