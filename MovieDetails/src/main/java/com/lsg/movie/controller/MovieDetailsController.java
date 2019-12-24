package com.lsg.movie.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lsg.movie.service.MovieDetailsService;

@RestController
@RequestMapping("/details")
public class MovieDetailsController {

	private static final Logger logger = LoggerFactory.getLogger(MovieDetailsController.class);
	
	@Autowired
	private MovieDetailsService movieService;

	@GetMapping("/{userid}")
	public String getUserMovieDetails(@PathVariable("userid") String userId) {
		logger.info("request recieved for user id {}", userId);
		movieService.getMovieRatings();
		return "request recieved for user id " + userId;
	}

	@GetMapping
	public String home() {
		return "hello, welcome to movie details portal.!";
	}
}
