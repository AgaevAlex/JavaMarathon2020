package day11.task2;

public abstract class Hero implements PhysAttack {
    private double health = 100, physDef, magicDef;
    private int physAtt;

    public void setPhysAtt(int physAtt) {
        this.physAtt = physAtt;
    }

    public double getPhysDef() {
        return physDef;
    }

    public void setPhysDef(double physDef) {
        this.physDef = physDef;
    }

    public double getMagicDef() {
        return magicDef;
    }

    public void setMagicDef(double magicDef) {
        this.magicDef = magicDef;
    }

    public void setHealth(double health) {
        if (health > 100) {
            this.health = 100;
        } else if (health < 0) {
            this.health = 0;
        } else {
            this.health = health;
        }
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - (physAtt - physAtt * hero.getPhysDef()));
    }


    public double getHealth() {
        return health;
    }


}
