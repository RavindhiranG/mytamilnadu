package com.mytamilnadu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.mytamilnadu.dao.MyTamilNaduDao;
import com.mytamilnadu.entity.State;

@Service
public class MyTamilNaduService {
	
	@Autowired
	MyTamilNaduDao mtd;
	
	public String post(State s) {
		return mtd.post(s);
	}
	
	public String postAll(List<State> s) {
		return mtd.postAll(s);
	}
	
	public List<State> getAll() {
		return mtd.getAll();
	}
	

}
