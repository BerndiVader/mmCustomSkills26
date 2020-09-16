package com.gmail.berndivader.mythicmobsext.volatilecode.v1_16_R2.pathfindergoals;

import net.minecraft.server.v1_16_R2.EntityCreature;
import net.minecraft.server.v1_16_R2.EntityLiving;
import net.minecraft.server.v1_16_R2.PathfinderGoalMeleeAttack;

public class PathfinderGoalMeleeRangeAttack extends PathfinderGoalMeleeAttack {
	protected float range;

	public PathfinderGoalMeleeRangeAttack(EntityCreature entityCreature, double d, boolean b, float range) {
		super(entityCreature, d, b);
		this.range = range;
	}

	@Override
	protected double a(EntityLiving entity) {
		return (double) (this.a.getWidth() * this.range * this.a.getWidth() * this.range + entity.getWidth());
	}
}
