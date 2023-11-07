package net.flood.floodmod.item;

import net.flood.floodmod.FloodMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {
    public static void registerModItems(){
        //FloodMod.LOGGER.info("Mod items for " + FloodMod.MODID);
    }
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FloodMod.MODID);

    public static final RegistryObject<Item> DEBUGSQUARE = ITEMS.register("debugsquare",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> TESTSWORD = ITEMS.register("testsword",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);

    }
}
