public class Waiters implements Runnable{
    private final int customerID;
    private final int orderQty;
    static int foodPrice = 40000;

    public Waiters(int customerID, int orderQty){
        this.customerID = customerID;
        this.orderQty = orderQty;
    }

    public void run(){
        while(true){
            getFood();
            try {
                Thread.sleep(2);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public void orderInfo(){
        System.out.println("============================================================");
        System.out.println("Customer ID: " + this.customerID);
        System.out.println("Number of Food: " + this.orderQty);
        System.out.println("Total Price: " + this.orderQty*foodPrice);
        System.out.println("============================================================");
    }

    public void getFood(){
        synchronized(Restaurant.getLock()){
            System.out.println("Waiter: Food is ready to deliver");
            Restaurant R1 = new Restaurant();
            R1. setWaitingForPickup(false);

                
            if(Restaurant.getFoodNumber() == (this.orderQty + 1)){
                orderInfo();
                System.exit(0);
            }
            Restaurant.getLock().notifyAll();
            System.out.println("Waiter: Tell the restaurant to make another food\n");
        }
    }
}
