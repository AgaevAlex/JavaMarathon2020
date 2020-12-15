package day12.task4;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;


    public List<String> getMembers() {
        return members;
    }

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }


    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ",  year=" + year +
                '}';
    }

    //немного не понял для чего делать метод статичным и передавать в него два объекта?
    public static void transferMembers(MusicBand musicBandA, MusicBand musicBandB) {
        musicBandB.members.addAll(musicBandA.members);
        musicBandA.members.clear();
    }

    public void printMembers() {
        System.out.println(members);
    }
}


