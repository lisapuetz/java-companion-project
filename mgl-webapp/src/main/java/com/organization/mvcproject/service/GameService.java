package com.organization.mvcproject.service;

import java.util.List;

import com.organization.mvcproject.model.Game;

public interface GameService {

	List<Game> retrieveAllGames();

	Game saveGame(Game game);
	
	Boolean deleteGame(Long gameId);

	Game updateGame(Game game);
	
	Game findGameById(Long gameId);
	
	List<Game> findGamesByGenre(String genre);
}