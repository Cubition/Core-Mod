package net.cubition.core;

import java.io.File;

import net.cubition.api.Material;
import net.cubition.api.MaterialManager;
import net.cubition.api.Mod;
import net.cubition.api.ModManager;

public class CubitionCoreMod implements Mod {

	@Override
	public File getDataFolder() {
		return new File (ModManager.getModFolder(), "cubition");
	}

	@Override
	public String getName() {
		return "Cubition";
	}

	@Override
	public String getAuthor() {
		return "Cubition Team";
	}

	@Override
	public void initialize() {
		Mod m = this;
		
		MaterialManager.register("stone", new Material () {
			public Mod getMod() { return m; }
			public String getTranslatableName(byte damage) { return "material.stone"; }
			public String getItemTextureName(byte damage) { return "stone"; }
		});
		
		MaterialManager.register("dirt", new Material () {
			public Mod getMod () { return m; }
			public String getTranslatableName (byte damage) { return "material.dirt"; }
			public String getItemTextureName(byte damage) { return "dirt"; }
		});
	}

	@Override
	public void deinitialize() {
		
	}

}
