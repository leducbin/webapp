package com.boraji.tutorial.springboot.entity.mysql;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "userdetails")
public class UserDetails implements Serializable {
	private static final long serialVersionUID = -1848119459950659679L;

	@Id
	@Column
	@GeneratedValue
	private long id;

    @Column
    private String username;

	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String password;
	@Column
	private String address;
	@Column
	private String token = "";

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
	
}
