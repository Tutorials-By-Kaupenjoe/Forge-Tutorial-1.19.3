package net.kaupenjoe.tutorialmod.block;

import net.kaupenjoe.tutorialmod.TutorialMod;
import net.kaupenjoe.tutorialmod.block.custom.AnimatedBlock;
import net.kaupenjoe.tutorialmod.block.custom.ModFlammableRotatedPillarBlock;
import net.kaupenjoe.tutorialmod.item.ModItems;
import net.kaupenjoe.tutorialmod.worldgen.tree.EbonyTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TutorialMod.MOD_ID);

    public static final RegistryObject<Block> BLACK_OPAL_BLOCK = registerBlock("black_opal_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLACK_OPAL_ORE = registerBlock("black_opal_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops(), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> DEEPSLATE_BLACK_OPAL_ORE = registerBlock("deepslate_black_opal_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(8f).requiresCorrectToolForDrops(), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> NETHERRACK_BLACK_OPAL_ORE = registerBlock("netherrack_black_opal_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f).requiresCorrectToolForDrops(), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> ENDSTONE_BLACK_OPAL_ORE = registerBlock("endstone_black_opal_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(9f).requiresCorrectToolForDrops(), UniformInt.of(2, 6)));


    public static final RegistryObject<Block> EBONY_LOG = registerBlock("ebony_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)
                    .strength(5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> EBONY_WOOD = registerBlock("ebony_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)
                    .strength(5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> STRIPPED_EBONY_LOG = registerBlock("stripped_ebony_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)
                    .strength(5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> STRIPPED_EBONY_WOOD = registerBlock("stripped_ebony_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)
                    .strength(5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> EBONY_PLANKS = registerBlock("ebony_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(5f)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }
            });
    public static final RegistryObject<Block> EBONY_LEAVES = registerBlock("ebony_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }
            });


    public static final RegistryObject<Block> EBONY_SAPLING = registerBlock("ebony_sapling",
            () -> new SaplingBlock(new EbonyTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> ANIMATED_BLOCK = BLOCKS.register("animated_block",
            () -> new AnimatedBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()));



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
