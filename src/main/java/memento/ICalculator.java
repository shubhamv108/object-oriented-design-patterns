package memento;

public interface ICalculator {

    IPreviousCalculationToCareTaker backUpLastCalculation();

    void restorePreviousCalculation(IPreviousCalculationToCareTaker memento);

    void setFirstNumber(int firstNumber);

    void setSecondNumber(int secondNumber);

    int getSum();
}
