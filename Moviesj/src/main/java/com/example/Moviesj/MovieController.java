package com.example.Moviesj;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/movies")

public class MovieController {

		@Autowired
		public MovieService service;
		
		@PostMapping("/addmovie")
		public Movies addMovie(@RequestBody  Movies obj) {
			return service.addMovie(obj);
		}
		@GetMapping("/getallmovie")
		public List<Movies> getAllMovie() {
			return service.getAllMovie();
		}

}
