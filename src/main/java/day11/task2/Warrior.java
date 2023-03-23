package day11.task2;

public class Warrior extends Hero implements PhysAttack{

    public Warrior(){
        this.physAtt=30;
        this.health=100;
        this.physDef=0.8;
    }
    public String toString(){
        return "Warrior";
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
