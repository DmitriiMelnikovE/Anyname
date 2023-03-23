package day11.task1;

public class Warehouse {
    private int countPickedOrders=0;
    private int countDeliveredOrders=0;


    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public String toString() {
        return "Собрано заказов: "+countPickedOrders + "; " + "Доставлено заказов: "+countDeliveredOrders;
    }
    public void countPickedOrdersPlusOne(){
        countPickedOrders++;
    }
    public void CountDeliveredOrdersPlusOne(){
        countDeliveredOrders++;
    }

}
