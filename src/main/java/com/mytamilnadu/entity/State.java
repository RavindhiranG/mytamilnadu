package com.mytamilnadu.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tamilnadu")
public class State {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String district;
	private String topTouristPlace;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getTopTouristPlace() {
		return topTouristPlace;
	}
	public void setTopTouristPlace(String topTouristPlace) {
		this.topTouristPlace = topTouristPlace;
	}
	
	
	
	

}
