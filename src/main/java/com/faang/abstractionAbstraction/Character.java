package com.faang.abstractionAbstraction;

public abstract class Character {

    private String name;
    private Double power;
    private Double agility;
    private Double intellect;
    private Double health = 100D;

    public Character(String name) {
        this.name = name;
        this.power = 0D;
        this.agility = 0D;
        this.intellect = 0D;
    }

    public Character(String name, Double power, Double agility, Double intellect) {
        this.name = name;
        this.power = power;
        this.agility = agility;
        this.intellect = intellect;
    }

    public abstract void attack(Character target);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPower() {
        return power;
    }

    public void setPower(Double power) {
        this.power = power;
    }

    public Double getAgility() {
        return agility;
    }

    public void setAgility(Double agility) {
        this.agility = agility;
    }

    public Double getIntellect() {
        return intellect;
    }

    public void setIntellect(Double intellect) {
        this.intellect = intellect;
    }

    public Double getHealth() {
        return health;
    }

    public void setHealth(Double health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", agility=" + agility +
                ", intellect=" + intellect +
                ", health=" + health +
                '}';
    }

}
