package com.example.Moviesj;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Movies")
public class Movies {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;
	public String Title;
	public String Releasedate;
	public String poster;
	public String TrailerLink;
	public List<String> Generes;
	
	@OneToMany(cascade=  CascadeType.ALL)
	private List<Review> Review;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getReleasedate() {
		return Releasedate;
	}
	public void setReleasedate(String releasedate) {
		Releasedate = releasedate;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getTrailerLink() {
		return TrailerLink;
	}
	public void setTrailerLink(String trailerLink) {
		TrailerLink = trailerLink;
	}
	public List<String> getGeneres() {
		return Generes;
	}
	public void setGeneres(List<String> generes) {
		Generes = generes;
	}
	public List<Review> getReview() {
		return Review;
	}
	public void setReview(List<Review> review) {
		Review = review;
	}
	public Movies(long id, String name, String title, String releasedate, String poster, String trailerLink,
			List<String> generes, List<com.example.Moviesj.Review> review) {
		super();
		this.id = id;
		Title = title;
		Releasedate = releasedate;
		this.poster = poster;
		TrailerLink = trailerLink;
		Generes = generes;
		Review = review;
	}
	public Movies() {
		super();
	}
	
}
