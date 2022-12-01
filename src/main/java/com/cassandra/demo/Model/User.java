package com.cassandra.demo.Model;


import java.util.List;

import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.CassandraType.Name;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("user")
public class User {

	@PrimaryKey
	private int id;
	
	private String name;
	private String address;
	private int age;

	@CassandraType(type = Name.LIST,typeArguments = Name.TEXT)
	private List<String> department;
	
	   

	
	public User(int id, String name, String address, int age, List<String> department) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.age = age;
		this.department = department;
	}
	
	public List<String> getDepartment() {
		return department;
	}

	public void setDepartment(List<String> department) {
		this.department = department;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
