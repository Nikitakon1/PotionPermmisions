package info.TheMFN.PotionPermisions;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class PotionPermmisions extends JavaPlugin{
	
	public static PotionPermmisions instance;
	
	@Override
	public void onEnable(){
		instance = this;
		getLogger().info("Potion Permmisions Has Started");
		getServer().getPluginManager().registerEvents(new PlayerListener(), getInstance());
	}

	
	@Override
	public void onDisable(){
		instance = null;
		getLogger().info("Potion Permmisions Has Stopped");
		
	}
	
	public static PotionPermmisions getInstance(){
		return instance;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		
		int cooldownTime = 300;
		final Player player = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("aspower")){
			if (sender instanceof Player){
				if (!player.hasPermission(Perms.ASS.getPerm()))
						player.sendMessage(ChatColor.DARK_RED + "You do not have permmision to use this powerup!");
				if (player.hasPermission(Perms.ASS.getPerm())){
					
					if(PlayerListener.cooldown.containsKey(player.getUniqueId())) {
						long secondsLeft = ((PlayerListener.cooldown.get(player.getUniqueId())/1000)+cooldownTime) - (System.currentTimeMillis()/1000);
						if(secondsLeft>0){
							player.sendMessage(ChatColor.DARK_RED +"Please wait for " + secondsLeft +" seconds as there is a 5 minute cooldown on this powerup!");
							return true;
						}
					}
					PlayerListener.cooldown.put(player.getUniqueId(), System.currentTimeMillis());
					player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 600, 9));
					player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 600, 9));
					player.sendMessage(ChatColor.GOLD + "PowerUp Effects given! Be quick, they only last 30 seconds and have a 5 minute cooldown!");
					player.sendMessage(ChatColor.GRAY + "Psssst. Remember! Take off your armour and don't hold an item so you can't be seen!");
				}
			}
		}
		return false;
	}
}



