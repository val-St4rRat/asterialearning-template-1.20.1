package asteria.stars.testmod.item;

import asteria.stars.testmod.AsteriaLearning;
import asteria.stars.testmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ASTERIA = Registry.register(Registries.ITEM_GROUP,
            new Identifier(AsteriaLearning.MOD_ID, "asteria"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.asteria"))
                    .icon(() -> new ItemStack(ModItems.ASTERIA_TEAR)).entries((displayContext, entries) -> {
                        entries.add(ModItems.THEIASTEEL);
                        entries.add(ModItems.ASTERIA_TEAR);
                        entries.add(ModItems.CONTAINED_VIOLENCE);

                        entries.add(ModBlocks.THEIASTEEL_PLATING);

                        entries.add(ModItems.THEIABLADE);

                    }).build());


    public static void registerItemGroups() {
        AsteriaLearning.LOGGER.info("Registring Item Groups for " +AsteriaLearning.MOD_ID);
    }
}
