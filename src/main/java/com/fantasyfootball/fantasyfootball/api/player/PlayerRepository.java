package com.fantasyfootball.fantasyfootball.api.player;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends JpaRepository<PlayerEntity, Integer> {
    List<PlayerEntity> findAllByPosition(String position);
    void deleteByPosition(String position);
}
