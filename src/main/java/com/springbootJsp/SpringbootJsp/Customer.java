package com.springbootJsp.SpringbootJsp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Customer_id")
public class Customer {

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		
		@Column(name="customer_id")
		private Long customer_id;
		
		@Column(name="first_name")
		private String first_name;
		
		@Column(name="last_name")
		private String last_name;
		
		@Column(name="address")
		private String address;
		
		@Column(name="city")
		private String city;
		
		@Column(name="street")
		private String street;
		
		@Column(name="state")
		private String state;
		
		@Column(name="email")
		private String email;
		
		@Column(name="phone")
		private Long phone;

		public Long getCustomer_id() {
			return customer_id;
		}

		public void setCustomer_id(Long customer_id) {
			this.customer_id = customer_id;
		}

		public String getFirst_name() {
			return first_name;
		}

		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}

		public String getLast_name() {
			return last_name;
		}

		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getStreet() {
			return street;
		}

		public void setStreet(String street) {
			this.street = street;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Long getPhone() {
			return phone;
		}

		public void setPhone(Long phone) {
			this.phone = phone;
		}
		
		
		

		
}
