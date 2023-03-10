package com.example.library.entities;

import java.util.ArrayList;

public class Constants {

	public Constants() {

	}

	public static String USERNAME = "Girish";
	public static String PASSWORD = "cdac";
	public static int FINE_PER_DAY = 5;
	public static int RETURN_DURATION = 15;
	public static int BOOK_LIMIT = 4;
	public static String SESSION_ADMIN = "ADMIN";

	public static String SESSION_OK = "SOK";

	public static String SESSION_NOTOK = "SNOTOK";

	// Categories
	public static ArrayList<String> getAllDepartments() {
		ArrayList<String> department = new ArrayList<String>();
		department.add("Select");
		department.add("Computing");
		department.add("Engineering");
		department.add("Humanities");
		department.add("Languages");
		department.add("Mathematics");
		department.add("Miscellaneous");
		department.add("Recreational Activities");
		department.add("Science");
		department.add("Social Science");
		department.add("Standard Curicula");

		return department;
	}

	// Course
	public static ArrayList<String> getAllCourses() {
		ArrayList<String> courses = new ArrayList<String>();
		courses.add("Select");
		courses.add("BBA");
		courses.add("BCA");
		courses.add("BE/Btech");
		courses.add("Bsc.");
		courses.add("Diploma");
		courses.add("MBA");
		courses.add("MCA");
		courses.add("Msc.");
		courses.add("MTech");
		courses.add("PG Diploma");
		courses.add("Ph.D");
		courses.add("Others");

		return courses;
	}

	// Branches
	public static ArrayList<String> getAllBranches() {
		ArrayList<String> branches = new ArrayList<String>();
		branches.add("Select");
		branches.add("Accounting");
		branches.add("Advanced Computing");
		branches.add("Business Administration");
		branches.add("Civil Engineering");
		branches.add("Computer Application");
		branches.add("Entrepreneurship");
		branches.add("Finance");
		branches.add("Global Business");
		branches.add("Hospitality");
		branches.add("Human Resource Management");
		branches.add("International Business");
		branches.add("Information Systems");
		branches.add("Information Technology");
		branches.add("Marketing");
		branches.add("Mechanical Engineering");
		branches.add("Sports Management");
		branches.add("Tourism");

		return branches;
	}

	// Years
	public static ArrayList<String> getAllYears() {
		ArrayList<String> years = new ArrayList<String>();
		years.add("Select");
		years.add("First");
		years.add("Second");
		years.add("Third");
		years.add("Fourth");

		return years;
	}

	// Divisions
	public static ArrayList<String> getAllDivision() {
		ArrayList<String> divisions = new ArrayList<String>();
		divisions.add("Select");
		divisions.add("A");
		divisions.add("B");
		divisions.add("C");

		return divisions;
	}
	
	

	
}


