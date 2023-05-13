package br.com.wandersontimoteo.dslistbackend.services;

import java.util.List;

import br.com.wandersontimoteo.dslistbackend.dto.GameMinDTO;
import br.com.wandersontimoteo.dslistbackend.entities.Game;
import br.com.wandersontimoteo.dslistbackend.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }
}

