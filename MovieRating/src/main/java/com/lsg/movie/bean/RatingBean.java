package com.lsg.movie.bean;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class RatingBean implements Serializable{
	
	private static final long serialVersionUID = 8103529607314878861L;
	
	private long id;
	private long userId;
	private String imdbID;
	private float imdbRating;
	private String title;
	
	public RatingBean() {
		
	}

	public RatingBean(long movieId, long userId,String imdbID, float imdbRating, String title) {
		super();
		this.id = movieId;
		this.imdbID = imdbID;
		this.imdbRating = imdbRating;
		this.title = title;
		this.userId=userId;
	}

	public RatingBean(long userId, String imdbID, float imdbRating) {
		super();
		this.userId = userId;
		this.imdbID = imdbID;
		this.imdbRating = imdbRating;
	}

	public String getImdbID() {
		return imdbID;
	}

	public void setImdbID(String imdbID) {
		this.imdbID = imdbID;
	}

	public float getImdbRating() {
		return imdbRating;
	}

	public void setImdbRating(float imdbRating) {
		this.imdbRating = imdbRating;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((imdbID == null) ? 0 : imdbID.hashCode());
		result = prime * result + Float.floatToIntBits(imdbRating);
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + (int) (userId ^ (userId >>> 32));
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
		if (id != other.id)
			return false;
		if (imdbID == null) {
			if (other.imdbID != null)
				return false;
		} else if (!imdbID.equals(other.imdbID))
			return false;
		if (Float.floatToIntBits(imdbRating) != Float.floatToIntBits(other.imdbRating))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RatingBean [id=" + id + ", userId=" + userId + ", imdbID=" + imdbID + ", imdbRating=" + imdbRating
				+ ", title=" + title + "]";
	}
	
}
