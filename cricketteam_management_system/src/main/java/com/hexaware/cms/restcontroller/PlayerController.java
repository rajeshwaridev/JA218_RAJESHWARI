package com.hexaware.cms.restcontroller;
/*
 * Author: RAJESHWARI
 * Description : Player Rest controller which handles HTTP Requests and Responses
 * Date : 22-11-2024
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.cms.dto.CountDTO;
import com.hexaware.cms.dto.PlayerDTO;
import com.hexaware.cms.entity.Player;
import com.hexaware.cms.service.IPlayerService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/players")
public class PlayerController {
	@Autowired
	IPlayerService playerService;
	@GetMapping("/getall")
	public List<Player> getAll(){
		return playerService.getAllPlayers();
	}
	@GetMapping("/getByPlayerId/{playerId}")
	public Player getByPlayerId(@PathVariable int playerId) {
		return playerService.getByPlayer(playerId);
	}
	@PostMapping("/insert")
	public Player addNewPlayer(@Valid @RequestBody PlayerDTO playerDto)
	{
		return playerService.addNewPlayer(playerDto);
	}
	@PutMapping("/update")
	public Player updatePlayer(@Valid @RequestBody Player player)
	{
		return playerService.updatePlayer(player);
	}
	@DeleteMapping("/delete")
	public String deletePlayer(int playerId) {
		return playerService.deletePlayerById(playerId);
	}
	@PutMapping("/update/{playerId}/{totalMatches}")
	public int updateTotalPlay(@PathVariable int playerId,@PathVariable int totalMatches) {
		return playerService.updateTotalMatches(playerId, totalMatches);
		
	}
	@GetMapping("/getByTotalMatches")
	public List<CountDTO> getByTotalMatches() {
		return playerService.getByTotalMathes();
	}
	

}
