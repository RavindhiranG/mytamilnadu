package com.mytamilnadu.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mytamilnadu.entity.State;
import com.mytamilnadu.repository.MyTamilNaduRepository;

@Repository

public class MyTamilNaduDao {
	@Autowired
	MyTamilNaduRepository mtr;
	
	public String post(State s) {
		mtr.save(s);
		return "posted successfully";
	}
	
	public String postAll(List<State> s) {
		mtr.saveAll(s);
		return "Posted all successfully";
	}
	
	public List<State> getAll() {
		return mtr.findAll();

	}

}
