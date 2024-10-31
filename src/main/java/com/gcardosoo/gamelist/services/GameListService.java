package com.gcardosoo.gamelist.services;

import com.gcardosoo.gamelist.dtos.GameListDTO;
import com.gcardosoo.gamelist.dtos.GameMinDTO;
import com.gcardosoo.gamelist.entities.Game;
import com.gcardosoo.gamelist.entities.GameList;
import com.gcardosoo.gamelist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> games = gameListRepository.findAll();
        return games.stream().map(game -> new GameListDTO(game)).toList();
    }

}
