package com.builtbroken.armory.aerocycle;

import com.builtbroken.armory.aerocycle.entity.EntityAerocycle;
import com.builtbroken.armory.aerocycle.item.ItemAerocycle;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @see <a href="https://github.com/BuiltBrokenModding/VoltzEngine/blob/development/license.md">License</a> for what you can and can't do with the code.
 * Created by Dark(DarkGuardsman, Robert) on 1/5/2019.
 */
@Mod(modid = Aerocycle.DOMAIN, name = "Armory-HZ-1-Aerocycle", version = Aerocycle.VERSION)
@Mod.EventBusSubscriber
public class Aerocycle
{
    public static final String DOMAIN = "armoryaerocycle";
    public static final String PREFIX = DOMAIN + ":";

    public static final String MAJOR_VERSION = "@MAJOR@";
    public static final String MINOR_VERSION = "@MINOR@";
    public static final String REVISION_VERSION = "@REVIS@";
    public static final String BUILD_VERSION = "@BUILD@";
    public static final String MC_VERSION = "@MC@";
    public static final String VERSION = MC_VERSION + "-" + MAJOR_VERSION + "." + MINOR_VERSION + "." + REVISION_VERSION + "." + BUILD_VERSION;

    public static Item itemAreocycle;

    protected static Logger logger = LogManager.getLogger(DOMAIN);


    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().register(itemAreocycle = new ItemAerocycle());
    }

    @SubscribeEvent
    public static void registerEntity(RegistryEvent.Register<EntityEntry> event)
    {
        EntityEntryBuilder builder = EntityEntryBuilder.create();
        builder.name(PREFIX + "aerocycle");
        builder.id(new ResourceLocation(DOMAIN, "aerocycle"), 0);
        builder.tracker(128, 1, true);
        builder.entity(EntityAerocycle.class);
        event.getRegistry().register(builder.build());
    }
}
