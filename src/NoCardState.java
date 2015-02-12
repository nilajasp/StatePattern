/**
 * Created by nilajapatankar on 2/11/15.
 */
public class NoCardState extends ATMState {
    public NoCardState(double availableAmount) {
        super(availableAmount);
    }

    @Override
    public ATMState NextStep() {
        System.out.println("Please Enter your Pin");
        String userInput = ATMUserInputScanner.nextLine();
        if (userInput.matches("1234"))
        {
            return new CardValidatedState(AvailableAmount);
        }
        System.out.println("Invalid PIN");
        return this;
    }
}
