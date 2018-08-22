package model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Projects {

	@SerializedName("name")
	@Expose
	private String name;

	@SerializedName("customer")
	@Expose
	private String customer;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Projects [name=" + name + ", customer=" + customer + "]";
	}

}
