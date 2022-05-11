import java.util.Scanner;

public class Account {
    private String customerCode;
    private String customerName;
    private int accNumber;
    private long amount = 0 ;

//Method
    public void Input(){
        Scanner input = new Scanner(System.in);
        //Enter name
           System.out.println("Enter your Name:");
           customerName=input.nextLine();
        //Enter Code
           System.out.println("Enter your code:");
           customerCode=input.nextLine();
           if (customerCode.length()<5){
               System.out.println("your code is not valid");
               System.out.println("Enter your code:");
               customerCode=input.nextLine();
           }
        //Enter account number
        System.out.println("Enter account number:");
           accNumber=input.nextInt();
           if (accNumber<100000 || accNumber>101000){
               System.out.println("your account number is not valid");
               System.out.println("Enter account number");
               accNumber=input.nextInt();
           }
           //Enter amount
        System.out.println("Enter your amount:");
           amount=input.nextLong();

    }
    public void depositAndWithdraw(){
        long money;
        int type;
        Scanner ip = new Scanner(System.in);
        System.out.println("What service do you want:");
        System.out.println("0.Deposit \t \t  1.Withdraw");
        type = ip.nextInt();
        System.out.println("Enter money: ");
        money = ip.nextLong();
        if (type == 0){
            System.out.println("You choose deposit "+ money+ " to your amount");
            System.out.println("Success");
            amount = money + amount;
            System.out.println("Your amount: "+ amount);
        }

        if (type == 1){
            if (money > amount){
                System.out.println("Non-sufficient funds");
            }
            else if (money <= amount) {
                System.out.println("You choose withdraw "+ money +" from your amount");
                System.out.println("Success");
                amount = amount - money;
                System.out.println("Amount: "+ amount);
            }
        }

        System.out.println("=====================================");
    }

}
