package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Listdata;
import com.example.demo.repository.ListdataRepository;

@CrossOrigin(maxAge=3600,allowedHeaders = "*")
@RestController
@RequestMapping("/listdata")
public class ListdataController {
	@Autowired
	private ListdataRepository lr;
	
	@GetMapping("/queryAll")
	public List<Listdata> queryAll()
	{
		return lr.findAll();
	}
	
	@PostMapping("/Add")
	public Listdata add(@RequestBody Listdata listdata)
	{
		return lr.save(listdata);
	}
	
	@PostMapping("/Delete")
	public void delList(Integer uid)
	{
		lr.deleteById(uid);
	}
}
