package com.fantasyfootball.fantasyfootball.api.rankingSheet;

import com.fantasyfootball.fantasyfootball.api.player.PlayerService;
import com.fantasyfootball.fantasyfootball.util.FIleUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class RankingSheetService {

    @Autowired
    private PlayerService playerService;
    public boolean uploadRankingSheet(MultipartFile file, String position) {
        try {
            playerService.addPlayers(FIleUtil.createPlayerEntitiesFromFile(file, position));
            return true;
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error uploading file");
            return false;
        }
    }
}
