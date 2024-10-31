package com.gcardosoo.gamelist.services;

import com.gcardosoo.gamelist.dtos.GameDTO;
import com.gcardosoo.gamelist.dtos.GameMinDTO;
import com.gcardosoo.gamelist.entities.Game;
import com.gcardosoo.gamelist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Game> games = gameRepository.findAll();
        return games.stream().map(game -> new GameMinDTO(game)).toList();
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        var optGame = gameRepository.findById(id);

        if(optGame.isPresent()){
            Game game = optGame.get();
            return new GameDTO(game);
        }

        throw new NoSuchElementException();
    }
}
