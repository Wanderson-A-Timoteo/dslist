package br.com.wandersontimoteo.dslistbackend.controllers;

import java.util.List;

import br.com.wandersontimoteo.dslistbackend.dto.GameListDTO;
import br.com.wandersontimoteo.dslistbackend.services.GameListService;
import br.com.wandersontimoteo.dslistbackend.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }
}

