package com.example.demo.entities;

public class loginUser {

	private String username;
	private String password;
	    private int id;
	    // 其他属性和方法...

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public loginUser(){};
	public loginUser(String name,String pwd) {
		this.password = pwd;
		this.username = name;
	}
	@Override
	public String toString() {
		return "user [id=" + id + ", username=" + username + ", password=" + password + "]";
	}
}
