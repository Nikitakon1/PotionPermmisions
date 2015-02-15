package info.TheMFN.PotionPermisions;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class PlayerListener implements Listener{
	
	public static Map<UUID, Long> cooldown = new HashMap<UUID, Long>();
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event){
		
		Player play =event.getPlayer();
		if(!play.isOp()) {
			Player player = event.getPlayer();
			Player debug = event.getPlayer();
			if (debug.hasPermission(Perms.DEBUG.getPerm()))
				debug.sendMessage(ChatColor.RED + "join.EVENT");
			if (player.hasPermission(Perms.SWIFT1.getPerm()))
				player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1000000000, 0));
			Player player2 = event.getPlayer();
			if (player2.hasPermission(Perms.SWIFT2.getPerm()))
				player2.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1000000000, 1));
			Player player3 = event.getPlayer();
			if (player3.hasPermission(Perms.STRENGTH1.getPerm()))
				player3.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000000, 0));
			Player player4 = event.getPlayer();
			if (player4.hasPermission(Perms.STRENGTH2.getPerm()))
				player4.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000000, 1));
			Player player5 = event.getPlayer();
			if (player5.hasPermission(Perms.JUMP1.getPerm()))
				player5.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 1000000000, 0));
			Player player6 = event.getPlayer();
			if (player6.hasPermission(Perms.JUMP2.getPerm()))
				player6.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 1000000000, 1));
			Player player7 = event.getPlayer();
			if (player7.hasPermission(Perms.SLOW1.getPerm()))
				player7.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 1000000000, 0));
			Player player8 = event.getPlayer();
			if (player8.hasPermission(Perms.SLOW2.getPerm()))
				player8.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 1000000000, 1));
			Player player9 = event.getPlayer();
			if (player9.hasPermission(Perms.HASTE1.getPerm()))
				player9.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 1000000000, 0));
			Player player10 = event.getPlayer();
			if (player10.hasPermission(Perms.HASTE2.getPerm()))
				player10.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 1000000000, 1));
			Player player11 = event.getPlayer();
			if (player11.hasPermission(Perms.WEAK1.getPerm()))
				player11.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 1000000000, 0));
			Player player12 = event.getPlayer();
			if (player12.hasPermission(Perms.WEAK2.getPerm()))
				player12.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 1000000000, 1));
			Player player13 = event.getPlayer();
			if (player13.hasPermission(Perms.POISON1.getPerm()))
				player13.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 1000000000, 0));
			Player player14 = event.getPlayer();
			if (player14.hasPermission(Perms.POISON2.getPerm()))
				player14.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 1000000000, 1));
			Player player24 = event.getPlayer();
			if (player24.hasPermission(Perms.REGEN1.getPerm()))
				player24.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 1000000000, 0));
			Player player25 = event.getPlayer();
			if (player25.hasPermission(Perms.REGEN2.getPerm()))
				player25.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 1000000000, 1));
			Player player26 = event.getPlayer();
			if (player26.hasPermission(Perms.SATURATE1.getPerm()))
				player26.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 1000000000, 0));
			Player player27 = event.getPlayer();
			if (player27.hasPermission(Perms.SATURATE2.getPerm()))
				player27.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 1000000000, 1));
			//---------------------------------------------------------------
			Player player15 = event.getPlayer();
			if (player15.hasPermission(Perms.NVIS.getPerm()))
				player15.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 1000000000, 0));
			Player player16 = event.getPlayer();
			if (player16.hasPermission(Perms.FRES.getPerm()))
				player16.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 1000000000, 0));
			Player player17 = event.getPlayer();
			if (player17.hasPermission(Perms.INVIS.getPerm()))
				player17.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 1000000000, 0));
			Player player18 = event.getPlayer();
			if (player18.hasPermission(Perms.BLIND.getPerm()))
				player18.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 1000000000, 0));
			Player player19 = event.getPlayer();
			if (player19.hasPermission(Perms.CONFUSE.getPerm()))
				player19.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 1000000000, 0));
			Player player20 = event.getPlayer();
			if (player20.hasPermission(Perms.HUNGERINCREASE.getPerm()))
				player20.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, 1000000000, 0));
			Player player21 = event.getPlayer();
			if (player21.hasPermission(Perms.SLOWDIG.getPerm()))
				player21.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 1000000000, 0));
			Player player22 = event.getPlayer();
			if (player22.hasPermission(Perms.WATERB.getPerm()))
				player22.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 1000000000, 0));
			Player player23 = event.getPlayer();
			if (player23.hasPermission(Perms.WITHER.getPerm()))
				player23.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 1000000000, 0));
			//--------------------------------------------------------------------
			Player player28 = event.getPlayer();
			if (player28.hasPermission(Perms.oneH.getPerm()))
				player28.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1000000000, 0));
			Player player29 = event.getPlayer();
			if (player29.hasPermission(Perms.twoH.getPerm()))
				player29.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1000000000, 1));
			Player player30 = event.getPlayer();
			if (player30.hasPermission(Perms.threeH.getPerm()))
				player30.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1000000000, 2));
			Player player31 = event.getPlayer();
			if (player31.hasPermission(Perms.fourH.getPerm()))
				player31.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1000000000, 3));
			Player player32 = event.getPlayer();
			if (player32.hasPermission(Perms.fiveH.getPerm()))
				player32.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1000000000, 4));
			Player player33 = event.getPlayer();
			if (player33.hasPermission(Perms.sixH.getPerm()))
				player33.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1000000000, 5));
			Player player34 = event.getPlayer();
			if (player34.hasPermission(Perms.sevenH.getPerm()))
				player34.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1000000000, 6));
			Player player35 = event.getPlayer();
			if (player35.hasPermission(Perms.eightH.getPerm()))
				player35.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1000000000, 7));
			Player player36 = event.getPlayer();
			if (player36.hasPermission(Perms.nineH.getPerm()))
				player36.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1000000000, 8));
			Player player37 = event.getPlayer();
			if (player37.hasPermission(Perms.tenH.getPerm()))
				player37.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1000000000, 9));
		}
	}
	
	
	@EventHandler
	public void onPlayerMove(PlayerMoveEvent event){
		Player play =event.getPlayer();
		if(!play.isOp()) {
			Player debug = event.getPlayer();
			if (debug.hasPermission(Perms.DEBUG.getPerm()))
				debug.sendMessage(ChatColor.RED + "move.EVENT");
			Player player = event.getPlayer();
			if (player.hasPermission(Perms.SWIFT1.getPerm()))
				player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1000000000, 0));
			Player player2 = event.getPlayer();
			if (player2.hasPermission(Perms.SWIFT2.getPerm()))
				player2.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1000000000, 1));
			Player player3 = event.getPlayer();
			if (player3.hasPermission(Perms.STRENGTH1.getPerm()))
				player3.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000000, 0));
			Player player4 = event.getPlayer();
			if (player4.hasPermission(Perms.STRENGTH2.getPerm()))
				player4.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000000, 1));
			Player player5 = event.getPlayer();
			if (player5.hasPermission(Perms.JUMP1.getPerm()))
				player5.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 1000000000, 0));
			Player player6 = event.getPlayer();
			if (player6.hasPermission(Perms.JUMP2.getPerm()))
				player6.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 1000000000, 1));
			Player player7 = event.getPlayer();
			if (player7.hasPermission(Perms.SLOW1.getPerm()))
				player7.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 1000000000, 0));
			Player player8 = event.getPlayer();
			if (player8.hasPermission(Perms.SLOW2.getPerm()))
				player8.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 1000000000, 1));
			Player player9 = event.getPlayer();
			if (player9.hasPermission(Perms.HASTE1.getPerm()))
				player9.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 1000000000, 0));
			Player player10 = event.getPlayer();
			if (player10.hasPermission(Perms.HASTE2.getPerm()))
				player10.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 1000000000, 1));
			Player player11 = event.getPlayer();
			if (player11.hasPermission(Perms.WEAK1.getPerm()))
				player11.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 1000000000, 0));
			Player player12 = event.getPlayer();
			if (player12.hasPermission(Perms.WEAK2.getPerm()))
				player12.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 1000000000, 1));
			Player player13 = event.getPlayer();
			if (player13.hasPermission(Perms.POISON1.getPerm()))
				player13.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 1000000000, 0));
			Player player14 = event.getPlayer();
			if (player14.hasPermission(Perms.POISON2.getPerm()))
				player14.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 1000000000, 1));
			Player player24 = event.getPlayer();
			if (player24.hasPermission(Perms.REGEN1.getPerm()))
				player24.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 1000000000, 0));
			Player player25 = event.getPlayer();
			if (player25.hasPermission(Perms.REGEN2.getPerm()))
				player25.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 1000000000, 1));
			Player player26 = event.getPlayer();
			if (player26.hasPermission(Perms.SATURATE1.getPerm()))
				player26.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 1000000000, 0));
			Player player27 = event.getPlayer();
			if (player27.hasPermission(Perms.SATURATE2.getPerm()))
				player27.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 1000000000, 1));
			//---------------------------------------------------------------
			Player player15 = event.getPlayer();
			if (player15.hasPermission(Perms.NVIS.getPerm()))
				player15.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 1000000000, 0));
			Player player16 = event.getPlayer();
			if (player16.hasPermission(Perms.FRES.getPerm()))
				player16.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 1000000000, 0));
			Player player17 = event.getPlayer();
			if (player17.hasPermission(Perms.INVIS.getPerm()))
				player17.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 1000000000, 0));
			Player player18 = event.getPlayer();
			if (player18.hasPermission(Perms.BLIND.getPerm()))
				player18.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 1000000000, 0));
			Player player19 = event.getPlayer();
			if (player19.hasPermission(Perms.CONFUSE.getPerm()))
				player19.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 1000000000, 0));
			Player player20 = event.getPlayer();
			if (player20.hasPermission(Perms.HUNGERINCREASE.getPerm()))
				player20.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, 1000000000, 0));
			Player player21 = event.getPlayer();
			if (player21.hasPermission(Perms.SLOWDIG.getPerm()))
				player21.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 1000000000, 0));
			Player player22 = event.getPlayer();
			if (player22.hasPermission(Perms.WATERB.getPerm()))
				player22.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 1000000000, 0));
			Player player23 = event.getPlayer();
			if (player23.hasPermission(Perms.WITHER.getPerm()))
				player23.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 1000000000, 0));
			//--------------------------------------------------------------------
			Player player28 = event.getPlayer();
			if (player28.hasPermission(Perms.oneH.getPerm()))
				player28.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1000000000, 0));
			Player player29 = event.getPlayer();
			if (player29.hasPermission(Perms.twoH.getPerm()))
				player29.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1000000000, 1));
			Player player30 = event.getPlayer();
			if (player30.hasPermission(Perms.threeH.getPerm()))
				player30.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1000000000, 2));
			Player player31 = event.getPlayer();
			if (player31.hasPermission(Perms.fourH.getPerm()))
				player31.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1000000000, 3));
			Player player32 = event.getPlayer();
			if (player32.hasPermission(Perms.fiveH.getPerm()))
				player32.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1000000000, 4));
			Player player33 = event.getPlayer();
			if (player33.hasPermission(Perms.sixH.getPerm()))
				player33.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1000000000, 5));
			Player player34 = event.getPlayer();
			if (player34.hasPermission(Perms.sevenH.getPerm()))
				player34.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1000000000, 6));
			Player player35 = event.getPlayer();
			if (player35.hasPermission(Perms.eightH.getPerm()))
				player35.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1000000000, 7));
			Player player36 = event.getPlayer();
			if (player36.hasPermission(Perms.nineH.getPerm()))
				player36.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1000000000, 8));
			Player player37 = event.getPlayer();
			if (player37.hasPermission(Perms.tenH.getPerm()))
				player37.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1000000000, 9));
		}
	}
}


