package com.hexaware.cms.entity;
/*
 * Author: RAJESHWARI
 * Description : Entity class  for Player 
 * Date : 22-11-2024
 */

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "players")
public class Player {


    @Id
    @Column(name = "player_id", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int playerId; 

    @Column(name = "player_name", nullable = false)
    @NotBlank(message = "Player Name cannot be blank")
    @Size(max = 50, message = "Player Name cannot exceed 50 characters")
    private String playerName; 

    @Column(name = "jersey_number", nullable = false)
    @Min(value = 1, message = "Jersey Number must be a positive number")
    @Max(value = 500, message = "Jersey Number cannot exceed 500")
    private int jerseyNumber; 

    @Column(name = "role", nullable = false)
    @Enumerated(EnumType.STRING)
    private Role role; 

    @Column(name = "total_matches", nullable = false)
    @Min(value = 0, message = "Total Matches must be a positive number")
    private int totalMatches; 

    @Column(name = "team_name", nullable = false)
    @NotBlank(message = "Team Name cannot be blank")
    @Size(max = 50, message = "Team Name cannot exceed 50 characters")
    private String teamName; 

    @Column(name = "country_name", nullable = false)
    @NotBlank(message = "Country/State cannot be blank")
    @Size(max = 50, message = "Country cannot exceed 50 characters")
    private String country; 

    @Column(name = "description", length = 500)
    @Size(max = 500, message = "Description cannot exceed 500 characters")
    private String description; 

    
    // Enum for Role
    public enum Role {
        BATSMAN,
        BOWLER,
        KEEPER,
        ALL_ROUNDER;
    }
    // Default Constructor
    public Player() {
    }

    // Parameterized Constructor
    public Player(int playerId, String playerName, int jerseyNumber, Role role, int totalMatches, String teamName, String country, String description) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.jerseyNumber = jerseyNumber;
        this.role = role;
        this.totalMatches = totalMatches;
        this.teamName = teamName;
        this.country = country;
        this.description = description;
    }

    // Getters and Setters
    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public int getTotalMatches() {
        return totalMatches;
    }

    public void setTotalMatches(int totalMatches) {
        this.totalMatches = totalMatches;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerId='" + playerId + '\'' +
                ", playerName='" + playerName + '\'' +
                ", jerseyNumber=" + jerseyNumber +
                ", role=" + role +
                ", totalMatches=" + totalMatches +
                ", teamName='" + teamName + '\'' +
                ", country='" + country + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

