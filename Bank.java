import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {
    Scanner sc = new Scanner(System.in);
    int id;

    private List<Customer> customers;

    public Bank() {
        customers = new ArrayList<>();
    }

    // add Customer
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    // login

    public boolean Login() {

        System.out.print("Enter user Name  :");
        String userName = sc.nextLine().trim();

        System.out.print("Enter Password :");
        String pass = sc.nextLine().trim();
        for (Customer c : customers) {

            if (c.getuserName().equals(userName) && c.getPassword().equals(pass)) {
                System.out.println(" login succesfull");
                id = c.getId();
                return true;

            }

        }
        System.out.println("Enter Valid UserName Or Password ?");

        return false;

    }

    // add money

    public void addMoney() {
        System.out.println("Enter Money  to add the Account  :");
        double amt = sc.nextDouble();

        double bal = customers.get(id).getBalance() + amt;
        customers.get(id).setBalance(bal);

        // for(Customer c : customers){
        // =c.getBalance()+ amt;

        // }
    }

    // withdraw money

    public void withdrawMoney() {

        System.out.print("Enter the balance you want to withdraw :");

        double withdraw = sc.nextDouble();

        for (Customer c : customers) {
            if (withdraw < c.getBalance()) {
                // double newbal = c.getBalance() - withdraw;
                // c.setBalance(newbal);
                double newBAl = customers.get(id).getBalance() - withdraw;
                customers.get(id).setBalance(newBAl);
                return;

            }

        }

        System.out.println("Enter  valid balance to withdraw ");

    }
    // chaeck balance

    public void CheckBal() {

        // for (Customer c : customers) {
            System.out.print("Balance Avlable  Are : " + customers.get(id).getBalance());
        //     break;
        // }

    }

}