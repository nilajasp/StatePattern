/**
 * Created by nilajapatankar on 2/11/15.
 */
public class CardValidatedState extends ATMState {
    public CardValidatedState(double availableAmount) {
        super(availableAmount);
    }

    @Override
    public ATMState NextStep() {
        System.out.println("Enter amount");
        double requestAmount = Double.parseDouble(ATMUserInputScanner.nextLine());
        if (AvailableAmount < requestAmount) {
            System.out.println("Amount not present");
            return this;
        }

        this.AvailableAmount -= requestAmount;
        return new CashWithdrawnState(AvailableAmount);
    }
}
