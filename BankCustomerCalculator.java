package calculator;//package Bank;

import calculator.AdvancedCalculator;

import static java.lang.System.exit;

public class BankCustomerCalculator extends AdvancedCalculator implements BankCustomer {
            double balance;

         public void menu(){
             AdvancedCalculator advancedCalculator=new AdvancedCalculator();
             System.out.println("–––––––––––––––––––––––––Welcome––––––––––––––––––––––––");
             System.out.println("––––––––––––––––Bank-Customer-Calculator––––––––––––––––");
             System.out.println("1:  Deposit\n" +
                                    "2:  Withdraw\n"+
                                        "3:  Current Balance\n"+
                           "0:  Exit");
             System.out.print("\nChoose option(1-3(0-EXIT)(101-BACK)): ");
             int number = scanner.nextInt();

             if(number==0){
                 exit(0);
             }else if(number==101){
                 advancedCalculator.chooseOption();
             } else{
                 switch (number) {
                     case 1 -> {
                         setDeposit();
                         menu();
                     }
                     case 2 -> {
                         try {
                             withdraw();
                         }catch (Exception e){
                             System.out.println(e.getMessage());
                         }
                         menu();
                     }
                     case 3 -> {
                         System.out.println("Your current balance is: ");
                         currentBalance();
                         menu();
                     }
                     default -> {
                         System.out.println("Invalid choice!!!");
                         menu();
                     }
                 }
             }
    }


    public void currentBalance() {
             System.out.print(this.balance+"\n");
        //             return this;
}
    public void setDeposit() {
             double amount;
             System.out.print("Enter your deposit: ");
             amount=scanner.nextDouble();
        if(amount>0) {
            this.balance+=amount;
        }
    }


    /**
     * Withdraw the given amount from current balance
     * @throws Exception if the balance is less then amount
     */

    public void withdraw() throws Exception {
        double amount;
        System.out.println("Enter your withdraw: ");
        amount=scanner.nextDouble();
        if(amount>this.balance) {
            throw new Exception("Amount is greater the current balance");
        }
        this.balance-=amount;
    }
}


