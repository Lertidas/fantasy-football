package com.fantasyfootball.fantasyfootball.api.player;

import jakarta.transaction.Transactional;
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
    public List<PlayerEntity> addPlayers(List<PlayerEntity> players) {
        return playerRepository.saveAll(players);
    }

    @Transactional
    public boolean deletePlayersByPosition(List<String> positions) {
        boolean flag = true;
        try {
            playerRepository.deleteByPositionIn(positions);
        }
        catch (Exception e) {
            flag = false;
        }
        return flag;
    }
}
