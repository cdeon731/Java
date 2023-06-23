import java.util.ArrayList;

public class CafeUtil {

    // Write a method that sums together every consecutive integer from 1 to 10 and
    // returns the sum.
    public int getStreakGoal() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }

    // Given an array of item prices from an order, sum all of the prices in the
    // array and return the total.
    public double getOrderTotal(double[] order) {
        double sum = 0;
        for (double prices : order) {
            sum += prices;
        }
        return sum;
    }

    // Given an ArrayList of menu items (strings), print out each index and menu
    // item.
    public void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.printf("% - %s \n", i, menuItems.get(i));
        }
    }

    // Print a string that asks for customers name, greets customer and informs you
    // of how many people are in line in front of you with an arraylist of their
    // names.
    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name: ");
        String userName = System.console().readLine();
        System.out.printf("Hello, %s! ", userName);
        System.out.printf("There is %s people in front of you. \n", customers.size());
        customers.add(userName);
        System.out.println(customers);
    }

    // Create a method that prints the cost for buying 1 product, then the price for
    // buying 2, then for 3.. and so on, up to the max.
    public void printPriceChart(String productName, double price, int maxQuantity) {
        System.out.printf("%s: \n", productName);
        for (int i = 1; i <= maxQuantity; i++) {
            System.out.printf("%s - $%.2f \n", i, i * price);
        }
        System.out.println(".........................");
    }

    // Display Coffee Menu
    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> priceIndex) {
        if (menuItems.size() != priceIndex.size()) {
            return false;
        }
        for (int id = 0; id < menuItems.size(); id++) {
            System.out.printf("%s %s -- $%.2f \n", id, menuItems.get(id), priceIndex.get(id));
        }
        return true;
    }

    /*
     * Sensei bonus:
     * Make a method addCustomers where a barista can enter multiple customers.
     * Hint: You can use a while loop and ask the user to type q when they are
     * finished entering names.
     */
    public void addCustomers(ArrayList<String> customerList) {
        boolean finished = false;
        String input;
        while (!finished) {
            System.out.println("Please enter a customer name or press Q to quit:");
            input = System.console().readLine();
            if (input.equals("Q")) {
                finished = true;
                return;
            }
            customerList.add(input);
            System.out.printf("%s was added to the list.", input);
            System.out.println(customerList);
        }
    }

}
