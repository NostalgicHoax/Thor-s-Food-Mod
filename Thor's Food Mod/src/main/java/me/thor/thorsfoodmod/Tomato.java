package me.thor.thorsfoodmod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.UseAction;

public class Tomato extends Item {

    public Tomato(Settings properties)
	{
		super(properties);
	}
    public UseAction getUseAction(ItemStack stack)
    {
        return UseAction.EAT;
    }

}