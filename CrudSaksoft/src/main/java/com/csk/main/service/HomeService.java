package com.csk.main.service;

import java.util.List;

import com.csk.main.model.Student;

public interface HomeService 
{
	Student savedata(Student s);

	List<Student> getdata();

	String deletdata(int id);

	Student editdata(int id, Student s);

	Student getsingleid(int id);

}
