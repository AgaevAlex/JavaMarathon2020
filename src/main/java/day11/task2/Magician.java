package day11.task2;

public class Magician extends Hero {
    public Magician() {
        super.setHealth(100);
        super.setPhysDef(0);
        super.setMagicDef(0.8);
        super.setPhysAtt(5);
        super.setMagicAtt(20);
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + super.getHealth() +
                '}';
    }

}
