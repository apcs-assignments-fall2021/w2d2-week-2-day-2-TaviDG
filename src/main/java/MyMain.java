import java.util.Scanner;

public class MyMain {
    // Write a method that asks the user to input a double between 0.0 and 1000000.0
    // Your method should keep asking them until they type in a valid value
    // The method returns the final double they type in

    // scan.nextDouble() might be useful here
    public static double inputDouble() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type in a number between 0.0 and 1000000.0");
        double num = scan.nextDouble();
        while (num<0.0 || num>1000000.0) {
            System.out.println("Type a valid number");
            num = scan.nextDouble();
        }

        return num;
    }

    // Takes a double money as input and returns the number of quarters that we
    // can return in change
    // You should use a while loop!
    public static int numQuarters(double money) {
        int quarters=0;
        while (money>=0.25){
            money=money-0.25;
            quarters++;
        }
        if (Math.abs(money-0.25)<0.0001) {
            quarters++;
        }
        return (quarters);
    }

    // Takes a double money as input and returns the number of dimes that we
    // can return in change
    // You should use a while loop!
    public static int numDimes(double money) {
        // REPLACE THIS WITH YOUR CODE
        int dimes=0;
        while (money>=0.1){
            money=money-0.1;
            dimes++;
        }
        if (Math.abs(money-0.1)<0.0001) {
            dimes++;
        }
        return dimes;
    }

    // Takes a double money as input and returns the number of nickels that we
    // can return in change
    // You should use a while loop!
    public static int numNickels(double money) {
        // REPLACE THIS WITH YOUR CODE
        int nickles=0;
        while (money>=0.05){
            money=money-0.05;
            nickles++;
        }
        if (Math.abs(money-0.05)<0.0001) {
            nickles++;
        }
        return nickles;
    }

    // Takes a double money as input and returns the number of pennies that we
    // can return in change
    // You should use a while loop!
    public static int numPennies(double money) {
        int pennies=0;
        while (money>=0.01){
            money=money-0.01;
            pennies++;
        }
        if (Math.abs(money-0.01)<0.0001) {
            pennies++;
        }
        return pennies;
    }
    public static boolean keepGoing(){
        System.out.println("Do you wanna keep going? (y/n)");
        Scanner scan = new Scanner(System.in);
        String input=scan.next();
        if (input.equals("y")){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean start = true;
        // You should test inputDouble yourself!
        while (start) {
            double d = inputDouble();
            int quarters = numQuarters(d);
            int dimes = numDimes(d-0.25*quarters);
            int nickles = numNickels(d-0.25*quarters-0.1*dimes);
            int pennies = numPennies(d-0.25*quarters-0.1*dimes-0.05*nickles);
            System.out.println("your change would be "+ quarters+" quarters, "+ dimes+ " dimes, "+ nickles+ " nickles, and " + pennies + " pennies");
            start = keepGoing();
        }

//        // Some code to test numQuarters
//        System.out.println("\nnumQuarters tests:");
//        System.out.println("1.25 in quarters would be: " + numQuarters(1.25) + " quarters."); // 5
//        System.out.println("10.55 in quarters would be: " + numQuarters(10.55) + " quarters."); // 42
//        System.out.println("1000000.20 in quarters would be: " + numQuarters(1000000.20) + " quarters."); //4000000
//
//        // Some code to test numDimes
//        System.out.println("\nnumDimes tests:");
//        System.out.println("1.20 in dimes would be: " + numDimes(1.20) + " dimes."); // 12
//        System.out.println("120.13 in dimes would be: " + numDimes(120.13) + " dimes."); //1201
//        System.out.println("150.25 in dimes would be: " + numDimes(150.25) + " dimes."); //1502
//
//        System.out.println(numNickels(1.0));
//        System.out.println(numPennies(1.0));

        scan.close();
    }
}