package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> membersA = new ArrayList<>();
        List<MusicArtist> membersB = new ArrayList<>();
        membersA.add(new MusicArtist("Alex Agaev", 20));
        membersA.add(new MusicArtist("Kirill Patsay", 23));


        membersB.add(new MusicArtist("Anton Arazashvili", 44));
        membersB.add(new MusicArtist("Semen Krapivin", 33));

        MusicBand musicBandA = new MusicBand("teamA", 2019, membersA);
        MusicBand musicBandB = new MusicBand("teamB", 2020, membersB);
        musicBandA.printMembers();
        musicBandB.printMembers();
        MusicBand.transferMembers(musicBandA, musicBandB);
        musicBandA.printMembers();
        musicBandB.printMembers();
    }
}
