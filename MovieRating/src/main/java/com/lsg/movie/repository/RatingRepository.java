package com.lsg.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lsg.movie.model.RatingModel;

public interface RatingRepository extends JpaRepository<RatingModel, Long> {
	
}
