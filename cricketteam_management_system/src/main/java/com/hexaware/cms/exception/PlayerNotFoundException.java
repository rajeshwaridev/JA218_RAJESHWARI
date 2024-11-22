package com.hexaware.cms.exception;
/*
 * Author: RAJESHWARI
 * Description : Custom exception which extends Runtime exception 
 * Date : 22-11-2024
 */

public class PlayerNotFoundException extends RuntimeException {
	public PlayerNotFoundException(String message) {
		super(message);
	}

}
