package com.lsg.movie.service;

import org.springframework.stereotype.Service;

import com.lsg.movie.bean.RatingBean;

@Service
public interface MovieRatingService {
	
	public RatingBean getMovieRatingByName();

	public void saveUserMovieRating(RatingBean ratingBean);
}
