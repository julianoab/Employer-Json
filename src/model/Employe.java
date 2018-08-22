package model;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Employe {

	@SerializedName("name")
	@Expose
	private String name;

	@SerializedName("role")
	@Expose
	private String role;

	@SerializedName("salary")
	@Expose
	private String salary;

	@SerializedName("projects")
	@Expose
	private List<Projects> projects;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public List<Projects> getProjects() {
		return projects;
	}

	public void setProjects(List<Projects> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Employe [name=" + name + ", role=" + role + ", salary=" + salary + ", projects=" + projects + "]";
	}

}
