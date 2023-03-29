package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> membersMusicBand1 = new ArrayList<>();
        membersMusicBand1.add(new MusicArtist("Дейв Гаан",60));
        membersMusicBand1.add(new MusicArtist("Мартин Гор",61));
        List<MusicArtist> membersMusicBand2 = new ArrayList<>();
        membersMusicBand2.add(new MusicArtist("Майкл Шинода", 46));
        membersMusicBand2.add(new MusicArtist("Честер Беннигтон", 41));
        MusicBand musicBand1 = new MusicBand("Depeche Mode", 1980, membersMusicBand1);
        MusicBand musicBand2 = new MusicBand("Linkin Park", 1996, membersMusicBand2);
        MusicBand.transferMembers(musicBand1, musicBand2);
        musicBand1.printMembers();
        musicBand2.printMembers();
    }
}
