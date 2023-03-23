package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack{
    public Magician(){
        this.physDef=0;
        this.physAtt=5;
        this.health=100;
        this.magicDef=0.8;
        this.magicAtt=20;
    }
    public String toString(){
        return "Magician";
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
}
