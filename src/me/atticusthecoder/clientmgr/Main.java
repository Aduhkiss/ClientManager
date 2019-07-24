package me.atticusthecoder.clientmgr;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import me.atticusthecoder.clientmgr.checks.BrandCheck;
import me.atticusthecoder.clientmgr.checks.HckdClientB;
import me.atticusthecoder.clientmgr.checks.HckdClientC;
import me.atticusthecoder.clientmgr.checks.HckdClientD;
import me.atticusthecoder.clientmgr.checks.LMAOHaxCheck;
import me.atticusthecoder.clientmgr.checks.MCNetHandlerCheck;
import me.atticusthecoder.clientmgr.checks.OCMCCheck;
import me.atticusthecoder.clientmgr.checks.VapeCheck;
import me.atticusthecoder.clientmgr.listener.PlayerListener;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		// Loading message
		Bukkit.getLogger().info("You are using Client Manager - Created by AtticusTheCoder (AtticusIsNotHere)");
		
		// Register normal listeners
		this.getServer().getPluginManager().registerEvents(new PlayerListener(), this);
		
		this.getServer().getMessenger().registerIncomingPluginChannel(this, "LOLIMAHCKER", new VapeCheck());
		this.getServer().getMessenger().registerIncomingPluginChannel(this, "OCMC", new OCMCCheck());
		this.getServer().getMessenger().registerIncomingPluginChannel(this, "cock", new HckdClientB());
		this.getServer().getMessenger().registerIncomingPluginChannel(this, "lmaohax", new LMAOHaxCheck());
		this.getServer().getMessenger().registerIncomingPluginChannel(this, "MCnetHandler", new MCNetHandlerCheck());
		//this.getServer().getMessenger().registerIncomingPluginChannel(this, "REGISTER", new VanillaCheck());
		this.getServer().getMessenger().registerIncomingPluginChannel(this, "customGuiOpenBspkrs", new HckdClientC());
		this.getServer().getMessenger().registerIncomingPluginChannel(this, "0SO1Lk2KASxzsd", new HckdClientD());
		
		// Also lets not forget about the clients that tell us in the MC|Brand packet
		this.getServer().getMessenger().registerIncomingPluginChannel(this, "MC|Brand", new BrandCheck());
	}
	
	@Override
	public void onDisable() {
		
		
	}

}
