package command.invokers;

import command.ICommand;

public class InvokerOne {

    ICommand one;
    ICommand two;
    ICommand three;
    ICommand four;

    public InvokerOne(ICommand one, ICommand two, ICommand three, ICommand four) {
        this.one = one;
        this.two = two;
        this.three = three;
        this.four = four;
    }

    public void executeOne() {
        this.one.execute();
    }

    public void executeTwo() {
        this.two.execute();
    }

    public void executeThree() {
        this.three.execute();
    }
    
    public void executeFour() {
        this.four.execute();
    }

}
