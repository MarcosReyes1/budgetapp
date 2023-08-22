import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Checking myChecking = new Checking();
        Saving mySaving = new Saving();
        Scanner myObj = new Scanner(System.in);
        User user1 = new User();
        System.out.println("Enter username: ");
        String userName = myObj.nextLine();
        user1.setName(userName);
        System.out.println("Username is: " + user1.getName() + "\n");
        System.out.println("Enter an option to continue:\n" +
                "1. Check Balance\n" +
                "2. Add paycheck\n" +
                "3. Deduct money from balance\n" +
                "4. Update credit card balance\n" +
                "5. Use 50-30-20 algorithm on paycheck\n");
        int option = Integer.parseInt(myObj.nextLine());
        switch(option) {
            case 1:
                System.out.println("Which account do you want to access?\n" +
                        "1. Checking\n" +
                        "2. Savings\n" +
                        "3. Credit card\n");
                int choice = Integer.parseInt(myObj.nextLine());
                if (choice == 1) {
                    myChecking.displayBalance();
                }
                break;
            case 2:
                System.out.println("add paycheck");
                break;
            case 3:
                System.out.println("Deduct money from balance");
                break;
            case 4:
                System.out.println("Update credit card balance");
                break;
            case 5:
                System.out.println("Use 50-30-20 algorithm on paycheck");
                break;
            default:
                System.out.println("User entered invalid input");
        }
    }
}