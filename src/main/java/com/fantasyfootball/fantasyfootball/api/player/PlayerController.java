package com.fantasyfootball.fantasyfootball.api.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/players")
public class PlayerController {
    @Autowired
    private PlayerService playerService;

    @GetMapping
    public List<PlayerEntity> getPlayers() {
        return playerService.getPlayers();
    }

    @GetMapping("/{position}")
    public List<PlayerEntity> getPlayersByPosition(@PathVariable String position) {
        return playerService.getPlayersByPosition(position);
    }
}
