package com.fantasyfootball.fantasyfootball.util;

import com.fantasyfootball.fantasyfootball.api.player.PlayerEntity;

public class PlayerUtil {
    public static PlayerEntity getPlayerEntityFromFileLine(String[] line, String position) {
       // Going to be a little messy for now, hardcoded data conversion from line to entity by assuming where data is by index
       // Cleanup extra quotation marks
       line[0] = line[0].substring(1, line[0].length() - 1);
       line[2] = line[2].substring(1, line[2].length() - 1);
       line[4] = line[4].substring(1, line[4].length() - 1);
       line[5] = line[5].substring(1, line[5].length() - 1);
       line[6] = line[6].substring(1, line[6].length() - 1);

       PlayerEntity playerEntity = new PlayerEntity();
       playerEntity.rank = Integer.valueOf(line[0]);
       playerEntity.tier = Integer.valueOf(line[1]);
       playerEntity.name = line[2];
       playerEntity.team = line[3];
       playerEntity.bye = !"-".equals(line[4]) ? Integer.valueOf(line[4]) : null;
       playerEntity.schedule = !"-".equals(line[5]) ? Integer.valueOf(line[5].substring(0, 1)) : null;
       playerEntity.ecr = !"-".equals(line[6]) ? Integer.valueOf(line[6]) : null;
       playerEntity.position = position;
       return playerEntity;
    }
}
