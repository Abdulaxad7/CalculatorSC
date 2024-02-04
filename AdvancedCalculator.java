package calculator;

import java.util.Scanner;

import static java.lang.System.exit;

public class AdvancedCalculator implements Calculator {
    Scanner scanner=new Scanner(System.in);

    double  num;
    double num2;
    double ANSWER;

public void setValue(){
        System.out.print("Enter your first number: ");
        this.num=scanner.nextDouble();
        System.out.print("\nEnter your second number: ");

        this.num2=scanner.nextDouble();

    }
    public void chooseOption() {

                 BankCustomerCalculator bankCustomerCalculator=new BankCustomerCalculator();
                 ScientificCalculator scientificCalculator =new ScientificCalculator();
        System.out.println("––––––––––––––––MENU––––––––––––––––");
        System.out.println("1: Calculate Sum\n" +
                "2: Calculate Subtraction\n"+
                "3: Calculate Multiplication\n"+
                "4: Calculate Division\n"+
                "5: Scientific Calculator\n"+
                "6: Bank Customer Calculator\n"+
                "0: Exit");
        System.out.print("\nChoose option(1-6(0-EXIT)): ");
        int number = scanner.nextInt();

        if(number==0){
            exit(0);
        } else{
            switch (number) {
                case 1 -> {
                    System.out.println("Calculating Sum:\n");
                    setValue();
                    System.out.println(CalculateSum()+"\n\n");
                    chooseOption();
                }
                case 2 -> {
                    System.out.println("Calculating subtraction:\n");
                    setValue();
                    System.out.println(CalculateSubtract()+"\n\n");
                    chooseOption();
                }
                case 3 -> {
                    System.out.println("Calculating multiplication:\n");
                    setValue();
                    System.out.println(CalculateMultiply()+"\n\n");
                    chooseOption();
                }
                case 4 -> {
                    System.out.println("Calculating division:\n");
                    setValue();
                    System.out.println(CalculateDivide()+"\n\n");
                    chooseOption();
                }
                case 5 -> {
//                    System.out.println("Scientific Calculator:\n");
                    scientificCalculator.menu();
                    System.out.println(CalculateDivide()+"\n\n");
                    chooseOption();
                }
                case 6-> {
//                    System.out.println("Bank Customer Calculator:\n");
                   bankCustomerCalculator.menu();
                    System.out.println(CalculateDivide()+"\n\n");
                    chooseOption();
                }
                default -> {
                    System.out.println("Invalid choice!!!");
                    chooseOption();
                }
            }
        }
    }

    public String CalculateSum(){
        ANSWER=this.num+this.num2;
        return "THE RESULT:\t"+ this.num+" + "+ this.num2+"\t\tIS: "+ANSWER;
    }
    public String CalculateSubtract(){
        ANSWER= this.num-this.num2;
        return "THE RESULT:\t"+ this.num+" - "+ this.num2+"\tIS: "+ANSWER;
    }
    public String CalculateMultiply(){
        ANSWER=this.num*this.num2;
        return "THE RESULT:\t"+ this.num+" * "+ this.num2+"\t\tIS: "+ANSWER;
    }
    public String CalculateDivide(){
        try {
           if(num2!=0) {
               ANSWER = this.num / this.num2;
               return "THE RESULT:\t"+ this.num+" / "+ this.num2+"\t\tIS: "+ANSWER;
           }
        }catch (Exception exception) {
            return "Division is invalid!!!";
        }
        return null;
    }

    public double getValue(){
        return this.ANSWER;
    }

}
