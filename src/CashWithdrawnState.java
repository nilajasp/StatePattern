/**
 * Created by nilajapatankar on 2/11/15.
 */
public class CashWithdrawnState extends ATMState {
    public CashWithdrawnState(double availableAmount) {
        super(availableAmount);
    }

    @Override
    public ATMState NextStep() {
        System.out.println("Do you want to continue?(y/n)");
        if(ATMUserInputScanner.nextLine().equalsIgnoreCase("y"))
            return new CardValidatedState(AvailableAmount);
        else
            return new NoCardState(AvailableAmount);
    }
}
