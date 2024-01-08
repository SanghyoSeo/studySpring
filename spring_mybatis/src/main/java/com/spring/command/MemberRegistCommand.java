package com.spring.command;

import org.springframework.web.multipart.MultipartFile;

public class MemberRegistCommand {

	private String id;
	private String pwd;
	private String name;
	private String[] phone;
	private String email;
	private MultipartFile picture;
	private String aythority;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getPhone() {
		return phone;
	}
	public void setPhone(String[] phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public MultipartFile getPicture() {
		return picture;
	}
	public void setPicture(MultipartFile picture) {
		this.picture = picture;
	}
	public String getAythority() {
		return aythority;
	}
	public void setAythority(String aythority) {
		this.aythority = aythority;
	}
	
	
}
