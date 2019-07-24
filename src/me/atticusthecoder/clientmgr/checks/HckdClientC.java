package me.atticusthecoder.clientmgr.checks;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.messaging.PluginMessageListener;

import me.atticusthecoder.clientmgr.Client;
import me.atticusthecoder.clientmgr.common.Check;
import me.atticusthecoder.clientmgr.manager.CoreClientManager;

public class HckdClientC extends Check implements Listener, PluginMessageListener {
	
	public HckdClientC() {
		super("HckdClientC Check", Client.HACKED_CLIENT_C);
	}

	@Override
	public void onPluginMessageReceived(String channel, Player player, byte[] data) {
        String str;
        try {
            str = new String(data);
        } catch (Exception ex) {
            str = "";
        }
        CoreClientManager.get().get(player).setClient(client);
        Bukkit.getLogger().info("[Client Manager] " + player.getName() + " has logged in with " + client.getName());
	}

}
