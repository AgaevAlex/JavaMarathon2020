package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> musicBands = new ArrayList<>();

        Random random = new Random();
        musicBands.add(new MusicBand("Green Day", 1986));
        musicBands.add(new MusicBand("Nirvana", 1987));
        musicBands.add(new MusicBand("Red Hot Chili Peppers", 1983));
        musicBands.add(new MusicBand("Bring Me the Horizon", 2004));
        musicBands.add(new MusicBand("Five Finger Death Punch", 2005));
        musicBands.add(new MusicBand("OneRepublic", 2002));
        musicBands.add(new MusicBand("Linkin Park", 1999));
        musicBands.add(new MusicBand("Fever 333", 2017));
        musicBands.add(new MusicBand("Aria", 1985));
        musicBands.add(new MusicBand("Bullet for My Valentine", 1998));
        musicBands.add(new MusicBand("Three Days Grace", 1992));
        System.out.println(musicBands.toString());
        //кастом рандомного списка
        for (int i = 0; i < 10; i++) {
            int rand = random.nextInt(10);
            MusicBand musicBand2 = musicBands.get(i);
            musicBands.set(i, musicBands.get(rand));
            musicBands.set(rand, musicBand2);
        }
        System.out.println(musicBands.toString());
        System.out.println(groupsAfter2000(musicBands).toString());
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> result = new ArrayList<>();
        for (MusicBand band : bands) {
            if (band.getYear() >= 2000) {
                result.add(band);
            }
        }
        return result;
    }

}

