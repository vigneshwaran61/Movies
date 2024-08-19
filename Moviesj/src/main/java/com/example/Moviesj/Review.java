package com.example.Moviesj;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Review")
public class Review {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long id;
	public String body;
	

}
