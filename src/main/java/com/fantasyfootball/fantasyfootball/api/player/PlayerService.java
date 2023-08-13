package com.fantasyfootball.fantasyfootball.api.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    public List<PlayerEntity> getPlayers() {
        return playerRepository.findAll();
    }

    public List<PlayerEntity> getPlayersByPosition(String position) {
        return playerRepository.findAllByPosition(position);
    }

    public void deletePlayersByPosition(String position) {
        playerRepository.deleteByPosition(position);
    }

    public void addPlayers(List<PlayerEntity> playerEntities) {
        playerRepository.saveAll(playerEntities);
    }
}
