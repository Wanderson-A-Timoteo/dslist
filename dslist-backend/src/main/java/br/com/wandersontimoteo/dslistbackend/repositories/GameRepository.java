package br.com.wandersontimoteo.dslistbackend.repositories;

import java.util.List;

import br.com.wandersontimoteo.dslistbackend.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface GameRepository extends JpaRepository<Game, Long> {

}
