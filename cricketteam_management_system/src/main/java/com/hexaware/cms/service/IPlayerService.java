package com.hexaware.cms.service;
/*
 * Author: RAJESHWARI
 * Description : Interface for Player Service 
 * Date : 22-11-2024
 */
import java.util.List;

import com.hexaware.cms.dto.PlayerDTO;
import com.hexaware.cms.entity.Player;

public interface IPlayerService {
   public List<Player> getAllPlayers();
   public Player addNewPlayer(PlayerDTO player);
   public Player getByPlayer(int playerId);
   public Player updatePlayer(Player player);
   public String deletePlayerById(int playerId);
   public int updateTotalMatches(int playerId,int totalMatches);
   
}
