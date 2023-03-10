package com.example.library.entities;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class Admin {

	public Admin() {

	}

	ArrayList<String> courses;
	ArrayList<String> branches;
	ArrayList<String> years;
	ArrayList<String> divisions;
	ArrayList<String> departments;

	public ArrayList<String> getCourses() {
		return Constants.getAllCourses();
	}

	public ArrayList<String> getBranches() {

		return Constants.getAllBranches();
	}

	public ArrayList<String> getYears() {

		return Constants.getAllYears();
	}

	public ArrayList<String> getDivision() {

		return Constants.getAllDivision();
	}

	public ArrayList<String> getDepartments() {

		return Constants.getAllDepartments();
	}

	private String username;
	private String password;

	// Getter and Setter
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

}
