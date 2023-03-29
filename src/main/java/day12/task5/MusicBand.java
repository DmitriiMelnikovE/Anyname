package day12.task5;


import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members){
        this.members=members;
        this.name=name;
        this.year=year;
    }
    public String toString(){
        return "Наименование: "+name+"; год "+year;
    }

    public int getYear() {
        return year;
    }


    public List<MusicArtist> getMembers() {
        return members;
    }

    public void setMembers(List<MusicArtist> members) {
        this.members = members;
    }
    public static void transferMembers(MusicBand one, MusicBand two){
        for (MusicArtist member: one.getMembers()){
            two.getMembers().add(member);
        }one.getMembers().clear();
    }
    public void printMembers(){
        System.out.println("Наименование группы: "+name+"; Участники: "+members);
    }
}
