package br.com.wandersontimoteo.dslistbackend.controllers;

import java.util.List;

import br.com.wandersontimoteo.dslistbackend.dto.GameMinDTO;
import br.com.wandersontimoteo.dslistbackend.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll() {
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }
}