package day12.task4;


import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members){
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


    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }
    public static void transferMembers(MusicBand one, MusicBand two){
        for (String member: one.getMembers()){
            two.getMembers().add(member);
        }one.getMembers().clear();
    }
    public void printMembers(){
        System.out.println("Наименование группы: "+name+"; Участники: "+members);
    }
}
