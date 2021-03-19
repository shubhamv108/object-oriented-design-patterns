package memento;

public class CalculationDriver {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.setFirstNumber(10);
        calculator.setSecondNumber(100);

        System.out.println(calculator.getSum());

        IPreviousCalculationToCareTaker memento = calculator.backUpLastCalculation();

        calculator.setFirstNumber(17);
        calculator.setSecondNumber(-290);

        System.out.println(calculator.getSum());

        calculator.restorePreviousCalculation(memento);

        System.out.println(calculator.getSum());
    }

}
