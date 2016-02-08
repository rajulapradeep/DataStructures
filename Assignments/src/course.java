
public class course{
	private String name;
	private professor person;
	private double price;
	private int qty;
	
	
	public professor getPerson() {
		return person;
	}
	public void setPerson(professor person) {
		this.person = person;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	
	@Override
	public String toString() {
		return "'" + name + "' by " + person + "";
	}
	
	public course(String name, professor person, double price) {
		super();
		this.name = name;
		this.person = person;
		this.price = price;
	}

	public course(String name, professor person, double price, int qty) {
		super();
		this.name = name;
		this.person = person;
		this.price = price;
		this.qty = qty;
	}
	
}
