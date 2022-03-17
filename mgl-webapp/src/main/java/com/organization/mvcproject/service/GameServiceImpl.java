package com.organization.mvcproject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.organization.mvcproject.model.Game;
import com.organization.mvcproject.repository.GameDAOMock;

@Service
public class GameServiceImpl implements GameService {
	
	@Autowired
	private GameDAOMock gameDAOMock; 

	@Override
	public List<Game> retrieveAllGames() {
		return gameDAOMock.retrieveAllGames();
	}

	@Override
	public Game saveGame(Game game) {
		return gameDAOMock.saveGame(game);
	}


	@Override
	public Boolean deleteGame(Long gameId) {
		return gameDAOMock.deleteGame(gameId); 
	}


	@Override
	public Game updateGame(Game game) {
		return gameDAOMock.saveGame(game);
	}
	
	@Override
	public Game findGameById(Long gameId) {
		return gameDAOMock.findGameById(gameId);
	}
	
	@Override
	List<Game> findGamesByGenre(String genre) {
		return gameDAOMock.findGamesByGenre(genre);
	}

	

}