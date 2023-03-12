package day7;

public class Task2 {
    public static void main(String[] args) {
        Player player1 = new Player((int)(Math.random()*10+90));
        Player player2 = new Player((int)(Math.random()*10+90));
        Player player3 = new Player((int)(Math.random()*10+90));
        Player player4 = new Player((int)(Math.random()*10+90));
        Player player5 = new Player((int)(Math.random()*10+90));
        Player player6 = new Player((int)(Math.random()*10+90));
        Player player7 = new Player((int)(Math.random()*10+90));
        System.out.println(Player.getCountPlayers());
        Player.info();
        System.out.println(player1.getStamina());
        for (int i=100;i>0;i--){
            player1.run();
            if(player1.getStamina()==0){
                break;
            }
        }System.out.println(player1.getStamina());
        System.out.println(Player.getCountPlayers());
    }
}
