import java.util.Scanner;

class trasactions extends bank {
    Scanner sc = new Scanner(System.in);

    void options() {
        int cinput;
        String options="1. balance enquary\n"+"2. deposit\n"+"3. withdraw\n"+"4. exit\n"+"please select the type of transaction :\n";
        System.out.println(options);

        // System.out.println("1. balance enquary");
        // System.out.println("2. deposit");
        // System.out.println("3. withdraw");
        // System.out.println("4. exit");
        // System.out.println("please select the type of transaction :");
        cinput = sc.nextInt();

        // switch
        switch (cinput) {
            case 1:
                enquary();
                options();
                break;
            case 2:
                deposit();
                options();
                break;
            case 3:
                withdrow();
                options();
                break;
            case 4:
                exit();
                break;
            default: 
                break;
        }
    }

    // deposit
    void deposit() {

        int amount;
        System.out.println("please enter the amount to deposit = ");

        amount = sc.nextInt();
        balance = balance + amount;
        System.out.println("the updated balance is =" + balance);

    }

    // withdrow function

    void withdrow() {
        System.out.println("enter the amount for withdawal =");
        int amount = sc.nextInt();
        if (amount <= balance) {
            balance -= amount;
            System.out.println("amount has been withdraled");
            System.out.println("updated balance is = " + balance);
        } else {
            System.out.println("please enter the amount less than or equal to account balance");
        }

    }

    // balance enquary
    void enquary() {
        System.out.println("Your account balance is : " + balance);
    }

    // exit
    void exit() {
        System.out.println(" thank you for banking");
    }

}
