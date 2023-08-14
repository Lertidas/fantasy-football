package com.fantasyfootball.fantasyfootball.api.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @DeleteMapping("/{positions}")
    public ResponseEntity<Boolean> deletePlayersByPositionIn(@PathVariable List<String> positions) {
        boolean result = playerService.deletePlayersByPosition(positions);
        return ResponseEntity.status(result ? HttpStatus.OK : HttpStatus.BAD_REQUEST).body(result);
    }
}
