import java.util.Scanner;

/**
 * Created by nilajapatankar on 2/11/15.
 */
public abstract class ATMState {
    public double AvailableAmount;
    public Scanner ATMUserInputScanner;
    public ATMState(double availableAmount)
    {
        ATMUserInputScanner = new Scanner(System.in);
        AvailableAmount = availableAmount;
    }
    public abstract ATMState NextStep();
}
