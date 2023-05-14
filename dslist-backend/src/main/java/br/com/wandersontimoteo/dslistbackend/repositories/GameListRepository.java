package br.com.wandersontimoteo.dslistbackend.repositories;

import br.com.wandersontimoteo.dslistbackend.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;


public interface GameListRepository extends JpaRepository<GameList, Long> {

}
