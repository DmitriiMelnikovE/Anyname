package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> membersMusicBand1 = new ArrayList<>();
        membersMusicBand1.add("Дейв Гаан");
        membersMusicBand1.add("Мартин Гор");
        List<String> membersMusicBand2 = new ArrayList<>();
        membersMusicBand2.add("Майкл Шинода");
        membersMusicBand2.add("Честер Беннигтон");
        MusicBand musicBand1 = new MusicBand("Depeche Mode", 1980, membersMusicBand1);
        MusicBand musicBand2 = new MusicBand("Linkin Park", 1996, membersMusicBand2);
        MusicBand.transferMembers(musicBand1, musicBand2);
        musicBand2.printMembers();
        musicBand1.printMembers();

    }
}
