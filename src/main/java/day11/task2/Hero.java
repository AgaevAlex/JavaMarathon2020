package day11.task2;

public abstract class Hero implements PhysAttack, MagicAttack, Healer {
    private double health, physDef, magicDef;
    private int physAtt, magicAtt, healHimself, healTeammate;


    public void setMagicAtt(int magicAtt) {
        this.magicAtt = magicAtt;
    }


    public void setPhysAtt(int physAtt) {
        this.physAtt = physAtt;
    }


    public void setHealHimself(int healHimself) {
        this.healHimself = healHimself;
    }


    public void setHealTeammate(int healTeammate) {
        this.healTeammate = healTeammate;
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
    public void healHimself() {
        health += healHimself;
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(hero.health + this.health);
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - (physAtt - physAtt * hero.getPhysDef()));
    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - (magicAtt - magicAtt * hero.getMagicDef()));
    }

    public double getHealth() {
        return health;
    }


}
