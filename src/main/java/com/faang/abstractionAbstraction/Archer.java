package com.faang.abstractionAbstraction;

public class Archer extends Character {

    public Archer(String name) {
        super(name, 3D, 10D, 5D);
    }

    @Override
    public void attack(Character target) {
        target.setHealth(target.getHealth() - this.getAgility());
    }


}
