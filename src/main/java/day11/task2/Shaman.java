package day11.task2;

public class Shaman extends Hero implements Healer {
    private int healTeammate, healHimself, magicAtt;

    public Shaman() {
        super.setPhysDef(0.2);
        super.setMagicDef(0.2);
        super.setPhysAtt(10);
        magicAtt = 15;
        healTeammate = 30;
        healHimself = 50;
    }

    @Override
    public String toString() {
        return "Shaman{" +
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
