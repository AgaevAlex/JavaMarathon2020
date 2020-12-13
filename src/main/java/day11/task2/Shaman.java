package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer {
    private int physAtt, healTeammate = 30, healHimself = 50, magicAtt;

    public Shaman() {
        super.setHealth(100);
        super.setPhysDef(0.2);
        super.setMagicDef(0.2);
        physAtt = 10;
        magicAtt = 15;
    }


    @Override
    public void healHimself() {
        super.setHealth(getHealth() + healHimself);
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(getHealth() + healTeammate);
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
        return "Shaman{" +
                "health=" + super.getHealth() +
                '}';
    }
}
