package com.enginnx.aoepaintings.painting;


import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModPaintings {

    public static final DeferredRegister<PaintingVariant> REGISTER;
    public static final DeferredHolder<PaintingVariant, PaintingVariant> GRADIENT;

    static {
        REGISTER = DeferredRegister.create(Registries.PAINTING_VARIANT, "aoepaintings");
        GRADIENT = REGISTER.register("gradient", () -> {
            return new PaintingVariant(112, 64, ResourceLocation.fromNamespaceAndPath("aoepaintings", "gradient"));
        });
    }

    public static void register(IEventBus eventBus) {
        REGISTER.register(eventBus);
    }
}
