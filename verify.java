import java.util.Scanner;

class verify extends bank {

    void input(){
        System.out.println("enter the account number = ");
            Scanner sc =new Scanner(System.in);
             cid = sc.nextInt();
            System.out.println("please enter the password = ");
             cpass = sc.nextInt();
           
    }
    void check(){
        if (id == cid && pass == cpass) {
            System.out.println("login Successfully");
            trasactions myTrasactions =new trasactions();
            myTrasactions.options();
        }else{
            System.out.println("Please enter the correct details ");
            input();
            check();
        }
    
    
}
}