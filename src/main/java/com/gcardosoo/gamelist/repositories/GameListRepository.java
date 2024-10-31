package com.gcardosoo.gamelist.repositories;

import com.gcardosoo.gamelist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
