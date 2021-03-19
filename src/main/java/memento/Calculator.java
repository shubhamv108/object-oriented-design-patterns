package memento;

public class Calculator implements ICalculator {

    private int firstNumber;
    private int secondNumber;

    @Override
    public IPreviousCalculationToCareTaker backUpLastCalculation() {
        return new PreviousCalculation(this.getFirstNumber(), this.getSecondNumber());
    }

    @Override
    public void restorePreviousCalculation(final IPreviousCalculationToCareTaker memento) {
        this.firstNumber  = ((IPreviousCalculationToOriginator) memento).getFirstNumber();
        this.secondNumber = ((IPreviousCalculationToOriginator) memento).getSecondNumber();
    }

    @Override
    public void setFirstNumber(final int firstNumber) {
        this.firstNumber = firstNumber;
    }

    @Override
    public void setSecondNumber(final int secondNumber) {
        this.secondNumber = secondNumber;
    }

    @Override
    public int getSum() {
        return this.getFirstNumber() + this.getSecondNumber();
    }

    public int getFirstNumber() {
        return this.firstNumber;
    }

    public int getSecondNumber() {
        return this.secondNumber;
    }
}
