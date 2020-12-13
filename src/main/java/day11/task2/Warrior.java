package day11.task2;

public class Warrior extends Hero implements PhysAttack {
    private int physAtt;

    public Warrior() {
        super.setHealth(100);
        super.setPhysDef(0.8);
        super.setMagicDef(0);
        physAtt = 30;
    }


    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - (physAtt - physAtt * hero.getPhysDef()));
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + super.getHealth() +
                '}';
    }
}