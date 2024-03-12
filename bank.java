import java.util.*;
class account{
    private String accountHolder;
    private int balance;
    public account(String accountHolder, int balance){
        this.accountHolder=accountHolder;
        this.balance=balance;
    }
    public int getbalance(){
        return balance;
    }
    public void deposit(int amount){
        if(amount>0){
            balance=balance+amount;
            System.out.println("New Balance " + balance);
        }
        else{
            System.out.println("Invalid deposit");
        }
    }
    public void withdraw(int amount){
        if(0<amount && amount<=balance){
            balance=balance- amount;
            System.out.println("New balance  " + balance );
        }
        else{
            System.out.println("Invalid withdraw");
        }
    }
    public String getaccoountholder(){
        return accountHolder;
    }
}
public class bank {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter account holder name");
        String accountholder= sc.nextLine();
        System.out.println("Enter balance");
        int ibalance=sc.nextInt();
        account acc= new account(accountholder,ibalance);
        while(true){
            System.out.println("\n1.Deposit\n2.Withdraw\n3.Check balance\n4.Exit");
            System.out.println("Enter  your choice (1/2/3/4):");
            int choice=sc.nextInt();
            if(choice==1){
                System.out.println("Enter deposit amount");
                int amount=sc.nextInt();
                acc.deposit(amount);
            }
            else if(choice ==2 ){
                System.out.println("Enter withdraw amount");
                int wamount =sc.nextInt();
                acc.withdraw(wamount);
            }
            else if(choice==3){
                System.out.println("Account holder " + acc.getaccoountholder());
                System.out.println("balance  is "+ acc.getbalance());
            }
            else if(choice==4){
                System.out.println("Thank you");
            }
            else{
                System.out.println("Invalid choice");
            }
        }  
    }
}