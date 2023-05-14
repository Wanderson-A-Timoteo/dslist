package br.com.wandersontimoteo.dslistbackend.repositories;

import br.com.wandersontimoteo.dslistbackend.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}

