package day6;

public class Teacher {
    private String name;
    private String object;
    private String estimate;
    public Teacher (String name, String object){
        this.name=name;
        this.object=object;
    }public void evaluate(Student student){
        int mate = (int)(Math.random()*3+2);
        if (mate==2){
            estimate="Неудовлетворительно";
        }else if(mate==3){
            estimate="Удовлетворительно";
        } else if(mate==4){
            estimate="Хорошо";
        }else if(mate==5){
            estimate="Отлично";
        }
        System.out.println("Преподаватель "+name+" оценил студента с именем "+student.getName()+" по предмету "+object+" на оценку "+estimate+".");
    }
}
