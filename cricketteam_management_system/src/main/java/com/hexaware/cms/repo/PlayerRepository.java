package com.hexaware.cms.repo;
/*
 * Author: RAJESHWARI
 * Description : Player Repository
 * Date : 22-11-2024
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hexaware.cms.entity.Player;

import jakarta.transaction.Transactional;
@Repository
public interface PlayerRepository extends JpaRepository<Player,Integer>{
	
	@Modifying
	@Transactional
	@Query("update Player p SET p.totalMatches=?1 where p.playerId=?2")
	int updateTotalMatches(int totalMatches,int playerId);
	

}
