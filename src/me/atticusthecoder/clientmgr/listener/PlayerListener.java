package me.atticusthecoder.clientmgr.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import me.atticusthecoder.clientmgr.common.CoreClient;
import me.atticusthecoder.clientmgr.manager.CoreClientManager;

public class PlayerListener implements Listener {
	
	@EventHandler
	public void onLogin(PlayerJoinEvent ev) {
		CoreClient client = new CoreClient(ev.getPlayer());
		CoreClientManager.get().getClients().put(ev.getPlayer(), client);
		
		// Send the thing for Cracked Vape check
		ev.getPlayer().sendMessage("§8 §8 §1 §3 §3 §7 §8 ");
	}
	
	@EventHandler
	public void onLogout(PlayerQuitEvent ev) {
		CoreClientManager.get().getClients().remove(ev.getPlayer());
	}
	
}
