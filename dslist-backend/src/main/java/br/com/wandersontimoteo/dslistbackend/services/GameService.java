package br.com.wandersontimoteo.dslistbackend.services;

import java.util.List;

import br.com.wandersontimoteo.dslistbackend.dto.GameDTO;
import br.com.wandersontimoteo.dslistbackend.dto.GameMinDTO;
import br.com.wandersontimoteo.dslistbackend.entities.Game;
import br.com.wandersontimoteo.dslistbackend.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;


@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(@PathVariable Long listId) {
        Game result = gameRepository.findById(listId).get();
        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }
}
