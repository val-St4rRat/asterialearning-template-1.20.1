package asteria.stars.testmod.item;

import asteria.stars.testmod.AsteriaLearning;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ASTERIA_TEAR = registerItem("asteria_tear", new Item(new FabricItemSettings()));
    public static final Item THEIASTEEL = registerItem("theiasteel", new Item(new FabricItemSettings()));
    public static final Item CONTAINED_VIOLENCE = registerItem("contained_violence", new Item(new FabricItemSettings()));

    public static final Item THEIABLADE = registerItem("theiablade",
            new SwordItem(ModToolMaterial.THEIASTEEL, 6, 3f, new FabricItemSettings()));

    private static void AddItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(ASTERIA_TEAR);
        entries.add(THEIASTEEL);
        entries.add(CONTAINED_VIOLENCE);
        entries.add(THEIABLADE);
    }


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(AsteriaLearning.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AsteriaLearning.LOGGER.info("Registering Mod Items for " + AsteriaLearning.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::AddItemsToIngredientTabItemGroup);
    }
}
