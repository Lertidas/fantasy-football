package com.fantasyfootball.fantasyfootball.api.rankingSheet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/rankingSheet")
public class RankingSheetController {
    @Autowired
    private RankingSheetService rankingSheetService;

    @PostMapping
    public ResponseEntity<Boolean> getPlayersByPosition(@RequestParam("file") MultipartFile file, @RequestParam("position") String position) {
        boolean result = rankingSheetService.uploadRankingSheet(file, position);
        return ResponseEntity.status(result ? HttpStatus.OK : HttpStatus.BAD_REQUEST).body(result);
    }
}
