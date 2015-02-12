/**
 * Created by nilajapatankar on 2/11/15.
 */
public class ATM {
    private ATMState currentState;

    public ATM()
    {
        int availableAmount = 100000;
        currentState = new NoCardState(availableAmount);
    }

    public void Use() {
        while (true)
            currentState = currentState.NextStep();
    }
}
