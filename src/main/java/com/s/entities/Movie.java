package com.s.entities;

import java.util.Date;
import java.util.Set;

public class Movie {
	private int movieID;
	private String movieName;
	private Date releaseDate;
	private Genre genre;
	private Set<Review> reviews;
	
	public Movie(int movieID, String movieName, Date releaseDate, Genre genre, Set<Review> reviews) {
		super();
		this.movieID = movieID;
		this.movieName = movieName;
		this.releaseDate = releaseDate;
		this.genre = genre;
		this.reviews = reviews;
	}
	public Movie(int movieID, String movieName, Date releaseDate, Genre genre) {
		super();
		this.movieID = movieID;
		this.movieName = movieName;
		this.releaseDate = releaseDate;
		this.genre = genre;
	}
	public Movie() {
		super();
	}
	public int getMovieID() {
		return movieID;
	}
	public void setMovieID(int movieID) {
		this.movieID = movieID;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	public Set<Review> getReviews() {
		return reviews;
	}
	public void setReviews(Set<Review> reviews) {
		this.reviews = reviews;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + movieID;
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
		Movie other = (Movie) obj;
		if (movieID != other.movieID)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Movie [movieID=" + movieID + ", movieName=" + movieName + ", releaseDate=" + releaseDate + "]";
	}
	
	
	
}
