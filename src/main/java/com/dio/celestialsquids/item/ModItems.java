package com.dio.celestialsquids.item;

import com.dio.celestialsquids.CelestialSquids;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CelestialSquids.MOD_ID);

public static final DeferredItem<Item> EXAMPLE_ESSENCE = ITEMS.register("example_essence",
        () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
