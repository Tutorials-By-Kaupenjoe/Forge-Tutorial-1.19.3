package net.kaupenjoe.tutorialmod.item.client;

import net.kaupenjoe.tutorialmod.item.custom.AmethystArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class AmethystArmorRenderer extends GeoArmorRenderer<AmethystArmorItem> {
    public AmethystArmorRenderer() {
        super(new AmethystArmorModel());
    }
}
