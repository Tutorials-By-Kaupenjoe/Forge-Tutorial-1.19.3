package net.kaupenjoe.tutorialmod.block.entity.client;

import net.kaupenjoe.tutorialmod.block.entity.AnimatedBlockEntity;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class AnimatedBlockRenderer extends GeoBlockRenderer<AnimatedBlockEntity> {
    public AnimatedBlockRenderer(BlockEntityRendererProvider.Context context) {
        super(new AnimatedBlockModel());
    }
}
