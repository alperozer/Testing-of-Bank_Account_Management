import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BankMain {
	
	    
    private static ArrayList<Account> accountList = new ArrayList<>();
    private static Account selectedAccount;
    private static boolean flag = false;
    private static int enteredDeposit;
    private static int enteredWithdraw;
	private static Scanner input;
        

    public static void displayMenu(){

        System.out.println("Please enter [1] to Create Account");
        System.out.println("Please enter [2] to Select Account");
        System.out.println("Please enter [3] to Delete Account");
        System.out.println("Please enter [4] to Deposit Account");
        System.out.println("Please enter [5] to Withdraw Money");
        System.out.println("Please enter [6] to Check Balance");
        System.out.println("Please enter [7] to Exit \n");

        
    }

    public static void main(String[] args) {
    	   	
     input = new Scanner(System.in);
        
        displayMenu();
      
             
        Account account = null;
        while (true) {
            System.out.println("Please Don't Forget Select Your Account");
            System.out.println("Enter your choice :"); // indicator for user input
            int choice = input.nextInt();
           
            //Options
            switch (choice) {
                case 1 : 
                    // Create new account
                	String accName;
                    int accNo = 0;
                    int bal = 0;
                    
                    System.out.println("Enter your account name : ");
                    accName = input.next();
                    System.out.println("Enter account number : ");
                    accNo = input.nextInt();
                    System.out.println("Enter initial balance: ");
                    bal = input.nextInt();
                    
                    System.out.println("Your new account name is: " + accName);
                    System.out.println("Your new account number is: " + accNo);
                    System.out.println("Your new account balance is: " + bal);

                    account = new Account(accName, accNo, bal);
                    accountList.add(account);
                    break;
                    
                case 2 :
                    // select account
                    System.out.println("Enter account number for further operations : ");
                    int selectedAccNumber = input.nextInt();
                    System.out.println("Selected account : " + selectedAccNumber);
                    for (Object object : accountList) {
                        selectedAccount = (Account) object;
                        if (selectedAccount.getAccNumber() == selectedAccNumber) {
                            flag = true;
                            break;
                        }else {
                            flag = false;
                        }
                    }
                    if (!flag) {
                        System.out.println("Account doesn't exists.");
                    }
                    if (accountList.size() == 0) {
                        System.out.println("Zero account exists.");
                    }
                    break;
                    
                case 3 :
                    // close account
                    System.out
                        .println("Enter account number for further operations : ");
                     selectedAccNumber = input.nextInt();
                    System.out.println("Selected account : " + selectedAccNumber);
                    Iterator<Account> iterator = accountList.iterator();
                    while (iterator.hasNext()) {
                        selectedAccount = (Account) iterator.next();
                        if (selectedAccount.getAccNumber() == selectedAccNumber) {
                            iterator.remove();
                            flag = true;
                            break;
                        }
                    }
                    if (!flag) {
                        System.out.println("Account doesn't exists.");
                    }
                    System.out.println("Account " + selectedAccNumber + " closed.");
                    break;
                    
                case 4 :
                    // Deposit amount
                    System.out.println("Enter amount to deposit :");
                     enteredDeposit = input.nextInt();
                    if (enteredDeposit <= 0) {
                        System.out.println("You must deposit an amount greater than 0.");
                    } 
                    else {
                        if (flag) {
                            selectedAccount.depositMoney(enteredDeposit);
                            System.out.println("You have deposited " + enteredDeposit);
                            System.out.println("Total balance is : " + (selectedAccount.getBalance()));   
                        }else {
                            System.out.println("Please select account number.");
                        }
                    }
                    break;
                    
                case 5 :
                    // Withdraw amount
                    System.out.println("Enter amount to be withdrawn: ");
                     enteredWithdraw = input.nextInt();
                    if (enteredWithdraw > account.getBalance() && enteredWithdraw <= 0) {
                        System.out.println("You can't withdraw that amount!");
                    }else if (enteredWithdraw <= selectedAccount.getBalance()) {
                        if (flag) {
                            selectedAccount.withdrawMoney(enteredWithdraw);
                            System.out.println("You have withdrawed : " + enteredWithdraw);
                            System.out.println("Your new balance is :" + selectedAccount.getBalance() );
                                
                        }else {
                            System.out.println("Please select account number.");
                        }
                    }
                    break;
                    
                case 6 :
                    // check balance in selected account
                    if (flag) {
                        System.out.println("Your current account balance : " + selectedAccount.getBalance());
                    }else {
                        System.out.println("Please select account number.");
                    }
                    break;
                    
                case 7 :
                    // quit
                    System.out.println("Thank You!");
                    flag = false;
                    input.close();
                    input.close();
                    System.exit(0);
                    break;
                    
                    default : System.out.println("You choose wrong number from menu");
                    		  System.out.println("Please try again!!\n");

            }
        } 
    }
}