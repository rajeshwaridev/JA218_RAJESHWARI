package com.hexaware.cms.service;
import java.util.ArrayList;
/*
 * Author: RAJESHWARI
 * Description : Service Implementation for Player Interface 
 * Date : 22-11-2024
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.cms.dto.CountDTO;
import com.hexaware.cms.dto.PlayerDTO;
import com.hexaware.cms.dto.PlayerDTO.Role;
import com.hexaware.cms.entity.Player;
import com.hexaware.cms.exception.PlayerNotFoundException;
import com.hexaware.cms.repo.PlayerRepository;
@Service
public class PlayerServiceImp implements IPlayerService {
	@Autowired
	PlayerRepository playerRepository;
	
  
	@Override
	public List<Player> getAllPlayers() {
		return playerRepository.findAll();
	}

	@Override
	public Player addNewPlayer(PlayerDTO player) {
		// TODO Auto-generated method stub
		Player newPlayer=new Player();
//		newPlayer.setPlayerId(player.getPlayerId());
		newPlayer.setPlayerName(player.getPlayerName());
		newPlayer.setJerseyNumber(player.getJerseyNumber());
		 Player.Role role = Player.Role.valueOf(player.getRole().name());
		newPlayer.setRole(role);
		newPlayer.setTotalMatches(player.getTotalMatches());
		newPlayer.setTeamName(player.getTeamName());
		newPlayer.setPlayerName(player.getPlayerName());
		newPlayer.setCountry(player.getCountry());
		newPlayer.setDescription(player.getDescription());
		return playerRepository.save(newPlayer);
		

		
//		return playerRepository.save(player);
	}

	@Override
	public Player getByPlayer(int playerId) {
		// TODO Auto-generated method stub
		Player playerById=playerRepository.findById(playerId).orElse(null);
		if(playerById != null) {
			return playerById;
		}
		else {
			throw new PlayerNotFoundException("Player Not Found for the Given PlayerID "+playerId);
		}
	}

	@Override
	public Player updatePlayer(Player player) {
		// TODO Auto-generated method stub
		return playerRepository.save(player);
	}

	@Override
	public String deletePlayerById(int playerId) {
		// TODO Auto-generated method stub
		 playerRepository.deleteById(playerId);
		 return "Record Deleted ";
	}

	@Override
	public int updateTotalMatches(int playerId, int totalMatches) {
		// TODO Auto-generated method stub
		int updateTotalMatch=playerRepository.updateTotalMatches(totalMatches, playerId);
		if(updateTotalMatch>0) {
			return updateTotalMatch;
		}
		else {
			throw new PlayerNotFoundException("Player is Not Exist for given Player Id "+playerId+" .So can not update total number of matches");
		}
	}

	@Override
	public List<CountDTO>getByTotalMathes() {
		List<Object[]> results = playerRepository.getbyCountryCount();
	    List<CountDTO> countDTOList = new ArrayList<>();

	    for (Object[] result : results) {
	        String countryName = (String) result[0];  // Get country
	        Long count = (Long) result[1];  // Get count of players
	        countDTOList.add(new CountDTO( count,countryName));
	    }

	    return countDTOList;
	}
	

}
