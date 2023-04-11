package net.kaupenjoe.tutorialmod.item.client;

import net.kaupenjoe.tutorialmod.TutorialMod;
import net.kaupenjoe.tutorialmod.item.custom.AmethystArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class AmethystArmorModel extends GeoModel<AmethystArmorItem> {
    @Override
    public ResourceLocation getModelResource(AmethystArmorItem animatable) {
        return new ResourceLocation(TutorialMod.MOD_ID, "geo/amethyst_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(AmethystArmorItem animatable) {
        return new ResourceLocation(TutorialMod.MOD_ID, "textures/armor/amethyst_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(AmethystArmorItem animatable) {
        return new ResourceLocation(TutorialMod.MOD_ID, "animations/amethyst_armor.animation.json");
    }
}
