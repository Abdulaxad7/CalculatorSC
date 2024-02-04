package calculator;

public interface Calculator {
   void setValue();
     String CalculateSum();
     String CalculateSubtract();
     String CalculateMultiply();
     String CalculateDivide();
}
interface BankCustomer{
    void currentBalance() ;
    void setDeposit();
    void withdraw() throws Exception;
    void menu();

}
 interface Scientific{
    void menu();
    double CalculateRoot();
    double CalculatePower();
    void CalculateSin();
    void CalculateCos();
    void  CalculateTan();
    void CalculateCot();
    double CalculateSumOf();
    void CalculateLn();
    double CalculateFactorial();
    void CalculateExp();
        }
