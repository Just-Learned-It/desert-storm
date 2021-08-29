package org.gara.desertstorm.mixin;

import java.util.List;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.treedecorator.TreeDecorator;
import com.google.common.collect.ImmutableList;

import org.gara.desertstorm.CoconutDecorator;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.Slice;

@Mixin(ConfiguredFeatures.class)
public class CoconutTrees {
	// JUNGLE_TREE
	@ModifyArg(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=jungle_tree")), at = @At(value = "INVOKE", target = "Lnet/minecraft/world/gen/feature/TreeFeatureConfig$Builder;decorators(Ljava/util/List;)Lnet/minecraft/world/gen/feature/TreeFeatureConfig$Builder;", ordinal = 0))
	private static List<TreeDecorator> changeJungleTree(List<TreeDecorator> original) {
		return ImmutableList.<TreeDecorator>builder().addAll(original).add(CoconutDecorator.INSTANCE).build();
	}

	// JUNGLE_TREE_NO_VINE
	@ModifyArg(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=jungle_tree_no_vine")), at = @At(value = "INVOKE", target = "Lnet/minecraft/world/gen/feature/TreeFeatureConfig$Builder;decorators(Ljava/util/List;)Lnet/minecraft/world/gen/feature/TreeFeatureConfig$Builder;", ordinal = 0))
	private static List<TreeDecorator> changeNoVineJungleTree(List<TreeDecorator> original) {
		return ImmutableList.<TreeDecorator>builder().addAll(original).add(CoconutDecorator.INSTANCE).build();
	}

	// MEGA_JUNGLE_TREE
	@ModifyArg(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=mega_jungle_tree")), at = @At(value = "INVOKE", target = "Lnet/minecraft/world/gen/feature/TreeFeatureConfig$Builder;decorators(Ljava/util/List;)Lnet/minecraft/world/gen/feature/TreeFeatureConfig$Builder;", ordinal = 0))
	private static List<TreeDecorator> changeMegaJungleTree(List<TreeDecorator> original) {
		return ImmutableList.<TreeDecorator>builder().addAll(original).add(CoconutDecorator.INSTANCE).build();
	}
}