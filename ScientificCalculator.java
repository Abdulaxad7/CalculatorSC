package calculator;

import calculator.AdvancedCalculator;

import static java.lang.System.exit;


public class ScientificCalculator extends AdvancedCalculator implements Scientific {

    public void menu(){

        AdvancedCalculator advancedCalculator=new AdvancedCalculator();
        System.out.println("––––––––––––––––––––––––Welcome––––––––––––––––––––––");
        System.out.println("––––––––––––––––Scientific–Calculator––––––––––––––––");

        System.out.println("1:  Finding √x" + "\t\t\t\t\t\t6:\tFinding cot(x)\n"+
                              "2:  Finding x^y"+"\t\t\t\t\t\t7:\tFinding ∑x\n"+
                                 "3:  Finding sin(x)"+"\t\t\t\t\t8: \tFinding ln(x)\n"+
                                    "4:  Finding cos(x)"+"\t\t\t\t\t9: \tFinding x!\n"+
                                        "5:  Finding tan(x)"+"\t\t\t\t\t10:\tFinding e^x\n"+

                "0:  Exit");
        System.out.print("\nChoose option(1-10(0-EXIT)(101-BACK)): ");
        int number = scanner.nextInt();

        if(number==0){
        exit(0);
    } else if(number==101){
            advancedCalculator.chooseOption() ;
        }
        else{
        switch (number) {
            case 1 -> {

                System.out.println("Calculating √x"+"\n");
                System.out.println(CalculateRoot()+"\n\n");
                menu();
            }
            case 2 -> {

                System.out.println("Calculating x^y"+"\n");
                System.out.println(CalculatePower()+"\n\n");
                menu();
            }
            case 3 -> {

                System.out.println("Calculating Sin(x)"+"\n");
                CalculateSin();System.out.println("\n\n");
                menu();
            }
            case 4 -> {

                System.out.println("Calculating Cos(x)"+"\n");
                CalculateCos();System.out.println("\n\n");
                menu();
            }
            case 5 -> {

                System.out.println("Calculating tan(x)"+"\n");
                CalculateTan();System.out.println("\n\n");
                menu();
            }
            case 6-> {

                System.out.println("Calculating cot(x)"+"\n");
                CalculateCot();System.out.println("\n\n");

                menu();
            }
            case 7-> {

                System.out.println("Calculating ∑(x)"+"\n");
                System.out.println(CalculateSumOf()+"\n\n");

                menu();
            }
            case 8-> {

                System.out.println("Calculating ln(x)"+"\n");
                CalculateLn();System.out.println("\n\n");
                menu();
            }
            case 9-> {
                System.out.println("Calculating x!"+"\n");
               System.out.println(CalculateFactorial()+"\n\n");
                menu();
            }
            case 10-> {

                System.out.println("Calculating exp(x)"+"\n");
                CalculateExp();System.out.println("\n\n");
                menu();
            }
            default -> {
                System.out.println("Invalid choice!!!");
                menu();
               }
           }
        }
    }


   public double CalculateRoot(){
        System.out.print("Enter the root element: ");
        double element=scanner.nextDouble();
        System.out.println();
        System.out.print("Enter the root index: ");
        double index=scanner.nextDouble();
        System.out.println();
        int guess=1;
        double epsilon=1e-6;
        return Root(element,index,guess,epsilon);
    }
   private double Root(double n, double index, int guess, double epsilon) {
        if (Math.abs(Math.pow(guess, index) - n) < epsilon) {
            return guess;
        }
        return Root(n, index, (int) ((index * guess + n / Math.pow(guess, index - 1)) / (index + 1)), epsilon);
    }





     public double CalculatePower(){
        System.out.print("Enter base: ");
        int base=scanner.nextInt();
        System.out.println();
        System.out.print("Enter power: ");
        int power=scanner.nextInt();
        System.out.println();
        return Power(base,power);
    }
    private long  Power(int base,int power ){

  if(power>0) {

      return base * Power(base, power - 1);
  }else {
      base/=base;

      return base;
  }
    }




    public void CalculateSin(){
        double x;
        System.out.println("Enter the value of x (in radians): ");
        x=scanner.nextDouble();

        double sin_x = sin(x,10);
        System.out.println("sin(" +x+ ") = " + sin_x );

    }
    private double sin(double x,int n) {
        if (n == 0) {
            return x;
        }
            else{

                double term = (Math.pow(-1, n) * Math.pow(x, 2 * n + 1)) / Factorial(2 * n + 1);
                return sin(x, n - 1) + term;
            }
        }

       public double CalculateFactorial(){
            System.out.println("Enter the n_th element of factorial:");
            int n=scanner.nextInt();
            return Factorial(n);
        }
       private int Factorial(int n){
        if(n==0){
            return 1;
        }else{
            return n*Factorial(n-1);
        }
    }

    public void CalculateCos(){
        double x;
        System.out.println("Enter the value of x (in radians): ");
        x=scanner.nextDouble();

        double cos_x = cos(x,10);
        System.out.println("cos(" +x+ ") = " + cos_x );
    }

    private double cos(double x,int n){
        if (n == 0) {
            return x;
        }
        else{

            double term = (Math.pow(-1, n) * Math.pow(x, 2 * n )) / Factorial(2 * n );
            return cos(x, n - 1) + term;
        }
    }

    public void CalculateTan(){
        double x;
        System.out.println("Enter the value of x (in radians): ");
        x=scanner.nextDouble();

        double tan_x = tan(x,10);
        System.out.println("tan(" +x+ ") = " + tan_x );

    }
    private double tan(double x,int n){
       double term;
        term = sin(x,n)/cos(x,n);
        return term;
    }


    public void CalculateCot(){
        double x;
          System.out.println("Enter the value of x (in radians): ");
        x=scanner.nextDouble();

         double cot_x = cot(x,10);
         System.out.println("cot(" +x+ ") = " + cot_x );
    }
        private double cot(double x,int n){
            double term;
               term = 1/tan(x,n);
            return term;
    }
    public double CalculateSumOf(){
        System.out.print("Enter the last number of ∑:");
        int last=scanner.nextInt();
         return Sum(last);
        }
        private    double Sum(int last){
            if(last>0) return last + Sum(last - 1);
            else if(last<0) return last + Sum(last + 1);
        return last;
        }




   public void CalculateLn(){
        double x;
        System.out.println("Enter the value of x : ");
        x=scanner.nextDouble();

        double ln_x = ln(x,15);
        System.out.println("ln(" +x+ ") = " + ln_x );
    }

    private double ln(double x,int n){
        if (n == 0) {
            return x;
        }
        else{

            double term = (Math.pow(-1, n) * Math.pow(x-1,  n + 1 )) /(n+1);
            return ln(x, n - 1) + term;
        }
    }




public void CalculateExp(){
    double x;
    System.out.println("Enter the value of x : ");
    x=scanner.nextDouble();

    double exp_x = exp(x,15);
    System.out.println("e^" +x+ " = " + exp_x );
}
    private double exp(double x,int n){
        if (n == 0) {
           return x;
        }
        else{
              double term = (Math.pow(x, n)  /Factorial(n));
               return exp(x, n - 1) + term;
        }
}


    }

