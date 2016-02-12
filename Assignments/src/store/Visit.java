package store;

import java.util.Date;

public class Visit {

	@SuppressWarnings("unused")
	private Customer customer;
	private Date date;
	private double serviceExpense;
	private double productExpense;
	private String name;

	public Visit(String name, Date date) {
		super();
		this.name = name;
		this.date = date;
	}

	public double getServiceExpense() {
		return serviceExpense;
	}

	public void setServiceExpense(double serviceExpense) {
		this.serviceExpense = serviceExpense;
	}

	public double getProductExpense() {
		return productExpense;
	}

	public void setProductExpense(double productExpense) {
		this.productExpense = productExpense;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Visit [customer=" + name + ", date=" + date + ", serviceExpense=" + serviceExpense + ", productExpense="
				+ productExpense + ", name=" + name + "]";
	}

	

}
