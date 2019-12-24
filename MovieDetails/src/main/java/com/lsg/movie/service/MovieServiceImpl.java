package com.lsg.movie.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MovieServiceImpl implements MovieDetailsService {

	@Autowired
	private RestTemplate restTemplate;

	private static final Logger logger = LoggerFactory.getLogger(MovieServiceImpl.class);

	@Override
	public void getMovieRatings() {
		String result = restTemplate.getForObject("http://localhost:8083/rating", String.class);
		logger.info("*** movie result from rating service [{}]", result);
	}

}
