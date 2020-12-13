package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Worker worker1 = new Courier(warehouse);
        Worker worker2 = new Picker(warehouse);
        businessProcess(worker1);
        businessProcess(worker2);
        System.out.println(worker1.toString());
        System.out.println(worker2.toString());
        System.out.println("Warehouse 1 " + warehouse.toString());
        System.out.println();
        System.out.println();


        Warehouse warehouse2 = new Warehouse();
        Worker worker3 = new Courier(warehouse2);
        Worker worker4 = new Picker(warehouse2);
        worker3.doWork();
        worker4.doWork();
        System.out.println("Warehouse 1 " + warehouse.toString());
        System.out.println("Warehouse 2 " + warehouse2.toString());
    }

    static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}
