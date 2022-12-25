import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        Restaurant R2 = new Restaurant();
        int customerID, orderQty;
        try{
            System.out.print("Enter Customer ID: ");
            customerID = input.nextInt();

            System.out.print("Enter how much food to made: ");
            orderQty = input.nextInt();

            Thread th1 = new Thread(R2);
            Waiters waiterss = new Waiters(customerID, orderQty);
            Thread th2 = new Thread(waiterss);
                    
            th1.start();
            th2.start();
            th1.join();
            th2.join();

        } catch (Exception e){
            System.out.println("Input must be Integer");
        }
        
    }
}

