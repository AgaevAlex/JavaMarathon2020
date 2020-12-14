package day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> musicArtists;


    public List<MusicArtist> getMembers() {
        return musicArtists;
    }

    public MusicBand(String name, int year, List<MusicArtist> musicArtists) {
        this.name = name;
        this.year = year;
        this.musicArtists = musicArtists;
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
    public void transferMembers(MusicBand musicBandB) {
        for (MusicArtist musicArtist : musicBandB.getMembers()) {
            this.musicArtists.add(musicArtist);
        }
        musicBandB.musicArtists.clear();
    }

    public void printMembers() {
        System.out.println(musicArtists);
    }
}

