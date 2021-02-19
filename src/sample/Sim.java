package sample;

public class Sim {
private int sim_id;
private String sim_operator;
private Customer customer;



public Sim(int sim_id, String sim_operator) {
	
	this.sim_id = sim_id;
	this.sim_operator = sim_operator;
	this.customer=null;
	
}



public int getSim_id() {
	return sim_id;
}

public Customer getCustomer() {
	return customer;
}


public void setCustomer(Customer customer) {
	this.customer = customer;
}


@Override
public String toString() {
	return "Sim [sim_id=" + sim_id + ", sim_operator=" + sim_operator + ", customer=" + customer + ", getCustomer()="
			+ getCustomer() + "]";
}


}
