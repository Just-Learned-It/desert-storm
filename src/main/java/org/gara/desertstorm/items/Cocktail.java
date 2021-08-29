package org.gara.desertstorm.items;

import java.util.List;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PotionItem;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.gara.desertstorm.Utils;

public class Cocktail extends PotionItem {
    public final String identifier;
    public Cocktail(String id, Settings properties) {
        super(properties);
        identifier = id;
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World level, List<Text> list, TooltipContext tooltipFlag) {
        // default white text
        TranslatableText tip = Utils.GetTooltip(this.identifier);
        if (!tip.getString().isEmpty()) {
            list.add(tip.formatted(Formatting.WHITE));
        }
    }
}