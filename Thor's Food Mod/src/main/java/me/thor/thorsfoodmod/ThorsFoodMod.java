package me.thor.thorsfoodmod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ThorsFoodMod implements ModInitializer {
	
	public static final Item tomato = new Tomato(new Item.Settings().group(ItemGroup.FOOD));
	
	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("tfm", "tomato"), tomato);
	}
}
