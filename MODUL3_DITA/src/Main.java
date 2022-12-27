import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void printMenu(){
        System.out.println("=== Menu Program ===");
        System.out.println("1. Square");
        System.out.println("2. Circle");
        System.out.println("3. Trapezoid");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Calculation cal = new Calculation();
        boolean repeat = true;
        boolean report = false;
        do{
            try {
                printMenu();
                System.out.print("Select Menu : ");
                int menu = in.nextInt();
                switch (menu){
                    case 1 :
                        System.out.print("Enter the length of the side of the square : ");
                        double side = in.nextDouble();
                        cal.setSquare(side);
                        cal.run();
                        System.out.println();
                        System.out.println("The Calculation result : " + cal.getSquare());
                        break;
                        case 2:
                        System.out.print("Enter the radius of the circle : ");
                        double rad = in.nextDouble();
                        cal.setCircle(rad);
                        cal.run();
                        System.out.println("The Calculation result : " + cal.getCircle());
                        break;
                    case 3:
                        System.out.print("Enter the side of the base of the trapezoid : ");
                        double side_base = in.nextDouble();
                        System.out.print("Enter the upper side of the trapezoid : ");
                        double side_upper = in.nextDouble();
                        System.out.print("Enter the height of the trapezoid : ");
                        double height = in.nextDouble();
                        cal.setTrapezoid(side_base,side_upper,height);
                        cal.run();
                        System.out.println("The Calculation result : " + cal.getTrapezoid());
                        break;
                    case 0:
                        System.out.println("=== Program ENDED ===");
                    default:
                        System.out.println("\nOption not Available\n");
                        continue;
                }
                repeat = false;
            }catch (InputMismatchException e){
                System.out.println("==== Error: Input must be a number ====");
                break;
            }catch (IllegalArgumentException e){
                e.printStackTrace();
            }
        }while (repeat);
    }
}