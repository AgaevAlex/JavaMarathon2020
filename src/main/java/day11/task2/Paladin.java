package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer {
    private int physAtt;
    private int healHimself = 25, healTeammate = 10;

    public Paladin() {
        super.setHealth(100);
        super.setPhysDef(0.5);
        super.setMagicDef(0.2);
        physAtt = 15;
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
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - (physAtt - physAtt * hero.getPhysDef()));
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + super.getHealth() +
                '}';
    }
}
