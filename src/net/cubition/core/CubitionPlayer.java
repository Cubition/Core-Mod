package net.cubition.core;

import net.cubition.api.Entity;
import net.cubition.api.FormattedMessage;
import net.cubition.api.Inventory;
import net.cubition.api.Location;
import net.cubition.api.Player;

public class CubitionPlayer implements Player {

	private String name;
	private int id;
	
	private int health = 20;
	private int foodLevel = 20;
	private Location location;
	
	private PlayerInventory inventory;
	
	@Override
	public void dispatchCommand(String cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispatchCommand(String cmd, String[] args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendMessage(String msg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendMessage(FormattedMessage msg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getMaxHealth() {
		return 20;
	}

	@Override
	public int getHealth() {
		return this.health;
	}

	@Override
	public void setHealth(int health) {
		this.health = health;
		// TODO send packet healthupdated
	}

	@Override
	public Location getLocation() {
		return location;
	}

	@Override
	public void teleport(Entity e) {
		teleport (e.getLocation());
	}

	@Override
	public void teleport(Location loc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove() {
		// NO
	}

	@Override
	public int getID() {
		return this.id;
	}

	@Override
	public int getFoodLevel() {
		return this.foodLevel;
	}

	@Override
	public void setFoodLevel(int level) {
		this.foodLevel = level;
		// SEND PACKET foodLevelUpdated
	}

	@Override
	public void kick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void kick(String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Inventory getInventory() {
		return inventory;
	}

}
