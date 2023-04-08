package in.bala.springbootcrud.sprinbootcrudapi.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_employee_dxc")
public class Employee {
	//Primary Key
	@Id
	// in the Java code to denote that you also acknowledged to use this database server side strategy
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	//Both the variable names and column names are the same so we do not need the name property
	private Integer id;
	@Column
	private String name;
	@Column
	private String gender;
	@Column
	private String department;
	@Column
	private Date dob;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", department=" + department + ", dob="
				+ dob + "]";
	}
}
