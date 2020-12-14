package day11.task2;

public class Paladin extends Hero implements Healer {
        public Paladin() {
        super.setHealth(100);
        super.setPhysDef(0.5);
        super.setMagicDef(0.2);
        super.setPhysAtt(15);
        super.setHealHimself(25);
        super.setHealTeammate(10);
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + super.getHealth() +
                '}';
    }
}
