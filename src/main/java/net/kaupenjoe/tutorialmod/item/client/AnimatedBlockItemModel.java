package net.kaupenjoe.tutorialmod.item.client;

import net.kaupenjoe.tutorialmod.TutorialMod;
import net.kaupenjoe.tutorialmod.item.custom.AnimatedBlockItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class AnimatedBlockItemModel extends GeoModel<AnimatedBlockItem> {
    @Override
    public ResourceLocation getModelResource(AnimatedBlockItem animatable) {
        return new ResourceLocation(TutorialMod.MOD_ID, "geo/animated_block.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(AnimatedBlockItem animatable) {
        return new ResourceLocation(TutorialMod.MOD_ID, "textures/block/animated_block.png");
    }

    @Override
    public ResourceLocation getAnimationResource(AnimatedBlockItem animatable) {
        return new ResourceLocation(TutorialMod.MOD_ID, "animations/animated_block.animation.json");
    }
}
