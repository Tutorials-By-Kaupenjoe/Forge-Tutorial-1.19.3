package net.kaupenjoe.tutorialmod.item.client;

import net.kaupenjoe.tutorialmod.item.custom.AnimatedBlockItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class AnimatedBlockItemRenderer extends GeoItemRenderer<AnimatedBlockItem> {
    public AnimatedBlockItemRenderer() {
        super(new AnimatedBlockItemModel());
    }
}
