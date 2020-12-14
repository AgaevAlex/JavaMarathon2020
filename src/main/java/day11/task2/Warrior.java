package day11.task2;

public class Warrior extends Hero {
    public Warrior() {
        super.setHealth(100);
        super.setPhysDef(0.8);
        super.setMagicDef(0);
        super.setPhysAtt(30);
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + super.getHealth() +
                '}';
    }
}