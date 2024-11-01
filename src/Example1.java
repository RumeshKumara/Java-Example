
   import java.util.Scanner;
    public class Example1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the day number (1-7): ");
           int day = scanner.nextInt(); // Replace with actual input from user

            switch (day) {
                case 1:
                    System.out.println("Monday - Start of the workweek!");
                    break;
                case 2:
                    System.out.println("Tuesday - Keep going!");
                    break;
                case 3:
                    System.out.println("Wednesday - Halfway there!");
                    break;
                case 4:
                    System.out.println("Thursday - Almost Friday!");
                    break;
                case 5:
                    System.out.println("Friday - Last day of the workweek!");
                    break;
                case 6:
                    System.out.println("Saturday - Time to relax!");
                    break;
                case 7:
                    System.out.println("Sunday - Rest and recharge!");
                    break;
                default:
                    System.out.println("Invalid day - Please enter a number between 1 and 7.");
                    break;
            }
            System.out.println("Bye!");
        }
    }


