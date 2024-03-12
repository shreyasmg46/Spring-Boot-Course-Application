package com.aconsulting.springapplication.course;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Course {
	
	@Id
	@GeneratedValue
	private int id;

	@Column
	private String course_name;
	
	@Column
	private String author_name;
	
	//Default Constructor
	public Course ( ) {
		
	}
	
	public Course(int id, String course_name, String author_name) {
		super();
		this.id = id;
		this.course_name = course_name;
		this.author_name = author_name;
	}

	
	
	public int getId() {
		return id;
	}



	public String getCourse_name() {
		return course_name;
	}



	public String getAuthor_name() {
		return author_name;
	}



	@Override
	public String toString() {
		return "Course [id=" + id + ", course_name=" + course_name + ", author_name=" + author_name + "]";
	}

}
