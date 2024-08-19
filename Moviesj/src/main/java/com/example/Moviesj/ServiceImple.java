package com.example.Moviesj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class ServiceImple implements MovieService{
	@Autowired
	public MovieRepository repo;

	@Override
	public Movies addMovie(Movies obj) {
		return repo.save(obj);
		
	}
	
	@Override
	public List<Movies> getAllMovie() {
		
		return repo.findAll();
	}

}
