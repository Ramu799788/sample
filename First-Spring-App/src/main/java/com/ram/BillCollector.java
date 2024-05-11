package com.ram;

public class BillCollector {
private	Ipayment payment;

	
public void setvalue(Ipayment payment) {
	this.payment=payment;
}
public BillCollector() {
	
}

public BillCollector(Ipayment payment) {
	this.payment=payment;
}


public void amount(double amount ) {
	
	String pay = payment.pay(amount);
	System.out.println(pay);

}
}
