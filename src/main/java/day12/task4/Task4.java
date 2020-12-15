package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> membersA = new ArrayList<>();
        List<String> membersB = new ArrayList<>();
        membersA.add("Alex Agaev");
        membersA.add("Kirill Patsay");


        membersB.add("Anton Arazashvili");
        membersB.add("Semen Krapivin");

        MusicBand musicBandA = new MusicBand("teamA", 2019, membersA);
        MusicBand musicBandB = new MusicBand("teamB", 2020, membersB);
        musicBandA.printMembers();
        musicBandB.printMembers();
        MusicBand.transferMembers(musicBandA,musicBandB);
        musicBandA.printMembers();
        musicBandB.printMembers();
    }
}
