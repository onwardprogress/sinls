package com.gmail.surfaceisnotsafe;

import org.bukkit.plugin.java.JavaPlugin;

public final class sinls extends JavaPlugin{
	
	public void onEnable() {
	    getLogger().info("onEnable has been invoked.");	
	}
	
	public void onDisable() {
		getLogger().info("onDisable has been invoked");
	}

}
