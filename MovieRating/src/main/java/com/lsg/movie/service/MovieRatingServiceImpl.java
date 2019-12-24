package com.lsg.movie.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.lsg.movie.bean.RatingBean;
import com.lsg.movie.model.RatingModel;
import com.lsg.movie.repository.RatingRepository;

@Service
public class MovieRatingServiceImpl implements MovieRatingService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private RatingRepository ratingRepo;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public RatingBean getMovieRatingByName() {
		RatingBean result = restTemplate
				.exchange("http://www.omdbapi.com/?t=batman&apikey=fb3ad22b", HttpMethod.GET, null, new ParameterizedTypeReference<RatingBean>() {
				}).getBody();
		return result;
	}
	
	@Override
	public void saveUserMovieRating(RatingBean ratingBean) {
		RatingModel ratingModel=modelMapper.map(ratingBean, RatingModel.class);
		ratingRepo.save(ratingModel);
	}

}
