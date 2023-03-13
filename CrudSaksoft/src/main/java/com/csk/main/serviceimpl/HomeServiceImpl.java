package com.csk.main.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csk.main.model.Student;
import com.csk.main.repository.HomeRepository;
import com.csk.main.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService  
{
	@Autowired 
	HomeRepository hs;

	@Override
	public Student savedata(Student s) 
	{
		
		return hs.save(s) ;
	}

	@Override
	public List<Student> getdata() 
	{
		
		return hs.findAll();
	}

	@Override
	public String deletdata(int id) 
	{
		hs.deleteById(id);
		return "deletd";
	}

	@Override
	public Student editdata(int id, Student s)
	{
		s.setId(id);
		
		return hs.save(s) ;
	}

	@Override
	public Student getsingleid(int id) 
	{
		Optional<Student> op=hs.findById(id);
		Student st=op.get();
		
		return st;
	}
	

}
