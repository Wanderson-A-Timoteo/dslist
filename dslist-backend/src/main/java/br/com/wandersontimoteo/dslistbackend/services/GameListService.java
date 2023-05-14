package br.com.wandersontimoteo.dslistbackend.services;

import java.util.List;

import br.com.wandersontimoteo.dslistbackend.dto.GameListDTO;
import br.com.wandersontimoteo.dslistbackend.entities.GameList;
import br.com.wandersontimoteo.dslistbackend.repositories.GameListRepository;
import br.com.wandersontimoteo.dslistbackend.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(GameListDTO::new).toList();
    }
}

