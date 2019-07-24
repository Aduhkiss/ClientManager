package me.atticusthecoder.clientmgr.checks;

import java.io.UnsupportedEncodingException;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.messaging.PluginMessageListener;

import me.atticusthecoder.clientmgr.Client;
import me.atticusthecoder.clientmgr.common.Check;
import me.atticusthecoder.clientmgr.common.CoreClient;
import me.atticusthecoder.clientmgr.manager.CoreClientManager;

public class BrandCheck extends Check implements Listener, PluginMessageListener {
	
	public BrandCheck() {
		super("Brand Check", Client.VANILLA);
	}

	@Override
	public void onPluginMessageReceived(String channel, Player player, byte[] data) {
		String string;
		try {
			string = new String(data, "UTF-8");
		} catch(UnsupportedEncodingException exception) {
			return;
		}
		
		new Thread() {
			public void run() {
				// We are waiting 2 seconds, to ensure that the CoreClientManager has them set as NOT_DETERMINED_YET
				// if they were not caught by any other checks
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				String client = string.substring(1, string.length());
		        Bukkit.getLogger().info("[Client Manager] " + player.getName() + " has logged in with '" + client + "'.");
		        
		        // Determine the client, only if we have not found it with the other checks yet
		        CoreClient clientO = CoreClientManager.get().get(player);
		        if(clientO.getClient() == Client.NOT_DETERMINED_YET) {
		        	
		            if(client.equalsIgnoreCase("hyperium")) {
		            	CoreClientManager.get().get(player).setClient(Client.HYPERIUM);
		            }
		            if(client.equalsIgnoreCase("vanilla")) {
		            	CoreClientManager.get().get(player).setClient(Client.VANILLA);
		            }
		        	
		        }
			}
		}.start();
	}

}
