package store;

import java.util.Date;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c = new Customer("Pradeep");
		c.setMember(true);
		c.setMemberType("Gold");
		System.out.println(c);
		Date d = new Date();
		Visit v = new Visit("Pradeep", d);
		v.setProductExpense(200);
		v.setServiceExpense(200);
		System.out.println(v);
		double totalExpense = 0;
		System.out.println(DiscountRate.getProductDiscountGold());
		if (c.isMember()) {
			if (c.getMemberType() == "Gold")
				totalExpense = v.getProductExpense() - (v.getProductExpense() * DiscountRate.getProductDiscountGold())
						+ v.getServiceExpense() - (v.getServiceExpense() * DiscountRate.getServiceDiscountGold());
			else if (c.getMemberType() == "Premimum")
				totalExpense = v.getProductExpense()
						- (v.getProductExpense() * DiscountRate.getProductDiscountPremium()) + v.getServiceExpense()
						- (v.getServiceExpense() * DiscountRate.getServiceDiscountPremium());
			else if (c.getMemberType() == "Silver")
				totalExpense = v.getProductExpense() - (v.getProductExpense() * DiscountRate.getProductDiscountSilver())
						+ v.getServiceExpense() - (v.getServiceExpense() * DiscountRate.getServiceDiscountSilver());
			else
				totalExpense = v.getProductExpense() + v.getServiceExpense();

		}

		System.out.println("Total Expense is " + totalExpense);

	}

}
