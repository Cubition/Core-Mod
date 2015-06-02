package net.cubition.core;

import java.util.ArrayList;

import net.cubition.api.Inventory;
import net.cubition.api.ItemStack;

public class PlayerInventory implements Inventory {

	private ArrayList<ItemStack> items = new ArrayList<ItemStack>();
	
	@Override
	public ItemStack[] getItems() {
		return items.toArray(new ItemStack[0]);
	}

	@Override
	public void addItems(ItemStack... items) {
		for(ItemStack item: items)
			this.items.add(item);
	}

	@Override
	public void removeItems(ItemStack... items) {
		for (ItemStack item: items)
			this.items.remove(item);
	}

}
