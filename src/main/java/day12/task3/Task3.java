package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand musicBand1 = new MusicBand("Depeche Mode", 1980);
        MusicBand musicBand2 = new MusicBand("Linkin Park", 1996);
        MusicBand musicBand3 = new MusicBand("Queen", 1970);
        MusicBand musicBand4 = new MusicBand("A-ha", 1982);
        MusicBand musicBand5 = new MusicBand("Nirvana", 1987);
        MusicBand musicBand6 = new MusicBand("Beatles", 1960);
        MusicBand musicBand7 = new MusicBand("Imagine Dragons", 2008);
        MusicBand musicBand8 = new MusicBand("Thirty Seconds To Mars", 1998);
        MusicBand musicBand9 = new MusicBand("Twenty One Pilots", 2009);
        MusicBand musicBand10 = new MusicBand("Little Big", 2013);
        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(musicBand1);
        musicBands.add(musicBand2);
        musicBands.add(musicBand3);
        musicBands.add(musicBand4);
        musicBands.add(musicBand5);
        musicBands.add(musicBand6);
        musicBands.add(musicBand7);
        musicBands.add(musicBand8);
        musicBands.add(musicBand9);
        musicBands.add(musicBand10);
        Collections.shuffle(musicBands);
        System.out.println(musicBands);
        groupsAfter2000(musicBands);

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> musicBands) {
        List<MusicBand> musicBandsAfter2000 = new ArrayList<>();
        for (MusicBand MB : musicBands) {
            if (MB.getYear() > 2000) {
                musicBandsAfter2000.add(MB);
            }
        }
        System.out.println(musicBandsAfter2000);
        return musicBands;
    }
}
