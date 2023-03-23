package day11.task1;

public class Picker implements Worker {
    private int salary;
    private boolean isPayed;
    Warehouse wh;

    public Picker(Warehouse wh) {
        this.wh = wh;
    }

    public int getSalary() {
        return salary;

    }

    public boolean getIsPayed() {
        return isPayed;
    }

    public String toString() {
        return "Зарплаты выплачено сборщику: " + salary;
    }

    public void doWork() {
        salary = salary + 80;
        wh.countPickedOrdersPlusOne();
    }

    public void bonus() {
        if (wh.getCountPickedOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
            return;
        }
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        salary += 70000;
        isPayed = true;


    }
}
