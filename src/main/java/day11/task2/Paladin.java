package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer {
    public int healHimself=25;
    public int healTeammate=10;
    public Paladin(){
        this.physAtt=15;
        this.health=100;
        this.physDef=0.5;
        this.magicDef=0.2;
    }

    public String toString(){
        return "Paladin";
    }

    @Override
    public void healHimself() {
        this.health=this.health+healHimself;
        if(this.health<=100) {
            System.out.println("Paladin" + "{health=" + this.health + "}");
        }else if(this.health>100){
            this.health=100;
            System.out.println("Paladin" + "{health=" + this.health + "}");
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.health= hero.health+healTeammate;
        if (hero.health<=100) {
            System.out.println(hero + "{health=" + hero.health + "}");
        }else if(hero.health>100){
            hero.health=100;
            System.out.println(hero + "{health=" + hero.health + "}");
        }
    }

    @Override
    public void physicalAttack(Hero hero) {
        int physProtection = (int) (this.physAtt * hero.physDef);
        hero.health = hero.health - this.physAtt + physProtection;
        if(hero.health<=100&&hero.health>=0) {
            System.out.println(hero + "{health=" + hero.health + "}");
        }else if(hero.health<0){
            hero.health=0;
            System.out.println(hero + "{health=" + hero.health + "}");
        }
    }
}
