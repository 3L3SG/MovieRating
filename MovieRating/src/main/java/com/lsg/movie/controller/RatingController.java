package com.lsg.movie.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lsg.movie.bean.RatingBean;
import com.lsg.movie.service.MovieRatingService;

@RestController
@RequestMapping("/rating")
public class RatingController {
	private static final Logger logger = LoggerFactory.getLogger(RatingController.class);
	
	@Autowired
	private MovieRatingService ratingService;

	@GetMapping("/{userid}")
	public RatingBean getMovieRatingByUserId(@PathVariable("userid") String userId) {
		logger.info("**recieved request for id={}", userId);
		return ratingService.getMovieRatingByName();
	}
	
	@GetMapping
	public String itsHome() {
		return "welcome to movie ratings app.!";
	}
}
