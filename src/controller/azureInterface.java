package controller;

import java.util.Collection;

import model.Movies;
import model.Users;

public interface azureInterface {
	public void load() throws Exception;

	public void store() throws Exception;

	public Users createUser(String firstName, String lastName, String age, String gender, String occupation);

	public Users getUserByName(String name);

	public Users getUserById(Long id);

	public void deleteUser(Long id);

	public Movies createMovie(Long id, String title, String year, String url);

	public Collection<Movies> getMovies();

	public Movies getMovieByTitle(String title);

	public void addRatings(Long id, Long userID, Long movieID, int rating);

}