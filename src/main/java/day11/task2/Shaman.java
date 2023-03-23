package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer{
    public int healHimself=50;
    public int healTeammate=30;
    public Shaman(){
        this.physAtt=10;
        this.health=100;
        this.physDef=0.2;
        this.magicDef=0.2;
    }
    @Override
    public void magicalAttack(Hero hero) {
        int mageProtection =(int) (this.magicAtt* hero.magicDef);
        hero.health=hero.health - this.magicAtt+mageProtection;
        if(hero.health<=100&&hero.health>=0) {
            System.out.println(hero + "{health=" + hero.health + "}");
        }else if(hero.health<0){
            hero.health=0;
            System.out.println(hero + "{health=" + hero.health + "}");
        }
    }
    public String toString(){
        return "Shaman";
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
}
