package com.ibm.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Multiplex {
	@Id
	private int mpexId;
	@Column(length = 20)
	private String name;
	
	@ManyToMany
	@JoinTable(name = "shows",
		joinColumns = {@JoinColumn(name = "mpexId")},
		inverseJoinColumns = {@JoinColumn(name = "movId")})
	Set<Movie> movies = new HashSet<Movie>();

	// Getters and Setters
	public int getMpexId() {
		return mpexId;
	}
	public void setMpexId(int mpexId) {
		this.mpexId = mpexId;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Set<Movie> getMovies() {
		return movies;
	}
	public void setMovies(Set<Movie> movies) {
		this.movies = movies;
	}
}
