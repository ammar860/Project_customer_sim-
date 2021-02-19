package sample;

import java.util.Date;

public class Customer {
	
	private int custumer_id;
	private String custumer_name;
	private String custumer_email;
	private Date custumer_date_of_birth;
	public Customer(int custumer_id, String custumer_name, String custumer_email,
			       Date custumer_date_of_birth) {
		
		this.custumer_id = custumer_id;
		this.custumer_name = custumer_name;
		this.custumer_email = custumer_email;
		this.custumer_date_of_birth = custumer_date_of_birth;
	}
	
	
	public int getCustumer_id() {
		return custumer_id;
	}


	public void setCustumer_id(int custumer_id) {
		this.custumer_id = custumer_id;
	}


	public String getCustumer_name() {
		return custumer_name;
	}


	public void setCustumer_name(String custumer_name) {
		this.custumer_name = custumer_name;
	}


	public String getCustumer_email() {
		return custumer_email;
	}


	public void setCustumer_email(String custumer_email) {
		this.custumer_email = custumer_email;
	}



	public Date getCustumer_date_of_birth() {
		return custumer_date_of_birth;
	}


	public void setCustumer_date_of_birth(Date custumer_date_of_birth) {
		this.custumer_date_of_birth = custumer_date_of_birth;
	}


	@Override
	public String toString() {
		return "Customer [custumer_id=" + custumer_id + ", custumer_name=" + custumer_name + ", custumer_email="
				+ custumer_email  + ", custumer_date_of_birth="+ custumer_date_of_birth + "]";
	}

	
	
}
