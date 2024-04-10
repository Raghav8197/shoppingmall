package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="shop")
public class ShopEntity {
	private Integer id;
	private String Category;
	private String Name;
	private String Status;
	private String lease;
	private String Customer;
	public ShopEntity() {
		
	}

	public ShopEntity(Integer id, String category, String name, String status, String lease, String Customer) {
		this.id = id;
		this.Category = category;
		this.Name = name;
		this.Status = status;
		this.lease = lease;
		this.Customer = Customer;
	}
	@Id
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		this.Category = category;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		this.Status = status;
	}
	public String getLease() {
		return lease;
	}
	public void setLease(String lease) {
		this.lease = lease;
	}
	public String getCustomer() {
		return Customer;
	}

	public void setCustomer(String customer) {
		Customer = customer;
	}

	@Override
	public String toString() {
		return "ShopEntity [id=" + id + ", Category=" + Category + ", Name=" + Name + ", Status=" + Status + ", lease="
				+ lease + ", Customer=" + Customer + "]";
	}
	
}
