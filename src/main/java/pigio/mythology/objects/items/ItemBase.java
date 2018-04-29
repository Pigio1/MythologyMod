package pigio.mythology.objects.items;

import net.minecraft.item.Item;
import pigio.mythology.Mythology;
import pigio.mythology.init.ItemInit;
import pigio.mythology.util.IHasModel;

public class ItemBase extends Item implements IHasModel 
{
	public ItemBase(String name) 
	{
        setUnlocalizedName(name);
        setRegistryName(name);
        
        ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModel() 
	{
		Mythology.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
