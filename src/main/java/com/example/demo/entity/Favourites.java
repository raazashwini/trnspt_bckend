package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Favourites {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String mode;
	private String from_point_name;
	private String departure_time;
	private String to_point_name;
	private String arrival_time;
	private String distance;
	private String distance_desc;
	private String duration;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getStarting_location() {
		return from_point_name;
	}
	public void setStarting_location(String starting_location) {
		this.from_point_name = starting_location;
	}
	public String getStarting_time() {
		return departure_time;
	}
	public void setStarting_time(String starting_time) {
		this.departure_time = starting_time;
	}
	public String getEnding_location() {
		return to_point_name;
	}
	public void setEnding_location(String ending_location) {
		System.out.println(ending_location);
		this.to_point_name = ending_location;
	}
	public String getEnding_time() {
		return arrival_time;
	}
	public void setEnding_time(String ending_time) {
		this.arrival_time = ending_time;
	}
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	public String getDistance_desc() {
		return distance_desc;
	}
	public void setDistance_desc(String distance_desc) {
		this.distance_desc = distance_desc;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	
}
