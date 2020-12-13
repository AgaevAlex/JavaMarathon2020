package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack {
    private int physAtt, magicAtt;

    public Magician() {
        super.setHealth(100);
        super.setPhysDef(0);
        super.setMagicDef(0.8);
        physAtt = 5;
        magicAtt = 20;
    }

    @Override
    public void mahicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - (magicAtt - magicAtt * hero.getMagicDef()));
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - (physAtt - physAtt * hero.getPhysDef()));
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + super.getHealth() +
                '}';
    }
}
