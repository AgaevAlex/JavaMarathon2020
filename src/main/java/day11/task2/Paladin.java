package day11.task2;

public class Paladin extends Hero implements Healer {
    private int healHimself, healTeammate;

    public Paladin() {
        super.setPhysDef(0.5);
        super.setMagicDef(0.2);
        super.setPhysAtt(15);
        healHimself = 25;
        healTeammate = 10;
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + super.getHealth() +
                '}';
    }

    @Override
    public void healHimself() {
        super.setHealth(getHealth() + healHimself);
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(getHealth() + healTeammate);
    }
}
