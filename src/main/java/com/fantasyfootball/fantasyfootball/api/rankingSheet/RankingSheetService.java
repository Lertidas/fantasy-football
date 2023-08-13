package com.fantasyfootball.fantasyfootball.api.rankingSheet;

import com.fantasyfootball.fantasyfootball.api.player.PlayerEntity;
import com.fantasyfootball.fantasyfootball.api.player.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

@Service
public class RankingSheetService {

    @Autowired
    private PlayerService playerService;
    public boolean uploadRankingSheet(MultipartFile file, String position) {
        try {
            // Iterate over file and add all players to list of players to add
            List<PlayerEntity> playerEntities = new ArrayList<>();

             playerService.deletePlayersByPosition(position);
            return true;
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error uploading file");
            return false;
        }
    }
}
