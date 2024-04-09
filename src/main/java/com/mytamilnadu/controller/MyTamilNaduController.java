package com.mytamilnadu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mytamilnadu.entity.State;
import com.mytamilnadu.service.MyTamilNaduService;

@RestController
public class MyTamilNaduController {
	
	@Autowired 
	MyTamilNaduService mts;
	
	@PostMapping(value = "/post") 
	public String post(@RequestBody State s) {
		return mts.post(s);
	}
	@PostMapping(value = "/postAll")
	public String postAll(@RequestBody List <State> s) {
		return mts.postAll(s);
	}
	
	@GetMapping(value = "/getAll")
	public List<State> getAll() {
		return mts.getAll();
	}

}
