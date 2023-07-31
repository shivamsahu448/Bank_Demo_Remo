import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Customer Cust1 = new Customer("SHIVAM", "Shivam@123", "123", "7310019044", 0, "SAVING");
        Bank bank = new Bank();
        bank.addCustomer(Cust1);

        boolean login = false;

        while (true) {
            System.out.println("\n    Choose the correct     ");
            System.out.println("|-----------------------------|");
            System.out.println("| 1 | Add Accounts            |");
            System.out.println("| 2 | Login Account           |");
            System.out.println("| 3 | Add Money               |");
            System.out.println("| 4 | Show All Account Details|");
            System.out.println("| 5 | withdraw Money          |");
            System.out.println("| 6 | Check  Account  balance |");
            System.out.println("| 7 | Exit                    |");
            System.out.println("------------------------------");
            System.out.print("\nEnter your choice: ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            switch (num) {

                case 1:
                sc.nextLine();

                    System.out.print("Enter Account Holde Name  : ");
                    String name1 = sc.nextLine();

                    System.out.print("Enter  userName : ");
                    String userName1 = sc.nextLine();
                    

                    System.out.print("Enter  password  :  ");
                    String pass1 = sc.nextLine();

                    System.out.print("Enter   number  : ");
                    String number = sc.nextLine();
              

                    System.out.print("Enter   balance :  ");
                    double bal = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter   Account type :  ");
                    String type = sc.nextLine();

                    Customer Cust = new Customer(name1, userName1, pass1, number, bal, type);

                    bank.addCustomer(Cust);

                    break;

                case 2:
                    login = bank.Login();

                    break;

                case 3:

                    if (login) {

                        bank.addMoney();
                    } else {
                        System.out.println("Please Login First ");
                    }

                    break;

                case 4:
                    if (login) {
                        List<Customer> list = bank.getCustomers();
                        System.out.println("List of All Customers  : : ");
                        System.out.println(list.toString());
                        

                    } else {
                        System.out.println("Please Login First ");
                    }

                    break;

                case 5:

                if (login) {

                        bank.withdrawMoney();
                    } else {
                        System.out.println("Please Login First ");
                    }

                

                    break;

                case 6:

                if (login) {

                        bank.CheckBal();
                    } else {
                        System.out.println("Please Login First ");
                    }


                    break;

            
                case 7:

                    return;

                default:
                    System.out.println("Invalid  Value !");
            }
            sc.nextLine();
            if (num == 7)
                break;
        }
    }
}