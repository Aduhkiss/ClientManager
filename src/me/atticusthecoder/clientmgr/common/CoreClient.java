package me.atticusthecoder.clientmgr.common;

import org.bukkit.entity.Player;

import me.atticusthecoder.clientmgr.Client;

public class CoreClient {
	
	/*
	 * Core Client Class
	 * Author: Atticus Zambrana
	 */
	
	String playerName;
	Player player;
	
	Client client = Client.NOT_DETERMINED_YET;
	
	public CoreClient(Player player) {
		this.player = player;
		playerName = player.getName();
	}
	
	public Player getPlayer() {
		return player;
	}
	
	public String getPlayerName() {
		return playerName;
	}
	
	public Client getClient() {
		return client;
	}
	
	public void setClient(Client client) {
		this.client = client;
		System.out.println("[Client Manager] Updated the client of " + playerName + " to " + client.getName() + ".");
	}
}
