package com.lsg.movie.bean;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class RatingBean implements Serializable{
	
	private static final long serialVersionUID = 8103529607314878861L;
	
	private long movieId;
	private float rating;
	private String movieName;
	
	public RatingBean() {
		
	}
	
	public RatingBean(long movieId, float rating) {
		super();
		this.movieId = movieId;
		this.rating = rating;
	}


	public RatingBean(long movieId, float rating, String movieName) {
		super();
		this.movieId = movieId;
		this.rating = rating;
		this.movieName = movieName;
	}

	public long getMovieId() {
		return movieId;
	}
	
	public void setMovieId(long movieId) {
		this.movieId = movieId;
	}
	
	public float getRating() {
		return rating;
	}
	
	public void setRating(float rating) {
		this.rating = rating;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (movieId ^ (movieId >>> 32));
		result = prime * result + ((movieName == null) ? 0 : movieName.hashCode());
		result = prime * result + Float.floatToIntBits(rating);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RatingBean other = (RatingBean) obj;
		if (movieId != other.movieId)
			return false;
		if (movieName == null) {
			if (other.movieName != null)
				return false;
		} else if (!movieName.equals(other.movieName))
			return false;
		if (Float.floatToIntBits(rating) != Float.floatToIntBits(other.rating))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RatingBean [movieId=" + movieId + ", rating=" + rating + ", movieName=" + movieName + "]";
	}
	
}
