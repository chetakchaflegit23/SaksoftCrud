package com.csk.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student
{
	@Id
   private	int id;
   private String first_name;
   private String list_name;
   private String email;
   private int age;
	

}
