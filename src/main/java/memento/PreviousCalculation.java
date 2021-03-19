package memento;

public class PreviousCalculation implements IPreviousCalculationToCareTaker, IPreviousCalculationToOriginator {
    private int firstNumber;
    private int secondNumber;

    public PreviousCalculation(final int firstNumber, final int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    @Override
    public int getFirstNumber() {
        return this.firstNumber;
    }

    @Override
    public int getSecondNumber() {
        return this.secondNumber;
    }
}
