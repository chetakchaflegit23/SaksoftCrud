package com.csk.main.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.csk.main.model.Student;
import com.csk.main.service.HomeService;


@RestController
public class Homecontroller
{
	@Autowired  
	HomeService hs;
	
	@PostMapping("/postdata")
	public Student postdata(@RequestBody Student s)
	{
		return hs.savedata(s);
		
	}
	
	@GetMapping("/getdata")
	public List<Student>getdata()
	{
		return hs.getdata();
		
	}
	
	@GetMapping("/getsingleid/{id}")
	public Student getsingleid(@PathVariable int id)
	{
		return hs.getsingleid(id);
		
	}
	
	@DeleteMapping("/deletdata/{id}")
	public String deletdata(@PathVariable int id)
	{
		return hs.deletdata(id);
		
	}
	
	@PutMapping("/update/{id}")
	public Student updatedata(@PathVariable int id, @RequestBody Student s)
	{
		return hs.editdata(id,s);
		
	}
	
}
