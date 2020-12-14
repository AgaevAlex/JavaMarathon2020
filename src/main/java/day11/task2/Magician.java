package day11.task2;

public class Magician extends Hero implements MagicAttack {
    private int magicAtt;

    public Magician() {
        super.setPhysDef(0);
        super.setMagicDef(0.8);
        super.setPhysAtt(5);
        magicAtt = 20;
    }


    @Override
    public String toString() {
        return "Magician{" +
                "health=" + super.getHealth() +
                '}';
    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - (magicAtt - magicAtt * hero.getMagicDef()));
    }
}
