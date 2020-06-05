package com.telusko.tusk.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
public class Feedback {

	private String name;
	@Id
	private String email;
	private String msg;
	private int regarding;
	private String code;
	private int rating;

	public Feedback()
	{}

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

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getRegarding() {
		return regarding;
	}

	public void setRegarding(int regarding) {
		this.regarding = regarding;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Feedback [name=" + name + ", email=" + email + ", msg=" + msg + ", regarding=" + regarding + ", code="
				+ code + ", rating=" + rating + "]";
	}

	
	
	
	
}
