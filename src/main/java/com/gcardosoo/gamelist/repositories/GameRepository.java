package com.gcardosoo.gamelist.repositories;

import com.gcardosoo.gamelist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}