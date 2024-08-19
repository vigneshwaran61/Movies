package com.example.Moviesj;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movies, Long>{

	List<Movies> findByTitleLike(String title);
}
