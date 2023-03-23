package day11.task1;

public class Courier implements Worker{
    private int salary;
    private boolean isPayed;
    Warehouse wh;
    public Courier (Warehouse wh){
        this.wh=wh;
    }


    public String toString(){
        return "Зарплаты выплачено курьеру: "+salary+"";
    }
    public void doWork(){
        salary=salary+100;
        wh.CountDeliveredOrdersPlusOne();
    }
    public void bonus(){
        if (wh.getCountDeliveredOrders()<10000){
            System.out.println("Бонус пока не доступен");
            return;
        }
        if (isPayed){
            System.out.println("Бонус уже был выплачен");
            return;
        }
        salary+=50000;
        isPayed=true;
    }
}
