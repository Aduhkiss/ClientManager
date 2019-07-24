package me.atticusthecoder.clientmgr.manager;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import me.atticusthecoder.clientmgr.common.CoreClient;

public class CoreClientManager {
	public static CoreClientManager clientManager;
	
	public static CoreClientManager get() {
		if(clientManager == null) {
			clientManager = new CoreClientManager();
		}
		return clientManager;
	}
	
	private Map<Player, CoreClient> clients = new HashMap<Player, CoreClient>();
	
	public Map<Player, CoreClient> getClients() {
		return clients;
	}
	
	public CoreClient get(Player player) {
		return getClients().get(player);
	}
	
	public CoreClient get(String player) {
		return get(Bukkit.getPlayer(player));
	}
}
