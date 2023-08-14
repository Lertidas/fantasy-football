package com.fantasyfootball.fantasyfootball.util;

import com.fantasyfootball.fantasyfootball.api.player.PlayerEntity;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FIleUtil {
    public static List<PlayerEntity> createPlayerEntitiesFromFile(MultipartFile file, String position) throws IOException {
        List<PlayerEntity> players = new ArrayList<>();
        if (!file.isEmpty()) {
            byte[] bytes = file.getBytes();
            String content = new String(bytes);

            String[] lines = content.split("\n");
            for (int i = 0; i < lines.length; i++) {
                // Throw out first line as it is column mapping. (Could use later for more sophisticated file to database mapping)
                if (i != 0) {
                    players.add(PlayerUtil.getPlayerEntityFromFileLine(lines[i].split(","), position));
                }
            }
        }
        return players;
    }
}
