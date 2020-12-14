package day11.task2;

public class Shaman extends Hero implements Healer {
    public Shaman() {
        super.setHealth(100);
        super.setPhysDef(0.2);
        super.setMagicDef(0.2);
        super.setPhysAtt(10);
        super.setMagicAtt(15);
        super.setHealHimself(50);
        super.setHealTeammate(30);
    }
    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + super.getHealth() +
                '}';
    }
}
