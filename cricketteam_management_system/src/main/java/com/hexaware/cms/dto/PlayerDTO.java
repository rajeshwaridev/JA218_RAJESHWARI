package com.hexaware.cms.dto;
/*
 * Author: RAJESHWARI
 * Description : Data Transfer Object for Player 
 * Date : 22-11-2024
 */

public class PlayerDTO {


//    private int playerId;       
    private String playerName;    
    private int jerseyNumber;     
    private Role role;              
    private int totalMatches;     
    private String teamName;       
    private String country;  
    private String description;     
    
    
    // Enum for Role
    public enum Role {
        BATSMAN,
        BOWLER,
        KEEPER,
        ALL_ROUNDER;
    }

    // Default Constructor
    public PlayerDTO() {
    }

    // Parameterized Constructor
    public PlayerDTO( String playerName, int jerseyNumber, Role role, int totalMatches, String teamName, String country, String description) {
//        this.playerId = playerId;
        this.playerName = playerName;
        this.jerseyNumber = jerseyNumber;
        this.role = role;
        this.totalMatches = totalMatches;
        this.teamName = teamName;
        this.country = country;
        this.description = description;
    }

    // Getters and Setters
//    public int getPlayerId() {
//        return playerId;
//    }
//
//    public void setPlayerId(int playerId) {
//        this.playerId = playerId;
//    }

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
        return "PlayerDTO{" +
                 + '\'' +
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

