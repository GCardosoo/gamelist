package com.gcardosoo.gamelist.services;

import com.gcardosoo.gamelist.dtos.GameMinDTO;
import com.gcardosoo.gamelist.entities.Game;
import com.gcardosoo.gamelist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        List<Game> games = gameRepository.findAll();
        return games.stream().map(game -> new GameMinDTO(game)).toList();
    }
}
